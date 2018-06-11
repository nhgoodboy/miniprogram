package com.example.demo.controller;

import com.example.demo.iapppay.paytest.IAppPaySDKConfig;
import com.example.demo.iapppay.sign.SignHelper;
import com.example.demo.iapppay.utils.Notify;
import com.example.demo.service.IIapppayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.example.demo.iapppay.paytest.Order.H5orPCpay;

@RestController
@RequestMapping("/iapppay")
public class IapppayController {

    private final IIapppayService iapppayService;

    @Autowired
    public IapppayController(IIapppayService iapppayService) {
        this.iapppayService = iapppayService;
    }

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
        return iapppayService.server_order(waresId);
    }

    @GetMapping("/client_order")
    public String client_order(@RequestParam(value = "waresId") int waresId) {
        String transData = iapppayService.client_order(waresId);
        System.out.println(transData);
        return transData;
    }

    @GetMapping("/contract_query")
    public String contract_query(@RequestParam(value = "waresId") int waresId) {
        String resp = iapppayService.contract_query(waresId);
        System.out.println(resp + ".....");
        return resp;
    }

    @GetMapping("/contract_cancel")
    public String contract_cancel(@RequestParam(value = "waresId") int waresId) {
        String resp = iapppayService.contract_cancel(waresId);
        System.out.println(resp + ".....");
        return resp;
    }

    @PostMapping("/tradingResultsNotice")
    public String tradingResultsNotice(@Valid Notify notify){
        String transdata = notify.getTransdata();
        System.out.println(transdata);
        String sign = notify.getSign();
        System.out.println(sign);
        String signtype = notify.getSigntype();
        System.out.println(signtype);
        if (SignHelper.verify(transdata, sign, IAppPaySDKConfig.PLATP_KEY)) {
            System.out.println("verify ok");
            return "success";
        } else {
            System.out.println("verify fail");
            return "failure";
        }
    }
}
