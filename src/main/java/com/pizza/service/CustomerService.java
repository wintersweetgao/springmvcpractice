package com.pizza.service;

import com.pizza.domain.Customer;

/**
 * @author dongmei.gao
 * @date 2019/6/3 13:27
 */
public interface CustomerService {

    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
