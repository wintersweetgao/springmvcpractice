package com.pizza.service;

import com.pizza.domain.Customer;
import org.springframework.stereotype.Component;

/**
 * @author dongmei.gao
 * @date 2019/6/3 13:29
 */
@Component
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        if("15088653426".equals(phoneNumber)) {
            Customer customer = new Customer();
            customer.setId(123);
            customer.setName("Craig Walls");
            customer.setAddress("3700 Dunlavy Rd");
            customer.setCity("Denton");
            customer.setState("TX");
            customer.setZipCode("76210");
            customer.setPhoneNumber(phoneNumber);
            return customer;
        } else {
            throw new CustomerNotFoundException();
        }
    }
}
