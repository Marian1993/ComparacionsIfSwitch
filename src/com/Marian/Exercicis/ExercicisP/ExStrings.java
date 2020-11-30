package com.Marian.Exercicis.ExercicisP;

import java.util.Scanner;

public class ExStrings {

    private static Scanner in;

    public static void Ejercicio1Strings(String frase) {

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < frase.length(); j++) {

            if (frase.charAt(j) == 'a') {
                a++;
            } else if (frase.charAt(j) == 'e') {
                e++;
            } else if (frase.charAt(j) == 'i') {
                i++;
            } else if (frase.charAt(j) == 'o') {
                o++;
            } else if (frase.charAt(j) == 'u') {
                u++;
            }
        }
        System.out.println("a: " + a + "\ne: " + e + "\ni: " + i + "\no: " + o + "\nu: " + u);
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

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        boolean primeravocal=true;

        for (int j=0;j<frase.length();j++){

            if(frase.charAt(j) == 'a'){

            }
            if(frase.charAt(j) == 'e'){

            }
            if(frase.charAt(j) == 'i'){

            }
            if(frase.charAt(j) == 'o'){

            }
            if(frase.charAt(j) == 'u'){

            }

        }

    }
        public static void Ejercicio4Strings(String paraula){

        int numLletres=0;

        for(int i=0;i<paraula.length();i++){

            numLletres++;
        }
        if (0==(numLletres%2)){
            System.out.println("La paraula es parell");
        }else{
            System.out.println("La paraula es senar");
        }
    }
    public static void Ejercicio5Strings(String frase){

    }
    public static void Ejercicio6Strings(String frase){

        String fraseInvertida="";
        for(int i=frase.length()-1;i>=0;i--){

            fraseInvertida=fraseInvertida+frase.charAt(i);
        }
        System.out.println(fraseInvertida);
    }
}
