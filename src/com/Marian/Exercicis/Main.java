package com.Marian.Exercicis;

import com.Marian.Exercicis.Classes.*;
import com.Marian.Exercicis.Classes.Poligonos.Quadrat;
import com.Marian.Exercicis.Classes.Poligonos.Triangle;
import com.Marian.Exercicis.ExExepcions.Exepcions;
import com.Marian.Exercicis.ExercicisP.*;
import com.Marian.Exercicis.Refactoritzar.Extraccions.*;
import com.Marian.Exercicis.Classes.Persones.Persona;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class
Main {

    public static void main(String[] args) {

        Condicionales deberes=new Condicionales();

        /*deberes.Ejercicio1Condicionales();
        deberes.Ejercicio2Condicionales();
        deberes.Ejercicio3Condicionales();
        deberes.Ejercicio4CondicionalesA();
        deberes.Ejercicio4CondicionalesB();
        deberes.Ejercicio5Condicionales();
        deberes.Ejercicio6Condicionales();
        deberes.Ejercicio7Condicionales();
        deberes.Ejercicio8Condicionales();
        deberes.Ejercicio9Condicionales();
        deberes.Ejercicio10Condicionales();
        deberes.Ejercicio11Condicionales();*/

        Bucles deberes1=new Bucles();
        //deberes1.Ejercicio1Bucles();
        //deberes1.Ejercicio2Bucles();
        //deberes1.Ejercicio3Bucles();
        //deberes1.Ejercicio4Bucles();
        //deberes1.Ejercicio5Bucles();
        //deberes1.Ejercicio6Bucles();
        //deberes1.Ejercicio7Bucle();
        //deberes1.Ejercicio8Bucles();
        //deberes1.Ejercicio9Bucles();
        //deberes1.Ejercicio10Bucle();
        //deberes1.Ejercicio11Bucles();
        //Bucles.Ejercicio12Bucles();
        //Bucles.Ejercicio1Extra();
        //Bucles.Ejercicio2Extra();
        //Bucles.Ejercicio3Extra();
        //Terminar Bucles.Ejercicio4Extra();

        //CondicionalesEnMetodos.numeroPositivoNegativo(4);
        //CondicionalesEnMetodos.multipleDe2(5);
        //CondicionalesEnMetodos.NumeroMayor(2,4);
        //CondicionalesEnMetodos.diaSetmana(2);
        //CondicionalesEnMetodos.momentDia(4);
        //CondicionalesEnMetodos.notas(6);
        //CondicionalesEnMetodos.diaMes(1,3,13);
        //CondicionalesEnMetodos.sebraEdat(5);

        //ExArrays.Ejercicio1AArrays();
        //ExArrays.Ejercicio1BArrays();
        //ExArrays.Ejercicio2Arrays();
        //ExArrays.Ejercicio3Arrays();
        //ExArrays.Ejercicio4Arrays();
        //ExArrays.Ejercicio5Arrays();
        //ExArrays.Ejercicio6Arrays();
        //ExArrays.Ejercicio7Arrays();
        //ExArrays.Ejercicio8Arrays();
        //ExArrays.Ejercicio9Arrays();
        //ExArrays.Ejercicio10Arrays();
        //ExArrays.Ejercicio11Arrays();
        //ExArrays.Ejercicio12Arrays();
        //ExArrays.Ejercicio13Arrays();

        //ExStrings.Ejercicio1Strings("hola");
        //ExStrings.Ejercicio2Strings();
        //ExStrings.Ejercicio3Strings("Hola me llamo manolo");
        //ExStrings.Ejercicio4Strings("Tomeu");
        //Ejercicio5Strings("cuando vas a venir");
        //ExStrings.Ejercicio6Strings("La luna no se ve");

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

        /*Quadrat quadrat = new Quadrat();
        quadrat.calcularperimetre(4,4,4,4);
        System.out.println(quadrat.getPerimetre());
        quadrat.calcularArea(5);
        System.out.println(quadrat.getArea());

        Triangle triangle = new Triangle();
        triangle.calcularperimetre(6,6,4);
        System.out.println(triangle.getPerimetre());
        triangle.calcularArea(6.6,4.5);
        System.out.println(triangle.getArea());*/

        //System.out.println(ExercicisDiversos.posicioValorMinim(new int[] {6,4,5,3,7,5,6,9}));
        //System.out.println(ExercicisDiversos.numerosOrdenats(new int[] {1,2,3,4,5,6,7,8}));
        //System.out.println(Arrays.toString(ExercicisDiversos.arrayAlReves(new int[] {1,2,3,4,5})));
        //System.out.println(ExercicisDiversos.sabreIndex(new int[] {7,5,8,2,6,9},3));
        //System.out.println(Arrays.toString(ExercicisDiversos.canviarValorArray(new int [] {2,8,9,5}, 1)));
        //System.out.println(ExercicisDiversos.retornarTrueOFalse(new int[] {1,2,3,4,5}));
        //System.out.println(ExercicisDiversos.serieFubonacci(new int[] {1,1,2,3,5,8,13}));
        //System.out.println(ExercicisDiversos.numeroMesRepetit(new int[] {7,2,3,2,6,2,3}));
        //System.out.println(ExercicisDiversos.calcularFactorial(4));
        //System.out.println(ExercicisDiversos.paraulaMesLlargaAlReves("Mañana cuando puta llegaras "));
        //System.out.println(ExercicisDiversos.paraulesAlReves("Hola me nom Marian "));
        //System.out.println(Arrays.toString(ExercicisDiversos.swap(new int[] {2,6,3,4,1,8}, 3)));
        //System.out.println(ExercicisDiversos.posicioParaula("Hola me nom Marian ", "Marian"));
        //System.out.println(ExercicisDiversos.numeroParaulaRepetida("Hola Marian dema Marian avui Marian ","Marian"));
        //System.out.println(ExercicisDiversos.quantitatDeParaulaMesLlarga("Hola me nom Muro "));

        //System.out.println(Recopilacio.exercici1(new int[] {9,5,7,3,6,7}));
        //System.out.println(Recopilacio.exercici2(new int[] {1,2,2,4,8,32}));
        //System.out.println(Recopilacio.exercici3(new int[] {0,1,4,9,16}));
        //System.out.println(Recopilacio.exercici4(new int[] {9,5,7,3,6,12}));
        //System.out.println(Recopilacio.exercici5("Hola Puala dema es la festa", 'l', 'a'));
        //System.out.println(Recopilacio.exercici6(new char[] {'a','e','c','e','k','e'}, 'c','e'));
        //System.out.println(Recopilacio.exercici7(new int[] {4,6,6,1,9}));
        //System.out.println(Recopilacio.exercici8("dema anire en es camp mariana"));
        //System.out.println(Recopilacio.exercici9("Hola a tots"));
        //System.out.println(Recopilacio.exrcici10(6));
        //System.out.println(Recopilacio.exercici11("ala madrid ala somos oso hoy"));
        //System.out.println(Recopilacio.exercici12("dema tornare tard"));

        //Exepcions.exercici1();
        //Exepcions.exercici2();
        //Exepcions.exercici3();
        //Exepcions.exercici4();

        //extractMethod.dadesPersona(persona1);
        //extractMethod.imprimirArray();
        //extractMethod.mitjananArray();
        System.out.println(extractMethod.paraulaMesLlargaInvertida("demà anire a sa platja "));



    }
}



