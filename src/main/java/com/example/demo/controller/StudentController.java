package com.example.demo.controller;

import com.example.demo.domain.entity.Student;
import com.example.demo.service.IStudentService;
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
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/getStudentInfo")
    public List<Student> getStudentInfo() {
        List<Student> student = studentService.getStudentInfo();
        System.out.println(student.toString());
        return student;
    }

    @GetMapping("/addStudentInfo")
    public String addStudentInfo() {
        Student student = new Student();
        student.setId(5L);
        student.setName("yjz");
        studentService.insert(student);
        return "success:" + student.toString();
    }
}
