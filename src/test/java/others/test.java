package others;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.iapppay.paytest.HttpUtils;
import com.example.demo.iapppay.sign.SignHelper;
import sun.security.provider.MD5;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.iapppay.paytest.Order.ReqData;

public class test {

    public static void main(String[] args) {

        String[] fingers = {"大拇指","食指","中指","无名指","小拇指"};
        int f = 1;
        boolean asc = true;
        for (int i = 1; i <= 26; i++) {
            if (f == 5) {
                asc = false;
            }
            if (f == 1) {
                asc = true;
            }
            if (asc) {
                f++;
            }else{
                f--;
            }
        }
        System.out.println(fingers[f-1]);

        String a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCUragcL4p8HTmRYpMvf4ZagbePUS55P10V4wJmOj1cTAjq4SH9tciYZcPzyK1XkGAxXD2lj9Rb1uYO3I8/DJy+fNu0I8wQzvOxlyf/jeLCbB+F99bbp53r4/G9rQ/YAiDBFdCtPBS+ArroHwjMJxiaH2Xu26+4yKjZ1gs9MsVlwwIDAQAB";
        String b = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCUragcL4p8HTmRYpMvf4ZagbeP\n" +
                "US55P10V4wJmOj1cTAjq4SH9tciYZcPzyK1XkGAxXD2lj9Rb1uYO3I8/DJy+fNu0\n" +
                "I8wQzvOxlyf/jeLCbB+F99bbp53r4/G9rQ/YAiDBFdCtPBS+ArroHwjMJxiaH2Xu\n" +
                "26+4yKjZ1gs9MsVlwwIDAQAB";
        System.out.println(a == b);

        Map<String, String> map = new HashMap<>();
        map.put("appid", "5001994385");
        map.put("token", "XAEh0k_XHWZK8hqtXqLcO7KLgHoqjdvqH4U7gfHpP3WjNc0BEdJOcy4IDbaGAlD-zM3qRH8");
        map.put("sign", "ZTm1uclwxLOCrKi1YBh2huv7ANX31vELww3BKmj4IRWs945/lMF7wMGHsfoK55NaUqYJ05SfNIRYerb70wkgF+3nvhIx5M1JEVR3xvBc20f0IQxkZ75byQvxHusN5zvAlemJ26sLBRb1FGpyK9ACaVHT2ZagSLT936Qvmqr9AeQ=");
        String resp = SamsungUtil.post("https://siapcn1.ipengtai.com/api/oauth/get_token_info", map, null);
        System.out.println(resp);

        System.out.println("b4074eb352056295c3c664f0fbb91055@_()#1".length());
    }

}
