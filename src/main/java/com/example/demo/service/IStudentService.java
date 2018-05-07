package com.example.demo.service;

import com.example.demo.domain.entity.Student;

import java.util.List;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/11 14:06
 **/
public interface IStudentService {

    List<Student> getStudentInfo();

    void insert(Student student);
}
