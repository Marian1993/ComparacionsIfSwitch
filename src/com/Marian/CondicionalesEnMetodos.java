package com.Marian;

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
    public static String momentDia(int num) {

        switch (num) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Estamos en la mañana");
                return "demati";
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Estamos por el medio día");
                return "mitg dia";
            case 18:
            case 19:
            case 20:
                System.out.println("Estamos por la tarde");
                return "tarde";
            case 21:
            case 22:
            case 23:
                System.out.println("Estamos por la noche");
                return "vespre";
            default:
                System.out.println("A esta hora tendrias que estar durmiendo");
                return "Es hora de dormir";
        }
    }
    public static String notas(int num) {

        if (num >= 0 && num == 4) {

            System.out.println("Insuficiente");
            return "Isuficient";
        }
        if (num == 5) {

            System.out.println("Suficinete");
            return "Suficient";
        }
        if (num == 6) {

            System.out.println("Bien");
            return "Bé";
        }
        if (num == 7 && num == 8) {

            System.out.println("Notable");
            return "Notable";
        }
        if (num == 9 && num == 10) {

            System.out.println("Excelente");
            return "Exelent";
        }
        return null;
    }
    public static boolean diaMes(int dia, int mes, int any) {

        boolean corrector=false;
        boolean corrector2=false;
        boolean corrector3=false;

        if (dia >= 1 && dia <= 30) {
            System.out.print("Estamos a día " + dia);
            corrector=true;
        }
        if (mes >= 1 && mes <= 12) {
            System.out.print(" en el mes " + mes);
            corrector2=true;
        }
        if (any >= 0 && any <= 2020) {
            System.out.print(" en el año " + any + ".");
            corrector3 = true;
        }
        else if (corrector==true && corrector2==true && corrector3==true){
            return true;
        }
        else {
            return false;
        }
        return false;
    }
    public static String sebraEdat(int edat){

        if (edat >= 0 && edat <= 17) {
            System.out.print("Eres menor de edat");
            return "Menor d'edat";
        } else {
            System.out.print("Eres mayor de edat");
            return "Mayor d'edat";
        }
    }

}
