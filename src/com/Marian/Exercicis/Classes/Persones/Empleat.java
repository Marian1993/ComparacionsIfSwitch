package com.Marian.Exercicis.Classes.Persones;

import com.Marian.Exercicis.Classes.Persones.Persona;

public class Empleat extends Persona {

    private int identificador;
    private double sou;
    private int antiguetat;

    public Empleat(){}

    public Empleat(String nom, int edat, String DNI, String genere, int telefon, int identificador,
                   double sou, int antiguetat){

        super(nom, edat, DNI, genere, telefon);

        this.identificador=identificador;
        this.sou=sou;
        this.antiguetat=antiguetat;
    }

    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificador){
        this.identificador=identificador;
    }
    public double getSou(){
        return sou;
    }
    public void setSou(double sou){
        this.sou=sou;
    }
    public int getAntiguetat(){
        return antiguetat;
    }
    public void setAntiguetat(int antiguetat){
        this.antiguetat=antiguetat;
    }
    public void display(){
        System.out.println("Nom empleat: " + getName());
        System.out.println("Edat empleat: " + getAge());
        System.out.println("DNI empleat: " + getDNI());
        System.out.println("Genere empleat: " + getGender());
        System.out.println("Telefon empleat: " + getPhone());
        System.out.println("Identificador empleat:" + getIdentificador());
        System.out.println("Sou empleat:" + getSou());
        System.out.println("Antiguetat empleat:" + getAntiguetat());

    }

    public void pujaSou (){
        sou=sou*1.05;

    }
    public void mesAntiguetat(){

        antiguetat++;
    }



}
