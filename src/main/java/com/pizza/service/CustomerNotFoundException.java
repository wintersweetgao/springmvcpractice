package com.pizza.service;

/**
 * @author dongmei.gao
 * @date 2019/6/3 13:26
 */
public class CustomerNotFoundException extends Exception{

    public CustomerNotFoundException() {
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
