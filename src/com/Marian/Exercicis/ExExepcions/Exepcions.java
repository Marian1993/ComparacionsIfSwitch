package com.Marian.Exercicis.ExExepcions;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcions {

    private static Scanner in = new Scanner(System.in);
    public static void exercici1(){

        int numero = 0;
        int numeroDivisor = 0;


        do {
            try {
                System.out.print("Posa un número: ");
                numero = in.nextInt();
                System.out.print("Posa el número per el cual el vols dividir: ");
                numeroDivisor = in.nextInt();

                int resultat = numero / numeroDivisor;
                System.out.println("El resultat es: " + resultat);

            } catch (ArithmeticException e) {
                System.out.println("No es pot dividir per el número 0");
            }
        }while(numero == 0 || numeroDivisor ==0);
    }
    public static void exercici2(){

        int numero = 0;
        boolean continuar;
        do{
            try{
                continuar = false;
                System.out.print("Posa un número: ");
                numero = in.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Has de posar números, no es poden posar paraules.");
                in.nextInt();
                continuar = true;
            }
        }while(continuar);
    }
}
