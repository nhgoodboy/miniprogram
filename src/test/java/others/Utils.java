package others;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.iapppay.paytest.HttpUtils;
import com.example.demo.iapppay.paytest.IAppPaySDKConfig;
import com.example.demo.iapppay.paytest.SignUtils;
import com.example.demo.iapppay.sign.SignHelper;
import org.junit.Test;
import org.springframework.util.DigestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

/**
 * 技术支持小工具
 */
public class Utils {

    /**
     * MD5值校验
     * @throws IOException
     */
    @Test
    public void checkMD5() throws IOException {
        String value = DigestUtils.md5DigestAsHex(new FileInputStream("C:\\Users\\Administrator\\Documents\\Tencent Files\\2937305839\\FileRecv\\1234qwe.apk"));
        String originalValue = "";
        System.out.println(value);
        System.out.println(originalValue.equals(value));
    }

    /**
     * 数据一致性检查
     */
    @Test
    public void equalData(){
        String a = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALxm3loXZxegwNwhR+fMQkDSeJtH10WzfAi+ttxbcxW4Zlh4LslHN6lyt08rDeX2u+H6zYiW67nHklVxc2tilXqyYx4KfB+DvkbtAx9AP1HxVRvEWREbI5LLQHS0IbcXfTXb9G1kv9mBYWl6bS3XRCER5rj7UX2j2EMGqCYlKwxZAgMBAAECgYAx2RXjyGVifwoINFYOIqE0/XsjurJeosqilbNUQm4ExTFvHv1iDBHSJ6QQslePDOVROUbAaQ4drYwuR0I+m2rpAuC2cAvsw8QTTPKsAXZu97nyuHKlNSE0R/ORHA8odxN4ETnK+OHSBp+UVJjKxGgIHZd24HuLgVWYRWUtzi04cQJBAPbBwMbfrlbC0St7fWrkJiPUHAOcp51LK45cVtsp0s6reP9Mz5AxbvkU1MmbnsUSPeoPr3dLboZGWWKkNpbWVbsCQQDDdYbTukCjQWTZ8vqH5moh0d3/X1F1uCOLb3gHYYgvmqcepl+bUjJso1jOn9g4t0h3+5W2EN27s26HDrIH8Br7AkAq8QroURLY3GxkQchQqsWMZKQ/aKqur98zlhQzbbLW7nZPD4HrmP6z8BEbyK43o3YM3o/tlb31NhbmGKe7Vi9zAkEAgdDh7meKnKNHHzYwzOfs329quTyOdtgIy4gKOSS+9ZcKneG0KA2srdjDl+A0FF8uw3mV0mlbS1n987d/6KPA1wJAddM+WO4vAtJ1Q4WhWHdkwilbWaxJlJ/Z5oMPYDAbNLLWAucoLWkEM4eqAzA8ioDq+gMHINrhSD7jgnjTKEHZGw==";
        String b = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALxm3loXZxegwNwhR+fMQkDSeJtH10WzfAi+ttxbcxW4Zlh4LslHN6lyt08rDeX2u+H6zYiW67nHklVxc2tilXqyYx4KfB+DvkbtAx9AP1HxVRvEWREbI5LLQHS0IbcXfTXb9G1kv9mBYWl6bS3XRCER5rj7UX2j2EMGqCYlKwxZAgMBAAECgYAx2RXjyGVifwoINFYOIqE0/XsjurJeosqilbNUQm4ExTFvHv1iDBHSJ6QQslePDOVROUbAaQ4drYwuR0I+m2rpAuC2cAvsw8QTTPKsAXZu97nyuHKlNSE0R/ORHA8odxN4ETnK+OHSBp+UVJjKxGgIHZd24HuLgVWYRWUtzi04cQJBAPbBwMbfrlbC0St7fWrkJiPUHAOcp51LK45cVtsp0s6reP9Mz5AxbvkU1MmbnsUSPeoPr3dLboZGWWKkNpbWVbsCQQDDdYbTukCjQWTZ8vqH5moh0d3/X1F1uCOLb3gHYYgvmqcepl+bUjJso1jOn9g4t0h3+5W2EN27s26HDrIH8Br7AkAq8QroURLY3GxkQchQqsWMZKQ/aKqur98zlhQzbbLW7nZPD4HrmP6z8BEbyK43o3YM3o/tlb31NhbmGKe7Vi9zAkEAgdDh7meKnKNHHzYwzOfs329quTyOdtgIy4gKOSS+9ZcKneG0KA2srdjDl+A0FF8uw3mV0mlbS1n987d/6KPA1wJAddM+WO4vAtJ1Q4WhWHdkwilbWaxJlJ/Z5oMPYDAbNLLWAucoLWkEM4eqAzA8ioDq+gMHINrhSD7jgnjTKEHZGw==";
        System.out.println(a.equals(b));
        System.out.println(b.length());
    }

