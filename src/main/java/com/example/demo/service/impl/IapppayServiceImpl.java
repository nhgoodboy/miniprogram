package com.example.demo.service.impl;

import com.example.demo.iapppay.paytest.IAppPaySDKConfig;
import com.example.demo.service.IIapppayService;
import org.springframework.stereotype.Service;

import static com.example.demo.iapppay.paytest.Order.CheckSign;

@Service
public class IapppayServiceImpl implements IIapppayService {

    private static String transId;
    private static String notifyurl = "http://192.168.102.249:8081/iapppay/notify";

    @Override
    public String h5_order(int waresId) {

        String cporderid = String.valueOf(System.currentTimeMillis());
        transId = CheckSign(IAppPaySDKConfig.APP_ID, waresId, "一个银币", cporderid, 0.01f, "001",
                "test", notifyurl);
        return transId;
    }

    @Override
    public String pc_order(int waresId) {

        String cporderid = String.valueOf(System.currentTimeMillis());
        transId = CheckSign(IAppPaySDKConfig.APP_ID, waresId, "一个银币", cporderid, 0.01f, "001",
                "test", notifyurl);
        return transId;
    }

    @Override
    public String server_order(int waresId) {
        String cporderid = String.valueOf(System.currentTimeMillis());
        transId = CheckSign(IAppPaySDKConfig.APP_ID, waresId, "一个银币", cporderid, 0.01f, "001",
                "test", notifyurl);
        return transId;
    }
}