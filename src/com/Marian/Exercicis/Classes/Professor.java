package com.Marian.Exercicis.Classes;

public class Professor extends Persona{

    String especialitat;

    public Professor(){}

    public Professor(String nom, int edat, String DNI, String genere, int telefon, String especialitat){

        super(nom,edat,DNI,genere,telefon);

        this.especialitat=especialitat;
    }
    public String getEspecialitat (){

        return this.especialitat;
    }

    public void setEspecialitat(String especialitat){
        this.especialitat=especialitat;
    }

    public void display(){
        System.out.println("Nom alumne: " + getName());
        System.out.println("Edat alumne: " + getAge());
        System.out.println("DNI alumne: " + getDNI());
        System.out.println("Genere alumne: " + getGender());
        System.out.println("Telefon alumne: " + getPhone());
        System.out.println("Notes alumne:" + getEspecialitat());

    }
}
