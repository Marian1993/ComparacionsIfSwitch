package com.Marian.Exercicis;

import com.Marian.Exercicis.Classes.*;
import com.Marian.Exercicis.Classes.Abstracte.TimeDepositAccount;
import com.Marian.Exercicis.Classes.Poligonos.Quadrat;
import com.Marian.Exercicis.Classes.Poligonos.Triangle;
import com.Marian.Exercicis.ExExepcions.Exepcions;
import com.Marian.Exercicis.ExercicisP.*;
import com.Marian.Exercicis.Refactoritzar.Extraccions.*;
import com.Marian.Exercicis.Classes.Persones.Persona;
import com.Marian.Exercicis.Classes.Employee.*;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

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

        Employee empleat = new Employee("KJ56LL","David",2384333,1250);
        Employee empleat1 = new Employee("KJ56GH","Maria",2384121,1250);
        Employee empleat2 = new Employee("KJ34LL","Gerard",2383422,1250);
        Employee empleat3 = new Employee("KT33LL","Laura",2384787,1250);
        Employee empleat4 = new Employee("LI56LL","Aina",2384001,1250);


        Manager manager = new Manager("LL44KI","Joan", 3439833, 2000, "Recursos humans",
                new Employee[20], 0);

        Employee director = new Director();
        Administrador administrador = new Administrador("LL40OI","Paula", 3432103, 2000,"mobils");
        Engineer engineer = new Engineer();

        System.out.println(manager.findEmployee(empleat2));

        System.out.println(manager.addEmployee(empleat));
        System.out.println(manager.addEmployee(empleat1));
        System.out.println(manager.addEmployee(empleat2));
        System.out.println(manager.addEmployee(empleat3));

        System.out.println(manager.findEmployee(empleat2));

        System.out.println(manager.removeEmployee(empleat2));

        manager.printArray();


    }
}



