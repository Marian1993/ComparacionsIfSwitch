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

        for (int i = 1; i < 11; i++) {

            System.out.println("" + num + " x " + "" + i + " = " + numAux*i);
        }
    }

}
