package com.sf.gandalf.solidprinciples.oc;

public class PremiumDiscount implements DiscountStrategy {

    public static final double PREMIUM_DISCOUNT = 0.2;

    @Override
    public double applyDiscount(double amount) {
        return amount * PREMIUM_DISCOUNT;
    }
}
