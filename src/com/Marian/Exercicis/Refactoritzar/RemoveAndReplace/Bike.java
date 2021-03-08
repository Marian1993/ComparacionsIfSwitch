package com.Marian.Exercicis.Refactoritzar.RemoveAndReplace;

public class Bike extends TipusVheicles{

    public Bike(int vehicleType, int speed, int acceleration){

        super(vehicleType, speed, acceleration);

    }

    public int move () {
        int result = 0;

        return result = speed * 10;
    }
}
