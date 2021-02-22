package com.Marian.Exercicis.Refactoritzar;

public class Discount {

    public static double applyDiscount(Customer customer, double price, double discount) {


        return finalPrice(customer, price) * appliedVat (customer) - discount;
    }

    public  static double appliedVat(Customer customer) {

        switch (customer.getType()) {
            case Customer.NORMAL:
                return 1.21f;
            case Customer.SPECIAL:
                return 1.15f;
            case Customer.VIP:
                return 1.04f;
            default:
                return 1.21f;

        }

    }
    public static double finalPrice(Customer customer, double price){

        if (price > 50 && customer.isVip()) {
            return price * 0.5;
        } else if (price > 10 && customer.isSpecial()) {
            return price * 0.1;
        }
            return price;


    }




}
