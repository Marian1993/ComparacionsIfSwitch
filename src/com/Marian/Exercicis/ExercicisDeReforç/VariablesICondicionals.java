package com.Marian.Exercicis.ExercicisDeReforç;

import static sun.swing.MenuItemLayoutHelper.max;

public class VariablesICondicionals {

    public static int numMesGran(int a, int b){

        int c = max(a,b);
        return c;
    }

    public static boolean multiples(int a, int b){

        if(a % b == 0 || b % a == 0){
            return true;
        }
        return false;
    }
    public static int longitudNum(int num){

        int llargaria = 0;

        if(num < 10000) {
            while (num != 0){

                num = num/10;
                llargaria++;
            }
            return llargaria;
        }
        return -1;
    }
    public static int retornarNumAlReves(int num){

        int numAux = 0;
        int numInvers = 0;

      while(num != 0){

          numAux = num%10;
          numInvers = (numInvers*10) + numAux;
          num /= 10;
      }
        return numInvers;
    }

    public static int diferenciaFetxes(int dia, int mes, int any, int diaCom, int mesCom, int anyCom ){

        int[] dies31 = {1,3,5,7,8,10,12};
        int[] dies30 = {4,6,9,11};
        int[] dies28 = {2};

        return -1;
    }
    public static String mostrarHora(int hora, int minuts, int segons){

        int minAux = minuts;
        int segAux = segons + 1;
        int horaAux = hora;


        if(segAux == 60) {
            segAux = 0;
            minAux++;
        }
        if(minAux == 60){
            minAux = 0;
            horaAux++;
        }
        else{
            return "Hora " + horaAux + ":" + minAux + ":" + segAux;
        }

        return "Hora " + horaAux + ":" + minAux + ":" + segAux;
    }
    public static String convertirSegons(int segons){

        int hora = 0;
        int minut = 0;
        int isegons = 0;

        hora = segons/3600;
        segons = segons - (hora * 3600);

        minut = segons/60;
        segons = segons - (minut * 60);

        isegons = segons/1;
        segons = segons -(isegons * 1);

        return "Hora " + hora + ":" + minut + ":" +isegons;

    }




}
