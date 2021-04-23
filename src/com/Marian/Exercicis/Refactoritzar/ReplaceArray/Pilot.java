package com.Marian.Exercicis.Refactoritzar.ReplaceArray;

public class Pilot {

    private String name;
    private String licence;
    private int flightdHours;

    public Pilot(String name, String licence, int flightHours){

        this.name = name;
        this.licence = licence;
        this.flightdHours = flightHours;
    }

    public String getName(){return this.name;}
}
