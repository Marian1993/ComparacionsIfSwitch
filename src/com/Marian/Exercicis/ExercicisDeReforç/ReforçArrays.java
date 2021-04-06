package com.Marian.Exercicis.ExercicisDeReforç;

import java.util.ArrayList;
import java.util.Scanner;

public class ReforçArrays {

    private static Scanner sc = new Scanner(System.in);

    public static void arrayInversa(){

        System.out.println("Quantitat de números");
        int repeticions = sc.nextInt();
        int [] arrayNum = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {

            System.out.print("Posa número: ");
            int numeros = sc.nextInt();
            arrayNum[i] = numeros;
        }
        for (int i = arrayNum.length-1; i >= 0; i--) {

            System.out.print(arrayNum[i]);
        }
    }
    public static void calcularMitjana(){

        System.out.println("Quantitat de números");
        int repeticions = sc.nextInt();
        int total = 0;

        for (int i = 0; i < repeticions; i++) {
            System.out.print("Posa número: ");
            int numeros = sc.nextInt();
            total += numeros;
        }
        System.out.println("La mitjana dels números introduïts per teclat es: " + total/repeticions);
    }
    public static void calcularMitjanes(){
        System.out.println("Quantitat de números");
        int repeticions = sc.nextInt();
        int totalP = 0;
        int repeticionP = 0;
        int totalN = 0;
        int repeticionsN = 0;
        int ceros = 0;

        for (int i = 0; i < repeticions; i++) {
            System.out.print("Posa número: ");
            int numeros = sc.nextInt();

            if(numeros > 0){
                totalP += numeros;
                repeticionP++;

            }else if(numeros < 0){
                totalN += numeros;
                repeticionsN++;

            }else {
                ceros++;
            }
        }
        System.out.println("La mitjana dels números positius introduïts per teclat es: " + totalP/repeticionP);
        System.out.println("La mitjana dels números negatius introduïts per teclat són: " + totalN/repeticionsN);
        System.out.println("S'han introduït " + ceros + " ceros");
    }
    public static void retornarNumeros(){
        ArrayList arrayNum = new ArrayList();

        for (int i = 0; i < 6; i++) {

            System.out.print("Posa número: ");
            int numeros = sc.nextInt();
             arrayNum.add(numeros);
        }
        for (int i = 0; i < 3; i++) {

            System.out.println(arrayNum.get(0));
            arrayNum.remove(0);
            System.out.println(arrayNum.get(arrayNum.size()-1));
            arrayNum.remove(arrayNum.size()-1);

        }
    }
    public static int[] juntarArrays(){

        int [] primerArray = new int [] {2,3,4,5,8,9};
        int [] segonArray = new int[] {6,7,8,9};
        int posicio = 0;

        int [] arrayFinal = new int[primerArray.length + segonArray.length];

        for (int i = 0; i < primerArray.length; i++) {

            arrayFinal[posicio] = primerArray[i];
            posicio++;
            if(!(i > segonArray.length)) {
                for (int j = i; j < segonArray.length; j++) {

                    if (i == primerArray.length - 1) {
                        arrayFinal[posicio] = segonArray[j];
                        posicio++;

                    } else {
                        arrayFinal[posicio] = segonArray[j];
                        posicio++;
                        break;
                    }
                }
            }
        }
        return arrayFinal;
    }
    public static int[] juntarArraysDiferent(int num){
        int [] primerArray = new int [] {2,3,4,5};
        int [] segonArray = new int[] {6,7,8,8,9,0,6};
        int posicio = 0;
        int auxJ = 0;
        int numAux = 0;

        int [] arrayFinal = new int[primerArray.length + segonArray.length];

        for (int i = 0; i < primerArray.length; i++) {
            arrayFinal[posicio] = primerArray[i];
            posicio++;
            numAux++;

            if(numAux == num || i == primerArray.length-1){
                numAux = 0;

                for (int j = auxJ; j < segonArray.length; j++) {

                    arrayFinal[posicio] = segonArray[j];
                    posicio++;
                    auxJ++;
                    numAux++;

                    if(numAux == num && !(i == primerArray.length-1)) {
                        numAux = 0;
                        break;
                    }
                }

            }
        }
        return arrayFinal;
    }
}
