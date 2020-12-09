package com.Marian.Exercicis.Classes.Persones;

import com.Marian.Exercicis.Classes.Persones.Persona;

public class Alumne extends Persona {


    private double[] notes;

    public Alumne() {}

    public Alumne(String nom,int edat,String DNI, String genere, int telefon, double[] notes){

        super(nom,edat,DNI,genere,telefon);
        this.notes=notes;

    }

    public double[] getNotes() {
        return this.notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public void display(){
        System.out.println("Nom alumne: " + getName());
        System.out.println("Edat alumne: " + getAge());
        System.out.println("DNI alumne: " + getDNI());
        System.out.println("Genere alumne: " + getGender());
        System.out.println("Telefon alumne: " + getPhone());
        System.out.println("Notes alumne:");
        notes();
        System.out.println("Mitjana de notes alumne: " + mitjanaNotes());

    }

    public double mitjanaNotes(){
        int totalNotes=0;

        for( int i=0;i<this.notes.length;i++){

            totalNotes+=notes[i];
        }
        return (double)totalNotes/notes.length;
    }
    public void notes (){

        for(int i=0 ; i<notes.length ; i++){

            System.out.println(notes[i]);
        }

    }

}