    /**
     * url编码&解码
     */
    @Test
    public void urlEncodeOrDecode() throws UnsupportedEncodingException {
        String content = "transdata=%7B%22code%22%3A1002%2C%22errmsg%22%3A%22%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E9%94%99%E8%AF%AF%22%7D";
//        System.out.println(URLEncoder.encode(content, "UTF-8"));
        System.out.println(URLDecoder.decode(content, "UTF-8"));
        System.out.println();
    }

    /**
     * 数据验签
     */
    @Test
    public void verify() {
//        String content = "{\"appid\":\"3020117837\",\"appuserid\":\"728760\",\"cporderid\":\"CCMJ201883012700372\",\"cpprivate\":\"\",\"currency\":\"RMB\",\"feetype\":0,\"money\":1.00,\"paytype\":401,\"result\":0,\"transid\":\"32931808301505006030\",\"transtime\":\"2018-08-30+15:05:18\",\"transtype\":0,\"waresid\":1}";
        String platp_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCKIbEJirsyLMqYZKNIsR0bmqnwtPluyE5UHrCkR4rfLoq1cIAVzFVsr7hnOTR3FJWAtyJGPNPXaK4eSQXZk3J595uD9uFfYihPP62orozQWhePmWu0McAdRf0xfJGcajZEarcnpgNXWNrDdm9M6QWHiW65PowXvKUJGBRHa6ZJswIDAQAB";

//        Map<String, String> reslutMap = SignUtils.getParmters(content);
//        String signtype = reslutMap.get("signtype"); // "RSA";
//        if (signtype != null) {
//            if (SignHelper.verify(reslutMap.get("transdata"), reslutMap.get("sign"), platp_key)) {
//                System.out.println("transdata: " + reslutMap.get("transdata"));
//                System.out.println("sign: " + reslutMap.get("sign"));
//                System.out.println("verify ok");
//            } else {
//                System.out.println("verify fail");
//            }
//        }

        String transdata = "{\"appid\":\"3020117837\",\"appuserid\":\"728760\",\"cporderid\":\"CCMJ201883012700372\",\"cpprivate\":\"\",\"currency\":\"RMB\",\"feetype\":0,\"money\":1.00,\"paytype\":401,\"result\":0,\"transid\":\"32931808301505006030\",\"transtime\":\"2018-08-30+15:05:18\",\"transtype\":0,\"waresid\":1}";
//        String transdata = "{\"appid\":\"3020117837\",\"appuserid\":\"728760\",\"cporderid\":\"CCMJ201883012700372\",\"cpprivate\":\"\",\"currency\":\"RMB\",\"feetype\":0,\"money\":1.00,\"paytype\":401,\"result\":0,\"transid\":\"32931808301505006030\",\"transtime\":\"2018-08-30 15:05:18\",\"transtype\":0,\"waresid\":1}";
//        String sign = "FB3VBgq+vf4ywDGq65q9p1VTMAaczQwr2z5HThn07EBRrlKcgF5lo9X290WOUaG120CJFumpoyMBZ7BC1Q1F3XMTH7ZcZMRJGWzBUxhu8d82SXZDJFx8d6ud1zpxZ2tx5S15F4zgRkSTxEo0lUms/+jl/PdG72GkfBCkWweCD7Q";
        String sign = "FB3VBgq+vf4ywDGq65q9p1VTMAaczQwr2z5HThn07EBRrlKcgF5lo9X290WOUaG120CJFumpoyMBZ7BC1Q1F3XMTH7ZcZMRJGWzBUxhu8d82SXZDJFx8d6ud1zpxZ2tx5S15F4zgRkSTxEo0lUms/+jl/PdG72GkfBCkWweCD7Q=";

        if (SignHelper.verify(transdata, sign, platp_key)) {
            System.out.println("verify ok");
        } else {
            System.out.println("verify fail");
        }
    }

