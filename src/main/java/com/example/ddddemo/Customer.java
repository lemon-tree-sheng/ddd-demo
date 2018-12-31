package com.example.ddddemo;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * @author sheng 2018/12/31
 * @desc todo
 */
@Data
public class Customer {

    private String customerId;
    private String name;
    private List<Good> goodList;

    Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        goodList = Lists.newArrayList();
    }

    /**
     * 行为
     */

    public void want(Good good) {
        goodList.add(good);
    }

    public void listenToCashier(Integer amount) {
        String goodsTr = "";
        for (Good good : goodList) {
            goodsTr += good.getName() + ", ";
        }
        System.out.printf("我是%s, 我买了%s, 总计%d元%n", name, goodsTr, amount);
    }
}
