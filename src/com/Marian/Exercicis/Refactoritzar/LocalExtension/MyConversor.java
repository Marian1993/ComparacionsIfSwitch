package com.Marian.Exercicis.Refactoritzar.LocalExtension;

public class MyConversor extends Conversor{

    public double euro2Pound(double qty){
        return qty * 0.8d;
    }
    public double pound2Euro(double qty){
        return qty * 1.2;
    }
}
