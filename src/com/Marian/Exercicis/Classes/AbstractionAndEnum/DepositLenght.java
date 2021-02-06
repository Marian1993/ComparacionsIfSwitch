package com.Marian.Exercicis.Classes.AbstractionAndEnum;

public enum DepositLenght {

    THREE_MONTHS(90),SIX_MONTHS(180);

    private int days;

    private DepositLenght(int days){

        this.days = days;

    }
    public int getDays() {
        return days;
    }
}