    /**
     * 生成签名
     *
     * @throws UnsupportedEncodingException
     */
    @Test
    public void sign() throws UnsupportedEncodingException {
        String appid = "5002044689";
        String privateKey_pkcs1 = "MIICXwIBAAKBgQDTbx9NZ/ES7GZfTJE/c0vYnuc5CvmYxMsqKXI4y8inQ1SGlX6PWDaB/cwVv1sxK5o1wvKybGSwvZI5sxcSvLJpJmFOhvX0UMj3y76eLAO2VwZTeJL3/uGoyLrWO2WasjnOGHrZvcvfhrQOj87+9iC89GNt3IVU+iplOZfGIYLlmwIDAQABAoGBAIuejLAj3EjfvLZfrGaW71XrkMrVWX8tLO/5kIi64RS63H1HCN0FpnDutK8DvudYYKvxwSxbcZ5YgNADWFAyNSkQBZgESbVbaM63PGN/keI7Kep0o2jgwsWXhNoPH5Q7nSaLgIH5oAq/SzhC0Zo6KR7j1BsihozUfwq+vRDQ5vBRAkEA/md8AGsoMj8gDTQtOAdLP8qsQCvZxhZQd4kNt4hOJ9L0rD+FHUyj4wesLQvDT3sEOL0oIUfrWjG9YaXTtRNdyQJBANTCozWIWzxAHNj4WD0lK6puNtev5dppGajjK5qTY90k06hHS2j1Fr49U13M6QnDcLCbAnzODa0IgedQe7tLikMCQQDOc6xtqog0PoYEMROBJGosmoyuhudzmSgz2UUIa9UA/HESV3nvDQLyeod/Bsy481u5r8ehOnwD9dl6JNhpWg4BAkEAjunnI7BiSIhwWDYJX5k2SZca86rN5PYwLEfcJErZC9UO77xkJS5shoE/HITmDI7hhV+6PgdTHGXYjH59foPxbQJBAMZt8F9VnlqlePQcSdXePPS0moCTwdd9/eaVAV33RVrW7hCMs7UypZqx/G9gwYOiDzIwI9SVALEl0SyBPBCghjc=";
        String privateKey_pkcs8 = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALxm3loXZxegwNwhR+fMQkDSeJtH10WzfAi+ttxbcxW4Zlh4LslHN6lyt08rDeX2u+H6zYiW67nHklVxc2tilXqyYx4KfB+DvkbtAx9AP1HxVRvEWREbI5LLQHS0IbcXfTXb9G1kv9mBYWl6bS3XRCER5rj7UX2j2EMGqCYlKwxZAgMBAAECgYAx2RXjyGVifwoINFYOIqE0/XsjurJeosqilbNUQm4ExTFvHv1iDBHSJ6QQslePDOVROUbAaQ4drYwuR0I+m2rpAuC2cAvsw8QTTPKsAXZu97nyuHKlNSE0R/ORHA8odxN4ETnK+OHSBp+UVJjKxGgIHZd24HuLgVWYRWUtzi04cQJBAPbBwMbfrlbC0St7fWrkJiPUHAOcp51LK45cVtsp0s6reP9Mz5AxbvkU1MmbnsUSPeoPr3dLboZGWWKkNpbWVbsCQQDDdYbTukCjQWTZ8vqH5moh0d3/X1F1uCOLb3gHYYgvmqcepl+bUjJso1jOn9g4t0h3+5W2EN27s26HDrIH8Br7AkAq8QroURLY3GxkQchQqsWMZKQ/aKqur98zlhQzbbLW7nZPD4HrmP6z8BEbyK43o3YM3o/tlb31NhbmGKe7Vi9zAkEAgdDh7meKnKNHHzYwzOfs329quTyOdtgIy4gKOSS+9ZcKneG0KA2srdjDl+A0FF8uw3mV0mlbS1n987d/6KPA1wJAddM+WO4vAtJ1Q4WhWHdkwilbWaxJlJ/Z5oMPYDAbNLLWAucoLWkEM4eqAzA8ioDq+gMHINrhSD7jgnjTKEHZGw==";
        String content = "{\"appid\":\"50021282\",\"appuserid\":\"7017\",\"cporderid\":\"201809051940273901707017\",\"currency\":\"RMB\",\"price\":12.00,\"waresid\":1,\"waresname\":\"120000金币\"}";

        String sign = SignHelper.sign(content, privateKey_pkcs8);
        String urlencodeSign = URLEncoder.encode(sign, "UTF-8");
        String my_sign = "HKmuDZzQxcjyIElmpXloiPRmVv789lAEylNxWIx0FWWPY7FYTYyPao2nFDmbWoZNpdija+7C+Xpvyco6b4A+xdXXYedsV7wS4ZpjgiW15gZdzIdWZgIf8dth2ikCpGausoE3cd+/It9fx5D3W5DLQ/uK1MNU3jtu+QPIOEiWPsI=";

        System.out.println(my_sign);
        System.out.println(urlencodeSign);
        System.out.println(urlencodeSign.equals(my_sign));
    }

