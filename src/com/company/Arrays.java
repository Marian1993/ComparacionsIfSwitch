
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static void Ejercicio1AArrays(){

        int [] num= new int[4];

        num[0]=20;
        num[1]=45;
        num[2]=6;
        num[3]=28;

        System.out.println("1: "+num[0]+"\n2: "+num[1]+"\n3: "+num[2]+"\n4: "+num[3]);
    }
    public static void Ejercicio1BArrays(){
        int [] num= new int[4];

        num[0]=20;
        num[1]=45;
        num[2]=6;
        num[3]=28;

        for(int i=0;i<4;i++){

            System.out.println("Numero "+num[i]);
        }
    }
    public static void Ejercicio2Arrays(){

        Scanner in=new Scanner(System.in);
        int [] num= new int[4];
        ArrayList numeros= new ArrayList();

        for(int i=0;i<4;i++){

            num[i]=in.nextInt();
            numeros.add(num[i]);
        }
        System.out.println("Los números son: "+numeros);
    }
    public static void Ejercicio3Arrays(){

        Scanner in=new Scanner(System.in);
        int [] num= new int[4];
        ArrayList numeros= new ArrayList();
        ArrayList lista= numeros;

        for(int i=0;i<4;i++){

            num[i]=in.nextInt();
            numeros.add(num[i]);
        }
        for(int j=0;4<lista.toArray().length-1;j--){
        }
        System.out.println("Los números son: "+lista);
    }
}
