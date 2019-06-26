package com.pizza.domain;

/**
 * @author dongmei.gao
 * @date 2019/6/3 10:53
 */
public class PaymentDetails {
    private PaymentType paymentType ;
    private String creditCardNumber;

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
