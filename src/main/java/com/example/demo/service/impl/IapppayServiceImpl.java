package com.example.demo.service.impl;

import com.example.demo.iapppay.paytest.IAppPaySDKConfig;
import com.example.demo.service.IIapppayService;
import org.springframework.stereotype.Service;

import static com.example.demo.iapppay.paytest.Order.CheckSign;
import static com.example.demo.iapppay.paytest.Order.GetTransData;

@Service
public class IapppayServiceImpl implements IIapppayService {

    private static String transId;
    private static String notifyurl = "http://192.168.102.249:8081/iapppay/notify";

    @Override
    public String h5_order(int waresId) {

        String cporderid = String.valueOf(System.currentTimeMillis());
        transId = CheckSign(IAppPaySDKConfig.APP_ID, waresId , "传入型asd商品", cporderid, 0.01f, "001",
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
        String respData = "transid=" + transId + "&appid=" + IAppPaySDKConfig.APP_ID;
        return respData;
    }

    @Override
    public String client_order(int waresId) {
        String cporderid = String.valueOf(System.currentTimeMillis());
        String transData = GetTransData(IAppPaySDKConfig.APP_ID, IAppPaySDKConfig.WARES_ID_1, "测试银币", cporderid, 0.01f,
                "0002", "testclientOrderOne", notifyurl);
        return transData;
    }

    @Override
    public String contract_query(int waresId) {
        return com.example.demo.iapppay.paytest.QueryContract.CheckSign(IAppPaySDKConfig.APP_ID, "001", 2);
    }

    @Override
    public String contract_cancel(int waresId) {
        return com.example.demo.iapppay.paytest.ContractCancel.CheckSign(IAppPaySDKConfig.APP_ID, "001", 2);
    }
}