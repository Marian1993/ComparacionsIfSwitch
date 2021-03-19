package com.Marian.Exercicis.ExercicisDeReforç;

public class Reforç2 {

    public static String retornarTemps(int segons){

        int hora = 0;
        int minuts = 0;
        int isegons = 0;

        hora = segons/3600;
        segons = segons - (hora*3600);

        minuts = segons/60;
        segons = segons - (minuts*60);

        isegons = segons/1;

        return "El resultado de la conversión és: " + hora + ":" + minuts +
                ":" + isegons;
    }
    public static String areaIPerimetro(int longitud){

        return "L'area d'aquest triangle es: " + (longitud*longitud)/2 + ", i el seu perimetre es: " + longitud*3;
    }
    public static double conteBancari(double deposit, int mesos){

        double depositAux = deposit;
        double interessos = 0;

        for (int i = 0; i < mesos; i++) {

            interessos += depositAux*0.01;
            depositAux -= interessos;
        }
        return interessos;
    }
    public static void taulaMultiplicar(int num){

        int numAux = num;

        for (int i = 1; i <= 10; i++) {

            System.out.println("" + num + " x " + "" + i + " = " + numAux*i);
        }
    }
    public static void cuadrat( int altura, int anchura){
        
        int [][] cuadrat = new int [altura][anchura];

        for (int i = 0; i < cuadrat.length; i++) {

            for (int j = 0; j < cuadrat[i].length; j++) {

                System.out.print('*');
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void contornCuadrat(int altura, int anchura){

        int [][] cuadrat = new int[altura][anchura];

        for (int i = 0; i < cuadrat.length; i++) {

            for (int j = 0; j < cuadrat[i].length; j++) {

                if (i == 0 || i == cuadrat.length-1){
                    System.out.print('*');
                    System.out.print(" ");
                }else if (j == 0 || j == cuadrat[j].length-1){
                    System.out.print('*');
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static String numPrimer(int num){

        int contador = 0;

        for (int i = 1; i <= num; i++) {

           if(num%i == 0){
               contador++;
           }
        }
        if (contador == 2){
            return "Es un número primer";
        }else{
            return "No es un número primer";
        }
    }


}
