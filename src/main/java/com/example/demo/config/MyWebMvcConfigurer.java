package com.example.demo.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/13 10:45
 **/
@Configuration
public class MyWebMvcConfigurer extends WebMvcAutoConfiguration {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
////        super.addResourceHandlers(registry);
//    }

}
