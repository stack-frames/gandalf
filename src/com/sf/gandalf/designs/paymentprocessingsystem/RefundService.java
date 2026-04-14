package com.sf.gandalf.designs.paymentprocessingsystem;

public class RefundService {

    public void processRefund(Refundable refundable, double amount) {
        refundable.refund(amount);
    }

}
