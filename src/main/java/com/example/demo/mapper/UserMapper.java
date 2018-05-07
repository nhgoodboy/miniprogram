package com.example.demo.mapper;

import com.example.demo.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/11 13:54
 **/
@Mapper
public interface UserMapper {

    List<User> findUserInfo();

    int addUserInfo(User user);

    int delUserInfo(int id);

}
