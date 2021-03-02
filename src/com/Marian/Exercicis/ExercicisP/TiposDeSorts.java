package com.Marian.Exercicis.ExercicisP;

public class TiposDeSorts {

    public static void selectionSort() {
    int[] num = {5,3,1,4,2,9,8};

        int indexMesPetit = 0;
        int indexComparacio = 0;
        int numAuxiliar = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = indexComparacio; j < num.length; j++) {

                if(num[indexMesPetit] > num[j]){

                    indexMesPetit = j;
                }
            }
                numAuxiliar = num[indexComparacio];
                num[indexComparacio] = num[indexMesPetit];
                num[indexMesPetit] = numAuxiliar;
                indexComparacio++;
                indexMesPetit = indexComparacio;

            System.out.println(num[i]);
        }
    }

     public static void bubbleSort() {
         int[] num = {2, 5, 4, 1, 6, 3};

         for (int i = 0; i < num.length; i++) {
             int numAux = 0;

             for (int j = 0; j < num.length -1 -i ; j++) {

                 if (num[j] > num[j + 1]) {

                     numAux = num[j + 1];
                     num[j + 1] = num[j];
                     num[j] = numAux;
                 }
             }
         }
         for (int i = 0; i < num.length; i++) {

             System.out.println(num[i]);
         }
     }
     public static void coctail(){

        int[] num ={4,6,2,1,5,3};
        int longitud = num.length;

         for (int i = 0; i < num.length; i++) {
             int numAux = 0;

             for (int j = longitud -1  ; j > 0 ; j--) {

                 if(num[j] < num[j-1]){

                     numAux = num[j-1];
                     num[j-1] = num[j];
                     num[j] = numAux;

                 }
             }
             for (int k = 0; k < num.length; k++) {

                 if(num[k]>num[k+1]){
                     numAux = num[k + 1];
                     num[k + 1] = num[k];
                     num[k] = numAux;

                 }
             }
             longitud--;
         }
         for (int i = 0; i < num.length; i++) {
             System.out.println(num[i]);

         }
     }


}
