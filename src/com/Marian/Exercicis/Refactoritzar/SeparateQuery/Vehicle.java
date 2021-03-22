package com.Marian.Exercicis.Refactoritzar.SeparateQuery;

public class Vehicle {
    private int horsePower;
    private String type;

    public Vehicle(int power) {
        initVehicle(power);
    }

    private void initVehicle(int power) {
        horsePower = power;

        if (power >= 10) {
            type = "Truck";
        } else if (power > 5 && power < 10) {
            type = "Car";
        } else {
            type = "Bike";
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }
}
