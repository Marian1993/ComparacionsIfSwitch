package com.Marian.Exercicis;

import com.Marian.Exercicis.Classes.Employee.*;
import com.Marian.Exercicis.Refactoritzar.Customer;
import com.Marian.Exercicis.Refactoritzar.EliminarAssignacioParametre;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Persona persona1= new Persona("David", 24, "45367721M", "Famella", 656789234);
        //System.out.println(persona1.toString());*/

        /*Alumne alumne1=new Alumne();

        //Donar valors a les variables
        alumne1.setName("Juana");
        alumne1.setAge(14);
        alumne1.setDNI("45234465K");
        alumne1.setPhone(65642398);
        alumne1.setNotes (new double [] {5.7,7.3,2.4,8.0,9.1});
        alumne1.mitjanaNotes();
        alumne1.display();

        System.out.println();

        Professor professor1= new Professor("Miquel", 34, "32456678S", "Home",
                654778672, "Matmatiques");

        professor1.display();*/


        /*Programador programador=new Programador();

        programador.setName("David");
        programador.setSou(1250.25);
        programador.setAntiguetat(1);

        //programador.addTask("Mirar falls d'execuci");
        //programador.addTask("Vigilar qui fa modificacions");

        System.out.println("Nom: "+ programador.getName() + "\nSou: " + programador.getSou() +
                "€\nAntiguetat: " + programador.getAntiguetat() + " any");

        programador.pujaSou();
        programador.mesAntiguetat();

        System.out.println("Sou: " + programador.getSou() + "€\nAntiguetat: " + programador.getAntiguetat() + " anys");

        programador.addTask("Fer algo");
        programador.showTask();


        CapProjecte capProjecte = new CapProjecte();

        ArrayList<String> projectes = new ArrayList<String>();

        projectes.add("Fer un joc");

        capProjecte.setProjectes(projectes);*/

        //Employee empleat = new Employee("KJ56LL","David",2384657,1250);
        //Engineer engineer = new Engineer("FR324R", "Pedro", 943856,1450);
        //Administrador administrador = new Administrador("HY43S", "Laura", 873462,1100);

        /*int[] num = {5,3,1,4,2,9,8};

        int indexMesPetit = 0;
        int indexComparacio = 0;
        int numAuxiliar = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = indexComparacio; j < num.length; j++) {

                if(num[indexMesPetit] > num[j]){

                    indexMesPetit = j;
                }
            }
                numAuxiliar = num[indexComparacio];
                num[indexComparacio] = num[indexMesPetit];
                num[indexMesPetit] = numAuxiliar;
                indexComparacio++;
                indexMesPetit = indexComparacio;

            System.out.println(num[i]);
        }*/


        int[] num = {2,5,4,1,6,3};

        int longitud = num.length;


        for (int i = 0; i < num.length; i++) {
            int numAuxiliar = 0;

            for (int j = 0; j < longitud-1; j++) {

                if(num[j] > num[j+1]){

                    numAuxiliar = num[j+1];
                    num[j+1] = num[j];
                    num[j] = numAuxiliar;
                }
            }
            longitud--;
        }
        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);

        }
    }


}



