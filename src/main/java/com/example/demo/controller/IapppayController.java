package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.iapppay.utils.Notify;
import com.example.demo.service.IIapppayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.iapppay.paytest.Order.H5orPCpay;

@RestController
@RequestMapping("/iapppay")
public class IapppayController {

    @Autowired
    private IIapppayService iapppayService;

    @GetMapping("/order")
    public String order(@RequestParam(value = "waresId") int waresId) {
        System.out.println(waresId);
        String transId = iapppayService.order(waresId);
        System.out.println(transId);
        String url =  H5orPCpay(transId);
        System.out.println(url);
        return "\"" + url + "\"";
    }

    @PostMapping("/notify")
    public void notify(@Valid Notify notify){
        System.out.println(notify);
    }
}
