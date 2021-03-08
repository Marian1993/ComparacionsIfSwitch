package com.Marian.Exercicis.Refactoritzar.RemoveAndReplace;

public class Plane extends TipusVheicles{

    public Plane(int vehicleType, int speed, int acceleration){

        super(vehicleType, speed, acceleration);

    }

    public int move () {
        int result = 0;

        return result = acceleration * 2;
    }
}
