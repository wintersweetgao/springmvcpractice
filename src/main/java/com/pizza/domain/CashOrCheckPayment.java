package com.pizza.domain;

/**
 * @author dongmei.gao
 * @date 2019/6/3 12:55
 */
public class CashOrCheckPayment  extends Payment{

    public CashOrCheckPayment() {
    }

    @Override
    public String toString() {
        return "CASH OR CHECK PAYMENT $" + this.getAmount();
    }
}
