package com.sf.gandalf.solidprinciples.oc;

public class PlatinumDiscount implements DiscountStrategy {

    public static final double PLATINUM_DISCOUNT = 0.3;

    @Override
    public double applyDiscount(double amount) {
        return amount * PLATINUM_DISCOUNT;
    }
}
