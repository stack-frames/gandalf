package com.sf.gandalf.designs.paymentprocessingsystem;

public class PaymentService {

    private Payable payable;

    PaymentService(Payable payable) {
        this.payable = payable;
    }

    public void processPayment(double amount) {
        payable.pay(amount);
    }

}
