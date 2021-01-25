package com.Marian.Exercicis.ExExepcions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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

        boolean continuar = true;

        do{
            try{
                System.out.print("Escriu a l'index del cual vols sabre el valor: ");

                int[] array =  new int[]{1,2,3,4};
                int numIndex = in.nextInt();
                System.out.println(array[numIndex]);
                continuar = false;
                in.nextLine();

            }catch (IndexOutOfBoundsException e){
                System.out.println("Has posat un número d'index que no existeix a l'array.");

            }catch (InputMismatchException e){
                System.out.println("Has de posar un número");
                in.nextLine();
            }
        }while(continuar);
    }
    public static void readFile(File file) throws IOException {

        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e){
            System.err.println("No se ha podido leer el documento");

        } finally {
            if (input != null) {
                input.close();
            }
        }


    }
}
