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
    public static int exercici4(int[] numeros){

        int repeticions = 0;

        for (int numero : numeros) {
            int contador = 2;
            boolean primo=true;

            while ((primo) && (contador != numero)) {

                if (numero % contador == 0) {
                    primo = false;
                }
                contador++;
            }
            if (primo) {

                repeticions++;
            }
        }
        return repeticions;
    }

    public static int exercici5(String frase, char lletra1, char lletra2){

        int repeticions = 0;
        String[] fraseDefinitiva = frase.split(" ");

        for(int i = 0; i < fraseDefinitiva.length;  i++){

            for (int j = 0 ; j < fraseDefinitiva[i].length() ; j++){

                if(fraseDefinitiva[i].charAt(fraseDefinitiva[i].length()-1) == 'l'){

                }
                else if(fraseDefinitiva[i].charAt(j) == 'l' && fraseDefinitiva[i].charAt(j+1) == 'a'){

                    repeticions++;
                }
            }
        }
        return repeticions;
    }

    public static int exercici6(char[] lletres, char lletra1, char lletra2){

        int repeticions = 0;
        int contador = 0;

        for(int i = 0; i < lletres.length; i++){

            if(lletres[i] == lletra1 && contador ==0){

                contador++;
            }
            if(lletres[i] == lletra2 && contador ==1){

                repeticions++;
            }
        }
        return repeticions;
    }
    public static int exercici7 (int[] numeros){

        int index = 0;
        double suma = 0;
        double mitjana = 0;
        double [] diferenciNumeros = new double[numeros.length];

        for (int i = 0; i < numeros.length; i++) {

            suma += numeros[i];
        }
        mitjana = suma / numeros.length;
        for(int i = 0; i < numeros.length; i++){

            diferenciNumeros[i] = Math.abs(numeros[i]-mitjana);
        }
        for(int i = 0; i < diferenciNumeros.length; i++){

            if(diferenciNumeros[index]>diferenciNumeros[i]){

                index = i;
            }
        }

        return numeros[index];
    }
    public static String exercici8(String frase){

        String paraula = "";
        int quantitatFinal = 0;
        String[] arrayFrase = frase.split(" ");
        char [] vocals = {'a','e','i','o','u'};

        for (int i = 0; i < arrayFrase.length; i++) {

            int quantitat = 0;

            for (int j = 0; j < arrayFrase[i].length(); j++) {

                for (int k = 0; k < vocals.length; k++) {

                    if(arrayFrase[i].charAt(j) == vocals[k]){

                        quantitat++;
                    }
                }
            }
            if(quantitatFinal < quantitat){

                paraula = arrayFrase[i];
            }
        }
        return  paraula;
    }
    public static String exercici9(String frase){

        String[] arrayFrase = frase.split(" ");
        String fraseInversa = "";

        for (int i = arrayFrase.length-1; i >= 0 ; i--) {

            fraseInversa += arrayFrase[i]+" ";
        }
        return fraseInversa;
    }
    public static boolean exrcici10(int numero){

        boolean perfecte = false;
        int suma = 0;

        for (int i = 1; i < numero; i++) {

            if(numero % i == 0){

                suma = suma + i;
            }
        }
        if (suma  == numero){
            perfecte = true;
        }else {
            perfecte = false;
        }
        return perfecte;
    }
    public static int exercici11(String frase){

        int quantitatPalindromos = 0;
        String [] arrayFrase = frase.split(" ");


        for (int i = 0; i < arrayFrase.length; i++) {

            boolean palindromo= false;
            int fi = arrayFrase[i].length()-1;
            int inici = 0;

            for (int j = 0; j < arrayFrase[i].length()-1; j++) {

                if(arrayFrase[i].charAt(inici) == arrayFrase[i].charAt(fi)){

                    palindromo = true;
                    fi--;
                    inici++;
                }else {
                palindromo = false;
                }
            }
            if (palindromo == true){
                quantitatPalindromos++;
            }
        }
        return quantitatPalindromos;
    }

    public static String exercici12(String frase){

        String[] arrayFrase = frase.split(" ");
        String fraseInversa = "";

        for (int i = 0; i < arrayFrase.length; i++) {

            for (int j = arrayFrase[i].length()-1; j >= 0; j--) {

                fraseInversa += arrayFrase[i].charAt(j);

            }
            fraseInversa += " ";
        }
        return fraseInversa;
    }


    public static int numMayor(int[] numeros){

        int numMayor = 0;

        for( int i = 0; i < numeros.length; i++){

            if(numMayor < numeros[i]){

                numMayor = numeros [i];
            }
        }
        return numMayor;
    }

}
