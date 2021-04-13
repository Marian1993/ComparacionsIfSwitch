package com.Marian.Exercicis.Refactoritzar.ReplaceDataValue;

public class Address {

    private int number;
    private String street;
    private String city;
    private int postalcode;
    private String floor;

    public Address (String city, int postalcode, String street, int number, String floor){

        this.city = city;
        this.postalcode = postalcode;
        this.street = street;
        this.number = number;
        this.floor = floor;

    }

}
