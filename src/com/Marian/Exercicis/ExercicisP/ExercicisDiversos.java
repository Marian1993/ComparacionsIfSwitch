package com.Marian.Exercicis.ExercicisP;

public class ExercicisDiversos {

    public static int posicioValorMinim(int [] numeros){

        int numMinim = 10000000;
        int posicio = 0;

        for(int i=0 ; i<numeros.length ; i++){

            if(numMinim > numeros[i]){

                numMinim = numeros[i];
                posicio = i+1;
            }
        }
        return posicio;
    }
    public static boolean numerosOrdenats(int [] numeros){

        boolean decreixent = false;

        for(int i=0 ; i<numeros.length-1 ; i++){

            if(numeros[i] > numeros[i+1]){

                decreixent = true;
            }
            else{
                decreixent = false;
            }
        }
        return decreixent;
    }
    public static int [] arrayAlReves (int [] numeros){

        for(int i=numeros.length-1 ; i>=0 ; i--){

        }
        return numeros;
    }
    public static int sabreIndex (int [] numeros, int num){

        int index = -1;

        for(int i=0; i<numeros.length-1 ; i++){

            if(num == numeros[i]){

                index = i+1;
            }
        }
        return index;
    }
    public static int [] canviarValorArray (int[] numeros, int posicio){

        int numeroMesAltIndex = 0;

        for(int i=0 ; i<numeros.length ; i++){

            if(numeros[numeroMesAltIndex] < numeros[i]){

                numeroMesAltIndex = i;
            }
        }
        int auxiliar = numeros[numeroMesAltIndex];
        numeros[numeroMesAltIndex] = numeros[posicio];
        numeros[posicio] = auxiliar;

        return numeros;
    }
    public static boolean retornarTrueOFalse(int [] numeros){

        boolean ascendent = false;
        for( int i=0 ; i<numeros.length-1 ; i++){

            if(numeros[i] < numeros[i+1]){

                ascendent=true;
            }
            else{
                ascendent = false;
            }
        }
       return ascendent;

    }
    public static boolean serieFubonacci(int [] numeros){

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
       return esCompleix;
    }
    public static int numeroMesRepetit(int [] numeros){

        int numMesRepetit = 0;
        int numDeRepeticions = 0;

        for (int i=0 ; i<numeros.length ; i++){

            for (int j=0 ; j<numeros.length ; j++) {
                if (numeros[i] == numeros[j]) {

                    numMesRepetit = numeros[i];
                    numDeRepeticions++;
                }
            }
        }
        return numMesRepetit;
    }
    public static int calcularFactorial (int numero){

        int resultat = 1;

        for (int i=numero  ; i>0 ; i--){
            resultat=resultat*i;
        }
        return resultat;
    }
    public static String paraulaMesLlargaAlReves (String frase){

        String paraulaLlarga = " ";
        int llargaria = 0;
        String paraulaAlReves;

        for (char i=0 ; i<frase.length() ; i++){

            if(!(frase.length() == ' ')) {
                paraulaLlarga += i;
                llargaria++;
            }else if (frase.length() == ' '){

                llargaria = 0;
            }


        }
        return paraulaLlarga;
    }

}
