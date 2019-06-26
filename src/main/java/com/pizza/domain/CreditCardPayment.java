package com.pizza.domain;

/**
 * @author dongmei.gao
 * @date 2019/6/3 13:04
 */
public class CreditCardPayment extends  Payment{
    private String authorization;

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String toString() {
        return "CREDIT:  $" + getAmount() + " ; AUTH: " + authorization;
    }
}
