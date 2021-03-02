package com.Marian.Exercicis.Refactoritzar;

public class VariableTemporal {

    public float totalPrice (float price, float vat, float discount) {
        float totalVat = (vat * price) / 100;;
        float totalPrice = price + totalVat;

        System.out.println("Applied vat: " + totalVat);
        System.out.println("Total with vat: " + totalPrice);
        return totalPrice - discount;
    }
}
