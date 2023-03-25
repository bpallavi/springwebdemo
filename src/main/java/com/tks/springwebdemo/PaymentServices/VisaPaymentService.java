package com.tks.springwebdemo.PaymentServices;

import com.tks.springwebdemo.model.Payment;

import org.springframework.stereotype.Component;

@Component
public class VisaPaymentService implements Payment {

    @Override
    public float makePayment(float amount) {
        
        return 80;
        
    }
    
}
