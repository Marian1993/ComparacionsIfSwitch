package com.Marian.Exercicis.ExercicisP;

import java.util.Scanner;

public class ExStrings {

    private static Scanner in;

    public static void Ejercicio1Strings() {

        in = new Scanner(System.in);
        String value = in.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < value.length(); j++) {

            if (value.charAt(j) == 'a') {
                a++;
            } else if (value.charAt(j) == 'e') {
                e++;
            } else if (value.charAt(j) == 'i') {
                i++;
            } else if (value.charAt(j) == 'o') {
                o++;
            } else if (value.charAt(j) == 'u') {
                u++;
            }

        }
        System.out.println("a: " + a + "\ne: " + e + "\ni: " + i + "\no: " + o + "\nu: " + u);
    }
        public static void Ejercicio2Strings () {

            in = new Scanner(System.in);
            String valor = in.nextLine();


            valor = valor.replace(" ", "");
            valor = valor.replace(",", "");
            valor = valor.replace(".", "");

            int fin = valor.length()-1 ;
            int inicio = 0;
            boolean palindromo = true;

            while (inicio < fin) {

                if (valor.charAt(inicio) != valor.charAt(fin)) {
                    palindromo = false;
                }
                inicio++;
                fin--;
            }
            if (palindromo) {
                System.out.println("la palabra: " + valor + " es un palindromo");

            } else {
                System.out.println("la palabra: " + valor + " no es un palindromo");

            }

        }
        public static void Ejercicio3Strings(){

        in=new Scanner(System.in);
        String frase= in.nextLine();
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
    }
