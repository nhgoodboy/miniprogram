package com.example.demo.service.impl;

import com.example.demo.domain.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/11 14:07
 **/
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;   //可正常运行

    @Override
    public List<Student> getStudentInfo(){
        return studentMapper.findStudentInfo();
    }

    @Override
    public void insert(Student student) {
        studentMapper.addStudentInfo(student);
    }

}
