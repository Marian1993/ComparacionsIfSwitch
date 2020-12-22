package com.Marian.Exercicis.ExercicisP;

public class Recopilacio {

    public static int diferenciaManorMajor(int[] numeros){

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
    public static boolean complirSuccecio(int [] numeros){

        int num = 1;
        int altrenum = 2;

        int [] arrayComparacio = new int[numeros.length];
        boolean arraysIguals = false;

        arrayComparacio[0] = num;
        arrayComparacio[1] = altrenum;

        for(int i = 1 ; i < arrayComparacio.length; i++){

            num = numeros[i-1]*numeros[i];

            if()
            arrayComparacio[i] = num;

        }

        for(int i = 0; i<numeros.length; i++){

            if (numeros[i] == arrayComparacio[i]){

                arraysIguals = true;

            }
            else {

                arraysIguals = false;
            }
        }
        return arraysIguals;
    }
    public static boolean complirSuccesio2(int[] numeros){

        boolean confirmacio = false;

        for(int i = 1; i < numeros.length; i++){

        int suma = 0;

        suma = numeros[i-1]*numeros[i];

        if(suma == numeros[i]){

            confirmacio = true;
        }else{
            confirmacio = false;
        }
        }
        return confirmacio;
    }
}
