package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/13 10:10
 **/
@Component
public class TestTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 300000)   // http://cron.qqe2.com/  在线cron表达式生成器  springboot只支持6位
    public void reportCurrentTime() {
        System.out.println("现在时间: " + dateFormat.format(new Date()));
    }

}
