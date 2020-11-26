package com.Marian.Exercicis.Classes;

public class Alumne {

    private String nom;
    private int edat;
    private int identificador;
    private double[] notes;

    public Alumne() {}

    public Alumne(String nom,int edat,int identificador,double[] notes){

        this.nom=nom;
        this.edat=edat;
        this.identificador=identificador;
        this.notes=notes;

    }

    public String getNom() {
        return this.nom;
    }
    public int getEdat() {
        return this.edat;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public double[] getNotes() {
        return this.notes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
