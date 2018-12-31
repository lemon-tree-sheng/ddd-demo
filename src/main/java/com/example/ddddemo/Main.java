package com.example.ddddemo;

/**
 * @author sheng 2018/12/31
 * @desc todo
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 创建所有的条件
         */
        Customer alice = new Customer("1", "alice");
        Customer houke = new Customer("2", "houke");

        Good binggan = new Good("1", "饼干", 20);
        Good yinliao = new Good("2", "饮料", 50);
        Good kele = new Good("3", "可乐", 70);

        CashRegister cashRegister1 = new CashRegister("1", "收银柜台1", 0);
        CashRegister cashRegister2 = new CashRegister("2", "收银柜台2", 0);

        Cashier xiaoming = new Cashier("1", "小明", cashRegister1);
        Cashier xiaohong = new Cashier("2", "小红", cashRegister2);


        /**
         * 购买行为
         */
        alice.want(binggan);
        alice.want(yinliao);
        houke.want(yinliao);
        houke.want(kele);
        xiaoming.work(alice);
        xiaohong.work(houke);

    }
}
