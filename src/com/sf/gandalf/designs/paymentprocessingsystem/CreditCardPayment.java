package com.sf.gandalf.designs.paymentprocessingsystem;

public class CreditCardPayment implements Payable, Refundable{

    @Override
    public void pay(double amount) {
        System.out.println("Process Payment for CreditCard");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Process Refund for CreditCard");
    }
}
