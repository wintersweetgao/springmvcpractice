package com.pizza.domain;

/**
 * @author dongmei.gao
 * @date 2019/6/3 12:44
 */
public abstract class Payment {
   private float amount ;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
