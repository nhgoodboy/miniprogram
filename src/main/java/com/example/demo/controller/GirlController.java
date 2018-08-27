package com.example.demo.controller;

import com.example.demo.domain.entity.Girl;
import com.example.demo.domain.entity.Result;
import com.example.demo.properties.GirlProperties;
import com.example.demo.repository.GirlRepository;
import com.example.demo.service.GirlService;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/girl")
public class GirlController {

    private final GirlProperties girlProperties;

    private final GirlService girlService;

    private final GirlRepository girlRepository;

    @Autowired
    public GirlController(GirlProperties girlProperties, GirlService girlService, GirlRepository girlRepository) {
        this.girlProperties = girlProperties;
        this.girlService = girlService;
        this.girlRepository = girlRepository;
    }

    @GetMapping("/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") int id) {
        return "Hello Spring Boot " + girlProperties.getCupSize() + "  " + id;
    }

    @GetMapping("/insert")
    public String insert() {
        girlService.insertTwo();
        return "ok.";
    }

    @GetMapping("/print")
    public String printTest() {
        return "hello, yjz, abc";
    }

    @PostMapping("/add")
    public Result girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());

        return ResultUtil.success(girlRepository.save(girl));
    }

    @GetMapping("girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) {
        girlService.getAge(id);
    }

    @GetMapping("/index")
    public String index() {
        System.out.println("start");
        return "index";
    }
}
