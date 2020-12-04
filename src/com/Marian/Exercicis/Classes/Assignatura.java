package com.Marian.Exercicis.Classes;

import java.util.ArrayList;

public class Assignatura {

    private String nom;
    private ArrayList<Alumne> llistaAlumnes;

    public Assignatura(String nom, ArrayList<Alumne> llistaAlumnes){
        this.nom=nom;
        this.llistaAlumnes=llistaAlumnes;

    }
    public Assignatura(){}

    public String getNom() {
        return this.nom;
    }

    public ArrayList<Alumne> getLlistaAlumnes() {
        return this.llistaAlumnes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLlistaAlumnes(ArrayList<Alumne> llistaAlumnes) {
        this.llistaAlumnes = llistaAlumnes;
    }

    public void nouMatriculat(Alumne alumne){
        this.llistaAlumnes.add(alumne);
    }

    public void baixaAlumne(Alumne alumne){
        this.llistaAlumnes.remove(alumne);
    }

    /*public Alumne millorAlumne(){
        Alumne alumne=new Alumne("Marian", 14,23,new double[] {1,2,3,4});
        for(int i=0;i<llistaAlumnes.size();i++){
            if(alumne.mitjanaNotes()< llistaAlumnes.get(i).mitjanaNotes()){
                alumne=llistaAlumnes.get(i);
            }
        }
        return alumne;
    }*/
    public ArrayList<Alumne> printAlumne(int numAlumne){
        llistaAlumnes.get(numAlumne);
        return llistaAlumnes;
    }

    public void printAssignatura(){
        System.out.println(nom);
    }
    public void printAlumne(){
        Alumne alumne=new Alumne();

        for( int i=0; i<llistaAlumnes.size();i++){

            System.out.println(llistaAlumnes.get(i).getNom());
            System.out.println(llistaAlumnes.get(i).getEdat());
            System.out.println(llistaAlumnes.get(i).mitjanaNotes());

        }
    }


    public void setLlistaAlumnes(Alumne alumne, Alumne alumne1, Alumne alumne2, Alumne alumne3, Alumne alumne4) {
    }
}
