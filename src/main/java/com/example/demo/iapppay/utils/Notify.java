package com.example.demo.iapppay.utils;

public class Notify {

    private String transdata;
    private String sign;
    private String signtype;


    public String getTransdata() {
        return transdata;
    }

    public void setTransdata(String transdata) {
        this.transdata = transdata;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSigntype() {
        return signtype;
    }

    public void setSigntype(String signtype) {
        this.signtype = signtype;
    }

    @Override
    public String toString() {
        return "Notify{" +
                "transdata=" + transdata +
                ", sign='" + sign + '\'' +
                ", signtype='" + signtype + '\'' +
                '}';
    }
}
