package com.sf.gandalf.solidprinciples.oc;

public class RegularDiscount implements DiscountStrategy {

    public static final double REGULAR_DISCOUNT = 0.1;

    @Override
    public double applyDiscount(double amount) {
        return amount * REGULAR_DISCOUNT;
    }
}
