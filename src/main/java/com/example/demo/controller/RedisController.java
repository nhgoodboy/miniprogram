package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/9 22:27
 **/
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;

//    @Resource
//    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("test")
    public String test() {
//        redisTemplate.opsForValue().set("a", "123");
//        return redisTemplate.opsForValue().get("a");
        strRedis.opsForValue().set("imooc-cache", "hello 慕课网aaavvvoo");
        return strRedis.opsForValue().get("imooc-cache");
    }

}
