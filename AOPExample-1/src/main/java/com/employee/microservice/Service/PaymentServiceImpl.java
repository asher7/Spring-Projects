// PaymentServiceImpl.java
package com.employee.microservice.Service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void makePayment() {
        System.out.println("Amount Debited");
        System.out.println("Amount Credited");
    }
}
