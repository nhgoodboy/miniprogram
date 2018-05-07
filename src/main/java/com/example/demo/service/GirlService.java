package com.example.demo.service;

import com.example.demo.domain.entity.Girl;
import com.example.demo.domain.enums.ResultEnum;
import com.example.demo.exception.GirlException;
import com.example.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girl1 = new Girl();
        girl1.setAge(19);
        girl1.setCupSize("B");
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setAge(20);
        girl2.setCupSize("A");
        girlRepository.save(girl2);
    }

    public Girl findOne(Integer id) {
        Optional<Girl> optional = girlRepository.findById(id);
        return optional.orElse(null);
    }

    public void getAge(Integer id) {
        Optional<Girl> optional = girlRepository.findById(id);
        Girl girl = optional.get();
        Integer age = girl.getAge();
        if(age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age > 10 && age < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    public Girl save(Girl girl) {
        return girlRepository.save(girl);
    }

}
