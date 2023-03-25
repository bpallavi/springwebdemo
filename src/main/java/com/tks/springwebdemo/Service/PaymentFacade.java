package com.tks.springwebdemo.Service;

import java.util.List;

import com.tks.springwebdemo.PaymentServices.MasterCardPaymentService;
import com.tks.springwebdemo.PaymentServices.RupayPaymentService;
import com.tks.springwebdemo.PaymentServices.VisaPaymentService;
import com.tks.springwebdemo.model.Payment;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentFacade {
    
    @Autowired
    List<Payment> payment;

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }


}
