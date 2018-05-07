package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/12 15:01
 **/
@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("index")
    public String index(ModelMap map) {
        map.addAttribute("name", "thymeleaf-imooc");
        return "index";
    }
}
