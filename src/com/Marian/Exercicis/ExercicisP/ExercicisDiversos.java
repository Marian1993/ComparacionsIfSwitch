package com.Marian.Exercicis.ExercicisP;

public class ExercicisDiversos {

    public static void posicioValorMinim(int [] numeros){

        int numMinim = 10000000;
        int posicio = 0;

        for(int i=0 ; i<numeros.length ; i++){

            if(numMinim > numeros[i]){

                numMinim = numeros[i];
                posicio = i+1;
            }
        }
        System.out.println(posicio);
    }
    public static void numerosOrdenats(int [] numeros){

        boolean decreixent = false;

        for(int i=0 ; i<numeros.length-1 ; i++){

            if(numeros[i] > numeros[i+1]){

                decreixent = true;
            }
            else{
                decreixent = false;
            }
        }
        if(decreixent == true){

            System.out.println(decreixent);
        }
        else{

            System.out.println(decreixent);
        }
    }
    public static void arrayAlReves (int [] numeros){

        for(int i=numeros.length-1 ; i>=0 ; i--){

            System.out.println(numeros[i]);
        }
    }
    public static void sabreIndex (int [] numeros, int num){

        int index = 0;

        for(int i=0; i<numeros.length-1 ; i++){

            if(num == numeros[i]){

                index = i+1;
            }
        }
        System.out.println("La posicio es: " + index);
    }
    public static void canviarValorArray (int[] numeros, int numero){

        int numero2 = 0;

        for(int i=0 ; i<numeros.length ; i++){

            if(numero2 < numeros[i]){

                numeros[numero2] = numeros[i];
            }
            if(numero == i){

                numeros[numero] = numeros[i];
            }
        }
        int auxiliar = numeros[numero2];
        numeros[numero2] = numeros[numero];
        numeros[numero] = auxiliar;

        for ( int i=0 ; i<numeros.length ; i++){

            System.out.println(numeros[i]);

        }
    }
    public static void retornarTrueOFalse(int [] numeros){

        boolean ascendent = false;
        for( int i=0 ; i<numeros.length-1 ; i++){

            if(numeros[i] < numeros[i+1]){

                ascendent=true;
            }
            else{
                ascendent = false;
            }
        }
        if(ascendent == true){

            System.out.println(ascendent);
        }else{
            System.out.println(ascendent);
        }

    }
    public static void serieFubonacci(int [] numeros){

        int a = 0;
        int b = 1;
        int c;
        boolean esCompleix = false;

        for(int i=0 ; i<numeros.length-1 ; i++){

            c = a + b;
            a = b;
            b = c;
            if (numeros[i] == a){

                esCompleix=true;
            }
            else {
                esCompleix=false;
            }
        }
        if(esCompleix == true){

            System.out.println(esCompleix);
        }
        else {
            System.out.println(esCompleix);
        }

    }

}
