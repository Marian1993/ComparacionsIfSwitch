package com.Marian.Exercicis.Classes;

public class Dog {

    //Declarar atributos
    private String name;
    private int vacu;
    private int age;
    private String race;
    private boolean pedigri;

    //Crear constructor
    public Dog(String name,int age,String race,int vacu,boolean pedigri){

        this.name=name;
        this.vacu=vacu;
        this.age=age;
        this.race=race;
        this.pedigri=pedigri;
    }

    //GETTER
    public String getName() {

        return this.name=name;
    }

    public int getVacu() {
        return this.vacu=vacu;
    }

    public int getAge() {

        return this.age=age;
    }

    public String getRace() {

        return this.race=race;
    }


    //SETTER

    public void setName(String name) {

        this.name = name;
    }
}
