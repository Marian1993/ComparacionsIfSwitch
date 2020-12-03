package com.Marian.Exercicis.ExercicisP;

import java.util.Scanner;

public class ExStrings {

    private static Scanner in;

    public static void Ejercicio1Strings(String frase) {

        char [] vocals = {'a','e','i','o','u'};
        int [] quantitatVocals = {0,0,0,0,0};

        for (int j = 0 ; j < frase.length() ; j++) {

            if (frase.charAt(j) == vocals[0]) {
                quantitatVocals[0]++;
            } else if (frase.charAt(j) == vocals[1]) {
                quantitatVocals[1]++;
            } else if (frase.charAt(j) == vocals[2]) {
                quantitatVocals[2]++;
            } else if (frase.charAt(j) == vocals[3]) {
                quantitatVocals[3]++;
            } else if (frase.charAt(j) == vocals[4]) {
                quantitatVocals[4]++;
            }
        }
        for (int x=0 ; x<quantitatVocals.length ; x++ ){
            System.out.println(vocals[x]+": "+quantitatVocals[x]);
        }
    }
        public static void Ejercicio2Strings (String frase) {

            frase = frase.replace(" ", "");
            frase = frase.replace(",", "");
            frase = frase.replace(".", "");

            int fin = frase.length()-1;
            int inicio = 0;
            boolean palindromo = true;

            while (inicio < fin) {

                if (frase.charAt(inicio) != frase.charAt(fin)) {
                    palindromo = false;
                }
                inicio++;
                fin--;
            }
            if (palindromo) {
                System.out.println("la palabra: " + frase + " es un palindromo");

            } else {
                System.out.println("la palabra: " + frase + " no es un palindromo");

            }

        }
        public static void Ejercicio3Strings(String frase){

        char [] vocals = {'a','e','i','o','u'};
        char lletra = 'z';
        int total= 0;

        for (int j=0 ; j<frase.length() ; j++){

            if(lletra == 'z'){
                for (int x=0 ; x< vocals.length ; x++){

                    if(vocals[x] == frase.charAt(j)) {
                        lletra = vocals[x];
                        total++;
                    }
                }
            }else if (lletra == frase.charAt(j)){
                total++;
            }
        }
        System.out.println(lletra+": "+total);
    }
        public static void Ejercicio4Strings(String paraula){

        int numLletres=0;

        for(int i=0 ; i<paraula.length() ; i++){

            numLletres++;
        }
        if (0==(numLletres%2)){
            System.out.println("La paraula es parell");
        }else{
            System.out.println("La paraula es senar");
        }
    }
    public static void Ejercicio5Strings(String frase){

        int numParell = 0;
        int numImparell = 0;
        int contador = 0;

        for (int i=0 ; i<frase.length() ; i++){

            if(frase.charAt(i) != ' '){
                contador++;
            }
            if (frase.charAt(i) == ' '){

               if (0 == (contador%2)){
                    numParell++;
                }else if (0 != (contador%2)){
                    numImparell++;
                }
                contador=0;
            }
        }
        if (0 == (contador%2)){
            numParell++;
        }else if (0 != (contador%2)){
            numImparell++;
        }
        System.out.println("Parales pars: " + numParell + "\nParaules impars: " + numImparell);
    }
    public static void Ejercicio6Strings(String frase){

        String fraseInvertida="";
        for(int i=frase.length()-1;i>=0;i--){

            fraseInvertida=fraseInvertida+frase.charAt(i);
        }
        System.out.println(fraseInvertida);
    }
}
