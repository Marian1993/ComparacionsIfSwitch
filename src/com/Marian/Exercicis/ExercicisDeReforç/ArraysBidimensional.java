package com.Marian.Exercicis.ExercicisDeReforç;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBidimensional {

    private static Scanner sc = new Scanner(System.in);

    public static void sumFilesIColumnes() {

        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = i + j;
            }
        }
        imprimirArrayBidimensional(array);
    }
    public static boolean arrayBidimensionalSimetrica(){

        int[][] array = new int[3][3];
        int[][] arrayAux = new int[3][3];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print("Introdueix un número per l'array: ");
                array[i][j]= sc.nextInt();
                arrayAux[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if(array[i][j] != arrayAux [i][j]){

                    return false;
                }
            }
        }
        return true;
    }
    public static void sumaArrays(int[][] array, int[][] arrayAux){

        if (longitudArray(array) == longitudArray(arrayAux)) {

            int[][] sumaArrays = new int[array.length][array[0].length];

            for (int i = 0; i < sumaArrays.length; i++) {

                for (int j = 0; j < sumaArrays[i].length; j++) {

                    sumaArrays[i][j] = array[i][j] + arrayAux[i][j];
                }
            }
            imprimirArrayBidimensional(sumaArrays);
        }else {
            System.out.println("Les arrays son de diferents mesures");
        }
    }
    public static void canviarFilesPerColumnes(){

        int[][] array = {{1, 7, 4}, {5, 12, 10}, {2, 1, 15}};
        int[][] arrayAux = new int[3][3];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                arrayAux[i][j] = array[j][i];

            }
        }
        imprimirArrayBidimensional(array);
        System.out.println();
        imprimirArrayBidimensional(arrayAux);
    }
    public static void matriuIdentitat(){

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array[i].length; j++) {

                array[i][j] = 1;
                break;
            }
        }
        imprimirArrayBidimensional(array);
    }
    public static void sumValorsFilesIColumnes(){

        int[][] array = {{1, 9, 3}, {2, 11, 3}, {8, 6, 11}};
        int[] sumColumnes = new int[array.length];
        int[] sumFiles = new int[array.length];

        int numFiles = 0;
        int numFilesAux = 0;
        int numColumnes = 0;
        int numColumnesAux = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                numFiles = array[j][i];
                numFilesAux += numFiles;

                numColumnes = array[i][j];
                numColumnesAux += numColumnes;

                if(array[i].length-1 == j){
                    sumColumnes[i] = numFilesAux;
                    sumFiles[i] = numColumnesAux;
                }
            }
        }
        System.out.println("Files: ");
        imprimirArray(sumFiles);
        System.out.println("Columnes: ");
        imprimirArray(sumColumnes);
    }
    private static void imprimirArrayBidimensional(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    private static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {

            System.out.println("Suma " + i + " : " + array[i]);

        }
    }
    private static int longitudArray(int[][] array){

        int lenghtArray = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                lenghtArray++;
            }
        }
        return lenghtArray;

    }
}


