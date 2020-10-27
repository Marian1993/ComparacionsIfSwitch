package com.company;

import javax.swing.*;
import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {

        /*int b=Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));

        if (b<0)
            System.out.println("El número es negativo");

        else if (b>0)

            System.out.println("El número es positivo");


        int resto;
        int num=Integer.parseInt(JOptionPane.showInputDialog("Pon un número, y te diré si es multiplo de dos"));
        int num1=2;

        resto=num%num1;

        if(resto==0) {
            System.out.println(num + " Es multiplo de " + num1);

        } else {
            System.out.println(num + " No es multiplo de " + num1);
        }

        int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un numero"));

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Pon otro número"));

        if (num < num1) {

            System.out.println(num + " es menor que " + num1);

        } else if (num > num1) {

            System.out.println(num + " es mayaor que" + num1);
        } else {

            System.out.println(num + " es igual a " + num1);
        }

        int dia= Integer.parseInt(JOptionPane.showInputDialog("Pon un dia de la semana"));

        if(dia==1){
            System.out.println("Estamos a lunes");
        }else if(dia==2) {
            System.out.println("Estamos a martes");
        }else if(dia==3) {
            System.out.println("Estamos a miercoles");
        }else if(dia==4) {
            System.out.println("Estamos a jueves");
        }else if(dia==5) {
            System.out.println("Estamos a viernes");
        }else if(dia==6) {
            System.out.println("Estamos a sabado");
        }else if(dia==7) {
            System.out.println("Estamos a domingo");
        }else{
            System.out.println("No hay tantos días de la semana.");
        }

        int dia= Integer.parseInt(JOptionPane.showInputDialog("Pon un dia de la semana"));

        switch (dia){
            case 1:
                System.out.println("Estamos a Lunes");
                break;
            case 2:
                System.out.println("Estamos a Martes");
                break;
            case 3:
                System.out.println("Estamos a Miercoles");
                break;
            case 4:
                System.out.println("Estamos a Jueves");
                break;
            case 5:
                System.out.println("Estamos a Viernes");
                break;
            case 6:
                System.out.println("Estamos a Sabado");
                break;
            case 7:
                System.out.println("Estamos a Domingo");
                break;
            default:
                System.out.println("No hay más días de la semana");

        }*/
        int hora=Integer.parseInt(JOptionPane.showInputDialog("Que hora es?"));

        switch (hora){
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Estamos en la mañana");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Estamos por el medio día");
                break;
            case 18:
            case 19:
            case 20:
                System.out.println("Estamos por la tarde");
                break;
            case 21:
            case 22:
            case 23:
                System.out.println("Estamos por la noche");
                break;
            default:
                System.out.println("A esta hora tendrias que estar durmioendo");







        }
    }
}
