package com.Marian.Exercicis.Refactoritzar.RemoveAndReplace;

public abstract class TipusVheicles {

    protected int vehicleType;
    protected int speed;
    protected int acceleration;

    public TipusVheicles(int vehicleType, int speed, int acceleration) {
        this.vehicleType = vehicleType;
        this.speed = speed;
        this.acceleration = acceleration;
    }
    public abstract int move();


}
