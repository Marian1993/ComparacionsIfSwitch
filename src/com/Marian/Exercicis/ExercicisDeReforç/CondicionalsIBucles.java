package com.Marian.Exercicis.ExercicisDeReforç;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CondicionalsIBucles {


    private static Scanner sc = new Scanner(System.in);

    public static void elevarAlCuadrado(){
        int num;

        do{
            num = sc.nextInt();
            if(num > 0) {
                System.out.println((int) Math.pow(num, 2));
            }
        }
        while (num > 0);
    }

    public static int sumaDelsQuadrats(){

        int num;
        int suma = 0;

        do{
            num = sc.nextInt();
            if (num > 0) {
                System.out.println((int) Math.pow(num, 2));
                suma += (int)Math.pow(num, 2);
            }
        }while(num > 0);

        return suma;
    }
    public static void multipleIQuantitat(){

        int num;
        int repeticions = 0;

        do{
            num = sc.nextInt();
            repeticions++;

            if(num%2 == 0){
                System.out.println("Es multiple de dos.");
            }else {
                System.out.println("no es multiple de dos.");
            }
        }while(num%2 == 0);

        System.out.println("Quantitat de números introduits " + repeticions);

    }
}
