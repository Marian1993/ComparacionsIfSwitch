package com.Marian.Exercicis.Refactoritzar.Extraccions;

import com.Marian.Exercicis.Classes.Persones.Persona;

import java.util.Scanner;
import java.util.ArrayList;

public class extractMethod {

    private static Scanner sc = new Scanner(System.in);

    public static void method0(Persona persona) {
        System.out.println("Dades de la persona: " + DadesPersona(persona));
    }

    public static void method1() {

        int [] elements = new int[5];

        introduirNunmerosArray(elements);
        retornarArray(elements);
    }

    public static void method2() {


        int [] elements = new int[5];
        int sum = 0;
        double average;

      introduirNunmerosArray(elements);
      sumaTotaArray(elements, sum);

        average = (double)sum / elements.length;
        System.out.println("La suma és: " + average);
    }

    public static String method3(String frase) {
        String paraulaActualInversa = "";
        String paraulaMesLlargaInversa = "";

        int counter = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActualInversa = frase.charAt(i) + paraulaActualInversa;
            } else {
                if (paraulaActualInversa.length() > paraulaMesLlargaInversa.length()) {
                    paraulaMesLlargaInversa = paraulaActualInversa;
                }
                paraulaActualInversa = "";
            }
        }
        return paraulaMesLlargaInversa;
    }

    public static String method4(String frase) {
        String paraulaActual = "";
        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                paraulaActual = frase.charAt(i) + paraulaActual;
            } else {
                novaFrase += paraulaActual + ' ';
                paraulaActual = "";
            }
        }
        return novaFrase;
    }

    private static String DadesPersona(Persona persona){

        return"Nom: "  + persona.getName() + "Edat: " + persona.getAge();
    }
    private static void retornarArray(int[] num){

        System.out.println("Els números introduïts són:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
    private static void introduirNunmerosArray(int[] num){

        for (int i = 0; i < num.length; i++) {
            System.out.print("Introdueix un número: ");
            num[i] = sc.nextInt();
        }
    }
    private static void sumaTotaArray(int[] num, int total){

        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
    }

}
