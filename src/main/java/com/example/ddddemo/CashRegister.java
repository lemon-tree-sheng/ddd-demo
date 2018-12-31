package com.example.ddddemo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author sheng 2018/12/31
 * @desc 收银台
 */
@Data
@AllArgsConstructor
public class CashRegister {

    private String cashRegisterId;
    private String location;
    /**
     * 当前总计金额
     */
    private Integer totalAmount;

    /**
     * 行为
     * @param customer
     */

    public void registerCash(Customer customer) {
        if (totalAmount == null) {
            totalAmount = 0;
        }
        for (Good good : customer.getGoodList()) {
            totalAmount += good.getPrice();
        }
    }

    public Integer showAmount() {
        return totalAmount == null ? 0 : totalAmount;
    }

}
