package com.Marian.Exercicis.Refactoritzar.PullUp;

public class Car extends Vehicle
{
    private String trunk;
    private boolean isTrunkOpened;


    public boolean isTrunkOpen() {
        return isTrunkOpened;
    }
}
