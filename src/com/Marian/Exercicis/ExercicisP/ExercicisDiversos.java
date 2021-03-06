package com.Marian.Exercicis.ExercicisP;

public class ExercicisDiversos {

    public static int posicioValorMinim(int[] numeros) {

        int posicio = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[posicio] > numeros[i]) {

                posicio = i;
            }
        }
        return posicio+1;
    }

    public static boolean numerosOrdenats(int[] numeros) {

        boolean decreixent = false;

        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] > numeros[i + 1]) {

                decreixent = true;
            } else {
                decreixent = false;
            }
        }
        return decreixent;
    }

    public static int[] arrayAlReves(int[] numeros) {

        int [] arrayInvertida = new int[numeros.length];
        int auxiliar = 0;

        for (int i = numeros.length - 1; i >= 0; i--) {

            arrayInvertida[auxiliar] = numeros[i];
            auxiliar++;

        }
        return arrayInvertida;
    }

    public static int sabreIndex(int[] numeros, int num) {

        int index = -1;

        for (int i = 0; i < numeros.length - 1; i++) {

            if (num == numeros[i]) {

                index = i + 1;
            }
        }
        return index;
    }

    public static int[] canviarValorArray(int[] numeros, int posicio) {

        int numeroMesAltIndex = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[numeroMesAltIndex] < numeros[i]) {

                numeroMesAltIndex = i;
            }
        }
        int auxiliar = numeros[numeroMesAltIndex];
        numeros[numeroMesAltIndex] = numeros[posicio];
        numeros[posicio] = auxiliar;

        return numeros;
    }

    public static boolean retornarTrueOFalse(int[] numeros) {

        boolean ascendent = false;
        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] < numeros[i + 1]) {

                ascendent = true;
            } else {
                ascendent = false;
            }
        }
        return ascendent;

    }

    public static boolean serieFubonacci(int[] numeros) {

        int a = 0;
        int b = 1;
        int c;
        boolean esCompleix = false;

        for (int i = 0; i < numeros.length - 1; i++) {

            c = a + b;
            a = b;
            b = c;
            if (numeros[i] == a) {

                esCompleix = true;
            } else {
                esCompleix = false;
            }
        }
        return esCompleix;
    }

    public static int numeroMesRepetit(int[] numeros) {

        int contadorGlobal = 0;
        int numeroGlobal = 0;

        for (int i = 0; i < numeros.length; i++) {

            int contador = 0;
            int numero = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {

                    contador++;
                    numero = numeros[i];
                }
            }
            if(contador>contadorGlobal){

                contadorGlobal = contador;
                numeroGlobal = numero;
            }

        }
        return numeroGlobal;
    }

    public static int calcularFactorial(int numero) {

        int resultat = 1;

        for (int i = numero; i > 0; i--) {
            resultat = resultat * i;
        }
        return resultat;
    }

    public static String paraulaMesLlargaAlReves(String frase) {

        String paraulaActual = "";
        String paraulaLlarga = "";
        String paraulaAlReves = "";

        for (int i = 0; i < frase.length(); i++) {

            if (!(frase.charAt(i) == ' ')) {
                paraulaActual += frase.charAt(i);


            } else if (frase.charAt(i) == ' ') {

                if (paraulaActual.length() > paraulaLlarga.length()) {

                    paraulaLlarga = paraulaActual;
                }
                paraulaActual = "";
            }
        }
        for (int j = paraulaLlarga.length()-1; j >= 0; j--) {

            paraulaAlReves += paraulaLlarga.charAt(j);
        }
        return paraulaAlReves;
    }

    public static int quantitatDeParaulaMesLlarga(String frase) {

        int numActual = 0;
        int numcomparacio = 0;
        int numRepeticions = 0;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) != ' ') {

                numActual++;

            } else{
                if(numActual > numcomparacio) {

                    numcomparacio = numActual;
                }
                numActual = 0;
            }
        }
        for(int j=0 ; j<frase.length() ; j++){

            if(frase.charAt(j) != ' '){
                numActual++;
            }else{

                if(numActual == numcomparacio){
                    numRepeticions++;
                }
                numActual = 0;
            }
        }
        return numRepeticions;

    }
    public static int posicioParaula(String frase, String paraula){

        String paraulaComparada = "";
        int posicio = 0;

        for(int i=0 ; i<frase.length() ; i++){

            if(frase.charAt(i) != ' '){

                paraulaComparada += frase.charAt(i);


            }else{
                posicio += 1;

                if(paraula.equalsIgnoreCase(paraulaComparada)){

                    return posicio;
                }
                paraulaComparada = "";
            }
        }
        if(paraula.equalsIgnoreCase(paraulaComparada)){

            return posicio;
        }

        return -1;
    }
    public static int numeroParaulaRepetida(String frase, String paraula){

        String paraulaAComparada = "";
        int repeticions = 0;

        for(int i=0 ; i<frase.length() ; i++){

            if(frase.charAt(i) != ' '){

                paraulaAComparada += frase.charAt(i);

            }else {

                if (paraula.equalsIgnoreCase(paraulaAComparada)) {

                    repeticions++;
                }
                paraulaAComparada = "";
            }
        }
        return repeticions;
    }
    public static String paraulesAlReves(String paraules){

        String paraulesInvertides = "";
        String paraulaGuardada = "";

        for(int i=0 ; i<paraules.length() ; i++){

            if(!(paraules.charAt(i) == ' ')){
                paraulaGuardada += paraules.charAt(i);

            }else if(paraules.charAt(i) == ' '){

                for(int j=0 ; j<1 ; j++) {

                    for( int z=paraulaGuardada.length()-1 ; z>=0 ; z-- )
                    paraulesInvertides += paraulaGuardada.charAt(z);
                }
                paraulesInvertides += " ";
                paraulaGuardada = "";
            }
        }

        return paraulesInvertides;
    }

    //Es el mateix exercici que canviarValorArray de una altre manera.
    public static int[] swap(int[] numeros, int posicio){

        int max = 0;
        int index = 0;

        for(int i=0 ;i<numeros.length ; i++){
            if(numeros[i] > max){
                max = numeros[i];
                index = i;
            }
        }
        int aux = numeros[posicio];
        numeros[posicio] = max;
        numeros[index]=aux;


        return numeros;
    }
}

