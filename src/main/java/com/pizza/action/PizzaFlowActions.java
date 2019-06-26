package com.pizza.action;

import com.pizza.domain.*;
import com.pizza.service.CustomerNotFoundException;
import com.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static com.pizza.domain.PaymentType.CREDIT_CARD;

@Component
public class PizzaFlowActions {

    @Autowired
    CustomerService customerService;
  
   public Customer lookupCustomer(String phoneNumber)
         throws CustomerNotFoundException {
      Customer customer = customerService.lookupCustomer(phoneNumber);
      if(customer != null) {        
        return customer;
      } else {
        throw new CustomerNotFoundException();
      }
   }
   
   public void addCustomer(Customer customer) {
       System.out.println("TODO: Flesh out the addCustomer() method.");
   }

   public Payment verifyPayment(PaymentDetails paymentDetails) {
     Payment payment = null;
     if(paymentDetails.getPaymentType() == CREDIT_CARD) {
       payment = new CreditCardPayment();
     } else {
       payment = new CashOrCheckPayment();
     }
     
     return payment;
   }
   
   public void saveOrder(Order order) {
       System.out.println("TODO: Flesh out the saveOrder() method.");
   }

   public boolean checkDeliveryArea(String zipCode) {
       System.out.println("TODO: Flesh out the checkDeliveryArea() method.");
       return "15000".equals(zipCode);
   }
}
