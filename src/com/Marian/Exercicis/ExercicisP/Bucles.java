package com.Marian.Exercicis.ExercicisP;

import java.util.ArrayList;
import java.util.Scanner;

public class Bucles {


    public void Ejercicio1Bucles() {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num1 = 0;

        while (num1 < num) {

            System.out.println(num1);
            num1++;
        }

    }

    public void Ejercicio2Bucles() {

        Scanner in = new Scanner(System.in);

        int num;

        while (!((num = in.nextInt()) < 0)) {

            num = in.nextInt();
            System.out.println(num);
        }


    }

    public void Ejercicio3Bucles() {

        Scanner in = new Scanner(System.in);

        int num;

        while (!((num = in.nextInt()) == 0)) {
            if (num >= 0) {

                System.out.println("El número es positivo");

            } else {
                System.out.println("El número es negativo");
            }
        }


    }

    public void Ejercicio4Bucles() {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num1 = 2;
        int resto = num % num1;

        while (resto == (num = in.nextInt()) % num1) {

        }
        System.out.println("Este número es multiplo de 2");
    }

    public void Ejercicio5Bucles() {

        Scanner in = new Scanner(System.in);
        /*ArrayList lista=new ArrayList();
        int num=0;

        do{
            num= in.nextInt();
            lista.add(num);

        }while(!(num<0));

        System.out.println("Se han puesto "+lista.toArray().length+" números por pantalla.");*/
        int num = 0;
        int cantidad = 0;

        while (true) {
            num = in.nextInt();

            if (!(num < 0)) {
                cantidad++;
            } else {
                cantidad++;
                break;
            }
        }
        System.out.println("Se han puesto " + cantidad + " números");
    }

    public void Ejercicio6Bucles() {

        Scanner in = new Scanner(System.in);

        int num;
        int suma = 0;

        do {
            num = in.nextInt();

            suma += num;
        } while (num != 0);

        System.out.println("La suma de todos lo números es " + suma);
    }

    public void Ejercicio7Bucle() {
        Scanner in = new Scanner(System.in);
        ArrayList lista = new ArrayList();

        int num;
        double suma = 0;

        do {
            num = in.nextInt();
            lista.add(num);

            suma += num;
        } while (num != 0);

        System.out.println("La media de todos lo números que se han puesto es " + suma / lista.toArray().length);

    }

    public void Ejercicio8Bucles() {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num1 = 1;
        int cantidad=0;
        ArrayList lista=new ArrayList();
        lista.add(num1);


        while (num1 < num) {

            System.out.println(num1);
            num1 += 2;
            cantidad++;

        }
        int resultado= num1/cantidad;
        System.out.println(cantidad);

    }
    public void Ejercicio9Bucles () {

        int aleatorio = (int) (Math.random() * 100);
        Scanner an = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != aleatorio) {

            intentos++;
            System.out.println("Introduce un número.");
            numero = an.nextInt();

            if (aleatorio < numero) {

                System.out.println("Más bajo");
            } else if (aleatorio > numero) {

                System.out.println("Más alto");
            }
        }
        System.out.println("És correcto, lo has conseguido en " + intentos + " intentos.");
    }
    public void Ejercicio10Bucle(){

        Scanner in=new Scanner(System.in);

        int num;
        int negatiu=0;

        for(int i=0; i<6;i++){

            num=in.nextInt();

            if(num<0){
                negatiu++;
            }else{

            }
        }
        System.out.println("Se han introducido "+negatiu+" números negativos");
    }
    public void Ejercicio11Bucles(){

        Scanner in=new Scanner(System.in);

        System.out.println("Primer número");
        int num1= in.nextInt();
        System.out.println("Segundo número");
        int num2= in.nextInt();
        System.out.println("Tercer número");
        int num3= in.nextInt();

        while(num1>num2 && num1>num3 ){

            if(num1>num3){
                System.out.println("El número mayor es: "+num1);
            }else{
                System.out.println("El número mayor es: "+num1);
            }
            break;
        }
        while(num3>num1 && num3>num2 ){

            if(num3>num2){
                System.out.println("El número mayor es: "+num3);
            }else{
                System.out.println("El número mayor es: "+num3);
            }
            break;
        }
        while(num2>num1 && num2>num3 ){

            if(num2>num3){
                System.out.println("El número mayor es: "+num2);
            }else{
                System.out.println("El número mayor es: "+num2);
            }
            break;
        }
    }
    public static void Ejercicio12Bucles() {
        Scanner in = new Scanner(System.in);

        int num;
        int aprobats = 0;
        int suspesos = 0;
        int incorrectes = 0;
        int sum=0;

        for (int i = 0; i < 6; i++) {
            num=in.nextInt();

            if (num<5 && num>0){
                sum+=num;
                suspesos++;
            }else if(num>=5 && num<=10){
                sum+=num;
                aprobats++;
            }else{

                incorrectes++;
            }

        }
        int total=suspesos+aprobats;
        System.out.println("Hi ha "+aprobats+" aprobats.\nHi ha "+suspesos+" suspesos.\nHi ha "+incorrectes+" incorrectes");
        System.out.println("La mitjana de totes les notes es "+(double)sum/(aprobats+suspesos));

    }
    public static void Ejercicio1Extra(){

        Scanner in=new Scanner(System.in);

        String frase=in.nextLine();
        String fraseInvertida="";
        for(int i=frase.length()-1;i>=0;i--){

            fraseInvertida=fraseInvertida+frase.charAt(i);
        }
        System.out.println(fraseInvertida);
    }
    public static void Ejercicio2Extra(){

        Scanner in=new Scanner(System.in);
        System.out.println("Pon una palabra o frase:");
        String valor = in.nextLine();

        valor=valor.replace(" ","");
        valor=valor.replace(",","");
        valor=valor.replace(".","");

        int fin=valor.length()-1;
        int inicio=0;
        boolean palindromo=true;

        while(inicio<fin){

            if(valor.charAt(inicio)!= valor.charAt(fin)){
                palindromo=false;
            }
            inicio++;
            fin--;
        }
        if(palindromo) {
            System.out.println("la palabra: " + valor + " es un palindromo");

        }else{
            System.out.println("la palabra: " + valor + " no es un palindromo");

        }

    }
    public static void Ejercicio3Extra(){

        Scanner in= new Scanner(System.in);
        System.out.println("Escribre una frase o nombre:");
        String nombre= in.nextLine();

        nombre=nombre.replace(" ","");
        nombre=nombre.replace(",","");
        nombre=nombre.replace(".","");

        System.out.println("Esta frase o nombre tiene una longitud de "+nombre.length()+" letras.");
    }
    public static void Ejercicio4Extra(){

        Scanner in= new Scanner(System.in);
        System.out.println("Escriu 6 lletres");
        char[] letras= new char[6];
        char caracter = 0;

        for( int i=0;i<letras.length;i++){
            letras=in.next().toCharArray();
            if(letras[i]=='a'){
                caracter++;
            }
        }
        System.out.println("En la frase o el nombre, aparece la letra A "+caracter+" veces.");

    }

}
