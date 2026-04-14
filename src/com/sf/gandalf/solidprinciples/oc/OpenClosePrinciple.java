package com.sf.gandalf.solidprinciples.oc;

public class OpenClosePrinciple {

    static void main(String[] args) {

        DiscountCalculator discountCalculator = new DiscountCalculator();
        double regularDiscount = discountCalculator.calculateDiscount(new RegularDiscount(), 1000);
        System.out.println("Regular Discount :"+regularDiscount);

        double premiumDiscount = discountCalculator.calculateDiscount(new PremiumDiscount(), 1000);
        System.out.println("Premium Discount :"+premiumDiscount);

        double platinumDiscount = discountCalculator.calculateDiscount(new PlatinumDiscount(), 1000);
        System.out.println("Platinum Discount :"+platinumDiscount);

    }

}


