package com.Marian.Exercicis.Refactoritzar.descomposaCondicional;

public class Customer {
    private int age;
    private boolean isVip;

    public Customer (int age, boolean isVip) {
        this.age = age;
        this.isVip = isVip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVip () {
        return isVip;
    }
}
