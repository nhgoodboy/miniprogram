package com.example.demo.service.impl;

import com.example.demo.domain.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/11 14:07
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;   //可正常运行

    @Override
    public List<User> getUserInfo(){
        return userMapper.findUserInfo();
    }

    @Override
    public void insert(User user) {
        userMapper.addUserInfo(user);
    }

}
