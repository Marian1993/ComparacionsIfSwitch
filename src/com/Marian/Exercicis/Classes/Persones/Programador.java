package com.Marian.Exercicis.Classes.Persones;

import java.util.ArrayList;

public class Programador extends Empleat {

    private ArrayList<String> tasques= new ArrayList<String>();
    private String projecte;

    public Programador(){}

    public Programador(String nom, int edat, String DNI, String genere, int telefon, int identificador,
                       double sou, int antiguetat, ArrayList<String> tasques, String projecte){

        super(nom, edat, DNI, genere, telefon, identificador,sou, antiguetat);

        this.tasques=tasques;
        this.projecte=projecte;
    }

    public  ArrayList<String> getTasques(){
        return tasques;
    }
    public void setTasques(ArrayList<String> tasques){
        this.tasques = tasques;
    }

    public String getProjecte() {
        return projecte;
    }

    public void setProjecte(String projecte) {
        this.projecte = projecte;
    }

    public void display(){
        System.out.println("Nom programador: " + getName());
        System.out.println("Edat programador: " + getAge());
        System.out.println("DNI programador: " + getDNI());
        System.out.println("Genere programador: " + getGender());
        System.out.println("Telefon programador: " + getPhone());
        System.out.println("Identificador programador:" + getIdentificador());
        System.out.println("Sou programador:" + getSou());
        System.out.println("Antiguetat programador:" + getAntiguetat());
        System.out.println("Tasques programador:" + getTasques());

    }

    public void addTask( String tasca){
        tasques.add(tasca);
    }
    public void completeTask(String tasca){
        tasques.remove(tasca);
    }
    public void showTask(){

        for (int i=0 ; i<tasques.size() ; i++ ){

            System.out.println(tasques.get(i));
        }
    }

}
