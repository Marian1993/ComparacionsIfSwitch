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

        boolean continuar =  true;

        do{
            try{
                System.out.print("Posa un número: ");
                int numero = in.nextInt();
                in.nextLine();
                continuar = false;

            }catch (InputMismatchException e){
                System.out.println("Has de posar números, no es poden posar paraules.");
                in.nextLine();
            }
        }while(continuar);
    }
    public static void exercici3(){

        boolean continuar = true;

        do {
            try {
                System.out.print("Posa un número: ");
                int num = Integer.parseInt(in.nextLine());
                continuar = false;

            } catch (NumberFormatException e) {
                System.out.println("Has de posar un número");
            }
        }while (continuar);
    }
    public static void exercici4(){

        boolean continuar = true;

        do{
            try{
                System.out.print("Escriu una paraula: ");
                String paraula = in.nextLine();
                int num = Integer.parseInt(paraula);
                System.out.print("Escriu una segona paraula: ");
                String paraula2 = in.nextLine();
                int num2 = Integer.parseInt(paraula2);

                int divisio = num/num2;
                System.out.println("El resultat de divir el número de lletres que tenen les paraules es: " + divisio);
                continuar = false;

            }catch(NumberFormatException e){
                System.out.println("Has de posar una número");

            }catch (ArithmeticException e){
                System.out.println("No pots deixar un camp sense omplir");
            }
        }while (continuar);
    }
    public static void exercici5(){


    }
}
