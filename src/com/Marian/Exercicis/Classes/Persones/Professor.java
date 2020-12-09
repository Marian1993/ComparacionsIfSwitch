package com.Marian.Exercicis.Classes.Persones;

import com.Marian.Exercicis.Classes.Persones.Persona;

public class Professor extends Persona {

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
        System.out.println("Nom professor: " + getName());
        System.out.println("Edat professor: " + getAge());
        System.out.println("DNI professor: " + getDNI());
        System.out.println("Genere professor: " + getGender());
        System.out.println("Telefon professor: " + getPhone());
        System.out.println("Especialitat professor:" + getEspecialitat());

    }
}
