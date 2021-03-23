package com.Marian.Exercicis.Refactoritzar.ParametrizeMethod;

public class Invoice {
    private float subtotal;
    private Customer customer;

    public Invoice(float subtotal, Customer customer) {
        this.subtotal = subtotal;
        this.customer = customer;
    }

    public float charge() {
        if (customer.getAge() < 18) {
            return chargeDiscount(0.5f);
        } else if (customer.payInCash()) {
            return chargeDiscount(0.8f);
        } else {
            return chargeDiscount(1f);
        }
    }

    private float chargeDiscount(float discountAmount) {
        return subtotal * discountAmount;
    }

}
