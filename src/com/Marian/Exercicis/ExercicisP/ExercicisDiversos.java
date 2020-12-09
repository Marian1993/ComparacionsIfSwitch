package com.Marian.Exercicis.ExercicisP;

public class ExercicisDiversos {

    public static void posicioValorMinim(int [] numeros){

        int numMinim = 10000000;
        int posicio = 0;

        for(int i=0 ; i<numeros.length ; i++){

            if(numMinim > numeros[i]){

                numMinim = numeros[i];
                posicio = i;
            }
        }
        posicio++;
        System.out.println(posicio);
    }
    public static void numerosOrdenats(int [] numeros){

        boolean creixent = false;
        boolean decreixent = false;

        for(int i=0 ; i<numeros.length-1 ; i++){

            if(numeros[i] < numeros[i+1]){

                creixent=true;
            }
            if(numeros[i] > numeros[i+1]){

                decreixent=true;
            }
        }
        if(creixent == true && decreixent == false){

            System.out.println("L'array es creixent");
        }
        else if(creixent == false && decreixent ==true){

            System.out.println("L'array es decreixent");
        }
    }
    public static void arrayAlReves (int [] numeros){

        for(int i=numeros.length-1 ; i>=0 ; i--){

            System.out.println(numeros[i]);
        }
    }
}
