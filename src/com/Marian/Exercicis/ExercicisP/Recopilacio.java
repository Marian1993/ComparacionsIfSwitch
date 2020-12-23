package com.Marian.Exercicis.ExercicisP;

public class Recopilacio {

    public static int exercici1(int[] numeros){

        int numMenor = 0;
        int numMayor = 0;
        int numAuxiliar = 0;

        for (int i = 0; i < numeros.length; i++){

            if(numMayor<numeros[i]){

                numMayor = numeros[i];
            }
        }
        numAuxiliar = numMayor;
        for (int i = 0; i < numeros.length; i++) {

            if(numAuxiliar > numeros[i]){

                numAuxiliar = numeros[i];
                numMenor = numeros[i];
            }
        }
        numAuxiliar = 0;

        while(numMenor<numMayor){
            numAuxiliar++;
            numMenor++;
        }
        return numAuxiliar;
    }

    public static boolean exercici2(int[] numeros){

        boolean confirmacio = false;

        for(int i = 2; i < numeros.length; i++){

        int suma = 0;

        suma = numeros[i-1]*numeros[i-2];

        if(suma == numeros[i]){

            confirmacio = true;
        }else{
            confirmacio = false;
        }
        }
        return confirmacio;
    }
    public static boolean exercici3(int [] numeros){

        int[] index = {0, 1, 2, 3 ,4};
        boolean esCorrecte = false;

        for(int i = 0; i < index.length; i++){
         int suma = 0;

         suma = (int)Math.pow(index[i], 2);

         if(suma == numeros[i]){

             esCorrecte = true;
         }else {

             esCorrecte = false;
         }

        }
        return esCorrecte;
    }
    public static int[] exercici4(int[] numeros){


    }
}
