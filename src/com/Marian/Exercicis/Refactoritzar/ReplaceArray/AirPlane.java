package com.Marian.Exercicis.Refactoritzar.ReplaceArray;

public class AirPlane {

    private String model;
    private Pilot pilot;

    public AirPlane(String model, Pilot pilot) {
        this.model = model;
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", pilot=" + pilot.getName() + "]";
    }
}