    /**
     * 生成支付链接
     */
    @Test
    public void produceUrl() throws UnsupportedEncodingException {
        String pcurl = "https://web.iapppay.com/pc/gateway?";
        String h5url = "https://web.iapppay.com/h5/gateway?";
        String weburl = "https://web.iapppay.com/pay/gateway?";
        String directUrl = "https://web.iapppay.com/dpay/gateway?";
        String directPcUrl = "https://web.iapppay.com/pc/d/gateway?";
        String directH5Url = "https://web.iapppay.com/h5/d/gateway?";
        String url = directH5Url;
        String transid = "32921808150926309175";

        //下单
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("tid", transid);
        jsonObject.put("app", IAppPaySDKConfig.APP_ID);
//		jsonObject.put("url_r", "https://");  //成功
//		jsonObject.put("url_h", "https://");  //取消
        jsonObject.put("ptype", 403);  //qq钱包

        String content = jsonObject.toString();
        String sign = SignHelper.sign(content, IAppPaySDKConfig.APPV_KEY);
        String data = "data=" + URLEncoder.encode(content, "UTF-8") + "&sign=" + URLEncoder.encode(sign, "UTF-8") + "&signtype=RSA";
        System.out.println("支付链接: " + url + data);
    }

    /**
     * 生成transid
     */
    @Test
    public void produceTransId() {
        String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALW8LrzCyf/HjcZvuhWwzPDmSlOpn/RnHO2cvW8h44+I1ualss6eJDXeORliet6pEYHHIMHzVFxMqjdFQwQcd3utfps/ypzB8oavvvglJEPLW+EwAuGewQh4tfBEj38PLbetBGp0idSw/Vpzr3PP5E9WlRVLWnnzWrjGDXh/4VMDAgMBAAECgYEAgQ2oNt0watV/pTmz8DFD55HxmCWtc/ZBQa77is6K9WOcD9/88OK2Hha3f4JCdJmk1/7bET/FWWILwgIKTAIXCea4Pna7UBg6wX2kfzXouohXy5iy1GcGPDkirQR7UW0KBt/0ux0BUn6x5fPb3UXfcMfP+OrUkTAh//jmolI3kEECQQDmE0MWqm8aSe4MyYqmysC7XWz8oBAwFBRKP3BpmVRqK8j+Oo6QoyD2TzqExUQZYJCZsjnJfOFgTaIpC5dRlC/jAkEAyjaAx0YbZ+k7Uy5jj/xFh9IeO2ou3RPxeRvZ/W1yFLyOpSGfjF7irwLJ9pKm6nn2C+74u+KOvZ7Y0uO06sN6YQJACEVhAAuYeuV1fVgxd9WKIDI3nM1UR6YxJIorTGCKvFZen2UTgveaU8B9ZhCBZjgmeqABm9C1eXTRA5C7G9+r6QJAe3JkkcL57ijTf8d9HqSqqe0babg8HdkT/JSFMxLCp2gpSSRKq74tcxwnwbDr149XJxffn4wDCj3ULoK2qu9lYQJAdvzsvbdjGj4DGJ1kcKrDja0/k32TBEDGy4Wca3GXe9oKbOLLvFcDZ2p37JOnUB8JsEuS/90VBEIylq033uGl8A==";
        String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC2J5Eb0oIpyWmr2peVZK4SI23flCnjmVeWU6BlAQz05ANUhZV2FHYq6VXJT2QWhF5bb10ikSwdEQIuiDFZ9C6QvF50xd3oZ9G6IpDO2dFYdsXs2VC57NEa87QzbTNworJAEAoMnoJhiZlnr5WKTDAjhD7m7WiUUtD23kf6xtpbTwIDAQAB";

        String appid = "3017730907";
        String waresname = "";
        String cporderid = "qweasd";
        String appuserid = "test";
        String cpprivateinfo = "testinfo";
        String notifyurl = "";
        int waresid = 1;
        float price = 0.01f;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appid", appid);
        jsonObject.put("waresid", waresid);
        jsonObject.put("cporderid", cporderid);
        jsonObject.put("currency", "fdg");
        jsonObject.put("appuserid", appuserid);
        jsonObject.put("price", price);
        if (!waresname.isEmpty()) {
            jsonObject.put("waresname", waresname);
        }
        if (!cpprivateinfo.isEmpty()) {
            jsonObject.put("cpprivateinfo", cpprivateinfo);
        }
        if (!notifyurl.isEmpty()) {
            jsonObject.put("notifyurl", notifyurl);
        }

        String content = jsonObject.toString();

        System.out.println("content: " + content);
        String sign = SignHelper.sign(content, privateKey);
        System.out.println("sign: " + sign);

//        String data = "transdata=" + content + "&sign=" + sign + "&signtype=RSA";// 组装请求参数
        String data = "transdata={\"appid\":\"3017730907\",\"waresid\":2,\"cporderid\":\"6\",\"currency\":\"RMB\",\"appuserid\":\"787878\"}&sign=O5Sa3jGMiYNrm+hHvdqtNWFtoAMfGLCAdG+LunqDwU/KnqQe4i6qJnPb/7nkRo3NsN5kYur3H4OuJms4Il5I1a/ctR53Wg3PRllvW+vCgxBDvweIEv6uEgELOrJN5Goz598In6TSd1UCzqk0ZR5mdN12s4HhF8w0K8BGEcLsftY=&signtype=RSA";

        System.out.println("请求数据: " + data);
        String respData = HttpUtils.sentPost("https://cp.iapppay.com/payapi/order", data, "UTF-8"); // 请求验证服务端
        System.out.println("响应数据：" + respData);

        Map<String, String> reslutMap = SignUtils.getParmters(respData);
        String signtype = reslutMap.get("signtype"); // "RSA";
        if (signtype != null) {
            if (SignHelper.verify(reslutMap.get("transdata"), reslutMap.get("sign"), publicKey)) {
                System.out.println("transdata: " + reslutMap.get("transdata"));
                System.out.println("sign: " + reslutMap.get("sign"));
                JSONObject json = new JSONObject().parseObject(reslutMap.get("transdata"));
                String transid = json.getString("transid");
                System.out.println("transid: " + transid);
                System.out.println("verify ok");
            } else {
                System.out.println("verify fail");
            }
        }
    }
}
