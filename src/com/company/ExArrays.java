
package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExArrays {

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

        for( int i=0;i< num.length;i++){

            System.out.println("Introduce un número");
            num[i]= in.nextInt();
        }
        System.out.println("Número en el orden inverso");
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
    }
    public static void Ejercicio4Arrays(){

        Scanner in=new Scanner(System.in);
        int [] num= new int [4];
        int sum=0;

        for(int i=0;i<4;i++){

            num[i]= in.nextInt();
            sum+=num[i];
        }
        System.out.println("La suma de tots el números es: "+sum);
    }
    public static void Ejercicio5Arrays(){
        Scanner in=new Scanner(System.in);
        char [] caracter= new char[]{'h','o','l','a',' ','m','u','n','d','o','.'};
        //String frase= Arrays.toString(caracter);
        System.out.println(caracter);


        /*for(int i=0;i<10;i++){

            caracter[i]=(char)in.nextLine().toCharArray()[0];
        }
        System.out.println(caracter);*/
    }
    public static void Ejercicio6Arrays() {
        Scanner in = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6};
        System.out.println("Los números que se han puesto han sido:"+num[0]+", "+num[1]+", "+num[2]+
                ", "+num[3]+", "+num[4]+", "+num[5]+".");


        /*ArrayList todos= new ArrayList();
        todos.add(num);

        for(int i=0;i<5;i++){
         num[i]=in.nextInt();
        }
        //System.out.println("Los números que se han puesto han sido:"+num[0]+","+num[1]+","+num[2]+
        ","+num[3]+","+num[4]+","+num[5]+".");
        System.out.println("Los números que se han puesto han sido: "+todos);*/
    }
    public static void Ejercicio7Arrays(){

        Scanner in=new Scanner(System.in);
        int [] num= new int [4];
        int sum=0;
        int veces=0;

        for(int i=0;i<4;i++){

            num[i]= in.nextInt();
            sum+=num[i];
            veces++;

        }
        System.out.println("La mitjana de tots els números es: "+(double)sum/veces);
    }
    public static void Ejercicio8Arrays(){

        int [] a= {1,3,5};
        int [] b= {2,4,6};
        int [] c=new int[6];

        for (int i=0;i<6;i++){


        }
    }
}
