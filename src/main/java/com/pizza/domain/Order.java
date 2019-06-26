package com.pizza.domain;

import org.springframework.beans.factory.annotation.Configurable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dongmei.gao
 * @date 2019/6/3 9:26
 */
@Configurable
public class Order implements Serializable {
    private static final long serialVersionUID = 7304843105768506206L;

    private Customer customer;
    private List<Pizza> pizzas;
    private Payment payment;

    public Order() {
        pizzas = new ArrayList<Pizza>();
        customer = new Customer();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
