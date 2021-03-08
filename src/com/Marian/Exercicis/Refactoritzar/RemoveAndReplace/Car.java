package com.Marian.Exercicis.Refactoritzar.RemoveAndReplace;

public class Car extends TipusVheicles{

    public Car(int vehicleType, int speed, int acceleration){

        super(vehicleType, speed, acceleration);

    }

    public int move () {
        int result = 0;

        return result = speed * acceleration * 5;
    }
}
