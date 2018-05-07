package com.example.demo.controller;

import com.example.demo.domain.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/11 14:24
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUserInfo")
    public List<User> getUserInfo() {
        List<User> user = userService.getUserInfo();
        System.out.println(user.toString());
        return user;
    }

    @GetMapping("addUserInfo")
    public String addUserInfo() {
        User user = new User();
        user.setId(5L);
        user.setName("yjz");
        userService.insert(user);
        return "success:" + user.toString();
    }
}
