package com.company;

public class CondicionalesEnMetodos {

    public static boolean numeroPositivoNegativo(int num) {

        if (num >= 0){
            System.out.println("El número es positivo");
        return true;
         }else{
            System.out.println("El número es positivo");
            return false;
        }

    }
    public static boolean multipleDe2 (int num){

        if(num % 2 ==0){
            System.out.println("El número es multiplo de 2");
            return true;
        }else{
            System.out.println("El número no es multiplo de 2");
            return false;
        }
    }
    public static int NumeroMayor(int num1, int num2){

        if (num1>num2){
            System.out.println(num1+" és el major.");
            return num1;
        }else{
            System.out.println(num2+" és el major");
        }
        return num2;
    }
    public static String diaSetmana (int dia){

        if (dia == 1) {
            System.out.println("Estamos a lunes");
            return "Lunes";
        } else if (dia == 2) {
            System.out.println("Estamos a martes");
            return "Martes";
        } else if (dia == 3) {
            System.out.println("Estamos a miercoles");
            return "Miercoles";
        } else if (dia == 4) {
            System.out.println("Estamos a jueves");
            return "Jueves";
        } else if (dia == 5) {
            System.out.println("Estamos a viernes");
            return "Viernes";
        } else if (dia == 6) {
            System.out.println("Estamos a sabado");
            return "Sábado";
        } else if (dia == 7) {
            System.out.println("Estamos a domingo");
            return "Domingo";
        } else {
            System.out.println("No hay tantos días de la semana.");
            return "No hay tantos días";
        }

    }
}
