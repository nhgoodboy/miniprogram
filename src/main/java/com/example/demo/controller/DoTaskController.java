package com.example.demo.controller;

import com.example.demo.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * Create with IDEA
 * Author: YJZ
 * DateTime: 2018/4/13 10:38
 **/
@RestController
@RequestMapping("tasks")
public class DoTaskController {

    private final AsyncTask asyncTask;

    @Autowired
    public DoTaskController(AsyncTask asyncTask) {
        this.asyncTask = asyncTask;
    }

    @RequestMapping("test")
    public String test() throws Exception {
        long start = System.currentTimeMillis();

        Future<Boolean> a = asyncTask.doTask11();
        Future<Boolean> b = asyncTask.doTask22();

        while (!a.isDone() || !b.isDone()) {
            if (a.isDone() && b.isDone()) {
                break;
            }
        }

        long end = System.currentTimeMillis();

        String times = "任务全部完成，总耗时：" + (end - start) + "毫秒";
        System.out.println(times);

        return times;
    }
}
