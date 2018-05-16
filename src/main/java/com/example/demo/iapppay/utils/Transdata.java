package com.example.demo.iapppay.utils;

public class Transdata {

    private Integer transtype;
    private String cporderid;
    private String transid;
    private String appuserid;
    private String appid;
    private String waresid;
    private Integer feetype;
    private Float money;
    private String currency;
    private Integer result;
    private String cppprivate;
    private Integer paytype;

    public Integer getTranstype() {
        return transtype;
    }

    public void setTranstype(Integer transtype) {
        this.transtype = transtype;
    }

    public String getCporderid() {
        return cporderid;
    }

    public void setCporderid(String cporderid) {
        this.cporderid = cporderid;
    }

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid;
    }

    public String getAppuserid() {
        return appuserid;
    }

    public void setAppuserid(String appuserid) {
        this.appuserid = appuserid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getWaresid() {
        return waresid;
    }

    public void setWaresid(String waresid) {
        this.waresid = waresid;
    }

    public Integer getFeetype() {
        return feetype;
    }

    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getCppprivate() {
        return cppprivate;
    }

    public void setCppprivate(String cppprivate) {
        this.cppprivate = cppprivate;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    @Override
    public String toString() {
        return "Transdata{" +
                "transtype=" + transtype +
                ", cporderid='" + cporderid + '\'' +
                ", transid='" + transid + '\'' +
                ", appuserid='" + appuserid + '\'' +
                ", appid='" + appid + '\'' +
                ", waresid='" + waresid + '\'' +
                ", feetype=" + feetype +
                ", money=" + money +
                ", currency='" + currency + '\'' +
                ", result=" + result +
                ", cppprivate='" + cppprivate + '\'' +
                ", paytype=" + paytype +
                '}';
    }
}
