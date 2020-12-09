package com.Marian.Exercicis.Classes.Persones;

import com.Marian.Exercicis.Classes.Persones.Empleat;

import java.util.ArrayList;

public class CapProjecte extends Empleat {

    private ArrayList<String> projectes;

    public CapProjecte(){}

    public CapProjecte(String nom, int edat, String DNI, String genere, int telefon, int identificador,
                       double sou, int antiguetat, ArrayList<String> projectes) {

        super(nom, edat, DNI, genere, telefon, identificador, sou, antiguetat);

        this.projectes = projectes;
    }
    public ArrayList<String> getProjectes(){
        return projectes;
    }
    public void setProjectes(ArrayList<String> projectes){
        this.projectes=projectes;
    }
    public void display() {
        System.out.println("Nom capProjecte: " + getName());
        System.out.println("Edat capProjecte: " + getAge());
        System.out.println("DNI capProjecte: " + getDNI());
        System.out.println("Genere capProjecte: " + getGender());
        System.out.println("Telefon capProjecte: " + getPhone());
        System.out.println("Identificador capProjecte:" + getIdentificador());
        System.out.println("Sou capProjecte:" + getSou());
        System.out.println("Antiguetat capProjecte:" + getAntiguetat());
        System.out.println("Projecte capProjecte:" + getProjectes());
    }
    public void projectesAssignats(){

        for(int i=0 ;i<projectes.size() ; i++){

            projectes.get(i);
        }
    }
}
