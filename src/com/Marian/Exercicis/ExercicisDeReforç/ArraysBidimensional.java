package com.Marian.Exercicis.ExercicisDeReforç;

import java.util.Scanner;

public class ArraysBidimensional {

    private static Scanner sc = new Scanner(System.in);

    public static void sumFilesIcolumnes() {

        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = i + j;
                System.out.print(array[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
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
}
