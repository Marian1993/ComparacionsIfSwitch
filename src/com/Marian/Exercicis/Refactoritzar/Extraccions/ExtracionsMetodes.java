package com.Marian.Exercicis.Refactoritzar.Extraccions;

import com.Marian.Exercicis.Classes.Persones.Persona;

import java.util.Scanner;

public class ExtracionsMetodes {

    private static Scanner sc = new Scanner(System.in);

    public static void dadesPersona(Persona persona) {

        System.out.println("Dades de la persona: " + persona(persona));
    }

    public static void imprimirArray() {

        int[] elements = new int[5];

        introduirNunmerosArray(elements);
        retornarArray(elements);
    }

    public static void mitjananArray() {

        int[] elements = new int[5];
        double sum = 0;

        introduirNunmerosArray(elements);

        System.out.println("La suma és: " + sumaTotalArray(elements, sum));
    }

    public static String paraulaMesLlargaInvertida(String frase) {

        return invertirFrase(paraulaMesLlarga(frase));
    }

    public static String invertirParaula(String frase) {

        return invertirFrase(frase);
    }

    private static String persona(Persona persona) {

        return "\nNom: " + persona.getName() + "\nEdat: " + persona.getAge();
    }

    private static void retornarArray(int[] num) {

        System.out.println("Els números introduïts són:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    private static void introduirNunmerosArray(int[] num) {

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introdueix un número: ");
            num[i] = sc.nextInt();
        }
    }

    private static double sumaTotalArray(int[] num, double total) {

        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        return total/num.length;
    }

    private static String invertirFrase(String frase) {

        String paraulaActual = "";

        for (int i = 0; i < frase.length(); i++) {

            paraulaActual = frase.charAt(i) + paraulaActual;
        }
        return paraulaActual;
    }
    private static String paraulaMesLlarga(String frase){

        String paraulaNova = "";
        String paraulaMesLlargaInversa = "";

        for (int i = 0; i < frase.length(); i++) {

            if(frase.charAt(i) != ' '){
                paraulaNova += frase.charAt(i);
            }else{

                if (paraulaNova.length() > paraulaMesLlargaInversa.length()) {
                    paraulaMesLlargaInversa = paraulaNova;
                }
                paraulaNova = "";
            }
        }
        return paraulaMesLlargaInversa;
    }
}
