package com.example.ddddemo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author sheng 2018/12/31
 * @desc 收银员
 */
@Data
@AllArgsConstructor
public class Cashier {

    private String cashierId;
    private String name;
    private CashRegister cashRegister;

    public void work(Customer customer) {
        cashRegister.registerCash(customer);
        Integer amount = cashRegister.showAmount();
        customer.listenToCashier(amount);
    }

}
