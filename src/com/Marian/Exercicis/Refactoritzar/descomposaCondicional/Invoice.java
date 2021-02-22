package com.Marian.Exercicis.Refactoritzar.descomposaCondicional;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Invoice {
    private Customer customer;
    private int year;
    private float price;
    private int qty;

    public Invoice (Customer customer, int year, float price, int qty) {
        this.customer = customer;
        this.year = year;
        this.price = price;
        this.qty = qty;
    }

    public float calculatePayment (float price, float discount, float vat) {
        float payment = 0;

        if (age()) {
            payment = price * discount * vat;
        } else {
            payment = price * vat;
        }
        return payment;
    }
    public float calculateTotal (float subtotal, float vat) {
        if (calculate(subtotal)) {
            return 0;
        }

        return subtotal * vat;
    }

    public float calculateTotal2 (float vat, float discount) {
        float subtotal = (price * qty);
        float subDiscount = subtotal - discount;
        float impost = 1 + (vat / 100);

        if (customer.isVip()) {
            subDiscount = subDiscount * impost;
            return subDiscount;
        } else {
            subtotal = subtotal * impost;
            return subtotal;
        }
    }

    public boolean calculate( float subtotal){

        return customer.getAge() < 18 || new GregorianCalendar().get(Calendar.YEAR) > year || subtotal < 0.5f;
    }

    public boolean age(){

        return customer.getAge() < 18 || customer.getAge() > 65;
    }
}
