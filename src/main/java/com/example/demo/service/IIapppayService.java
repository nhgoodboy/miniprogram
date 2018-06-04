package com.example.demo.service;

public interface IIapppayService {

    String h5_order(int waresId);
    String pc_order(int waresId);
    String server_order(int waresId);
    String client_order(int waresId);
    String contract_query(int waresId);
    String contract_cancel(int waresId);
}
