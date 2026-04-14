package com.sf.gandalf.designs.paymentprocessingsystem;

public class PaymentProcessingSystem {

    static void main(String[] args) {
        Payable creditCardPayment = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.processPayment(1000);

        RefundService refundService = new RefundService();
        refundService.processRefund((Refundable) creditCardPayment, 1000);
    }

}
