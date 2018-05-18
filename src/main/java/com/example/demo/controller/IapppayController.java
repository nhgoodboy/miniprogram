package com.example.demo.controller;

import com.example.demo.iapppay.utils.Notify;
import com.example.demo.service.IIapppayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.demo.iapppay.paytest.Order.H5orPCpay;

@RestController
@RequestMapping("/iapppay")
public class IapppayController {

    @Autowired
    private IIapppayService iapppayService;

    @GetMapping("/h5_order")
    public String h5_order(@RequestParam(value = "waresId") int waresId) {
        String transId = iapppayService.h5_order(waresId);
        String url =  H5orPCpay(transId, "h5");
        return "\"" + url + "\"";
    }

    @GetMapping("/pc_order")
    public String pc_order(@RequestParam(value = "waresId") int waresId) {
        String transId = iapppayService.pc_order(waresId);
        String url =  H5orPCpay(transId, "pc");
        return "\"" + url + "\"";
    }

    @GetMapping("/server_order")
    public String server_order(@RequestParam(value = "waresId") int waresId) {
        String transId = iapppayService.server_order(waresId);
        return transId;
    }

    @GetMapping("/client_order")
    public String client_order(@RequestParam(value = "waresId") int waresId) {
        String transData = iapppayService.client_order(waresId);
        System.out.println(transData);
        return transData;
    }

    @PostMapping("/notify")
    public void notify(@Valid Notify notify){
        System.out.println(notify);
    }
}
