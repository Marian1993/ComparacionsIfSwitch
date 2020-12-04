package com.Marian.Exercicis.Classes;

public class Alumne extends Persona{


    private double[] notes;

    public Alumne() {}

    public Alumne(String nom,int edat,String identificador, String genere, int telefon, double[] notes){

        super(nom,edat,identificador,genere,telefon);
        this.notes=notes;

    }

    public double[] getNotes() {
        return this.notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public double mitjanaNotes(){
        int totalNotes=0;

        for( int i=0;i<this.notes.length;i++){

            totalNotes+=notes[i];
        }
        return (double)totalNotes/notes.length;
    }

}
