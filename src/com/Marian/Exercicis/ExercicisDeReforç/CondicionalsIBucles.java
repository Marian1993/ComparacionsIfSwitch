package com.Marian.Exercicis.ExercicisDeReforç;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CondicionalsIBucles {


    private static Scanner sc = new Scanner(System.in);

    public static void elevarAlCuadrado(){
        int num;

        do{
            num = sc.nextInt();
            if(num > 0) {
                System.out.println((int) Math.pow(num, 2));
            }
        }
        while (num > 0);
    }

    public static int sumaDelsQuadrats(){

        int num;
        int suma = 0;

        do{
            num = sc.nextInt();
            if (num > 0) {
                System.out.println((int) Math.pow(num, 2));
                suma += (int)Math.pow(num, 2);
            }
        }while(num > 0);

        return suma;
    }
    public static void multipleIQuantitat(){

        int num;
        int repeticions = 0;

        do{
            num = sc.nextInt();
            repeticions++;

            if(num%2 == 0){
                System.out.println("Es multiple de dos.");
            }else {
                System.out.println("no es multiple de dos.");
            }
        }while(num%2 == 0);

        System.out.println("Quantitat de números introduits " + repeticions);

    }
    public static void acertarNumero(){

      Random random = new Random();

        System.out.println("Introdueix el número màxim.");
      int numMax = sc.nextInt();
      int numRandom = random.nextInt(numMax);
      boolean found = false;

        do{

            int numIntroduit = sc.nextInt();

            if(numIntroduit > numRandom && numIntroduit <= numMax){

                System.out.println("Posa un número més baix");

            }else if(numIntroduit < numRandom && numIntroduit <= numMax){

                System.out.println("posa un número més gran");
            }else if(numIntroduit <= numMax){
                found = true;
                System.out.println("Has acertat el número.");
            }
            if(numIntroduit > numMax) {
                System.out.println("Has d'introduir un número inferior o igual al número màxim introduit.");
            }
        }while (!found);

    }
    public static void calcularMitjanaNum(){

        int num;
        int suma = 0;
        int repeticions = 0;

        do{
            num = sc.nextInt();
            if(num > 0){
                suma += num;
                repeticions++;
            }

        }while(num > 0);

        System.out.println(suma/repeticions);
    }
    public static void numMultiples(){

        System.out.println("Número màxim");
        int numMax = sc.nextInt();
        System.out.println("Número multiple");
        int multiple = sc.nextInt();

        for (int i = 1; i <= numMax; i++) {

            if(i%multiple ==0){

                System.out.println(i);
            }
        }
    }
    public static void numMultipleInvers(){

        System.out.println("Número màxim");
        int numMax = sc.nextInt();
        System.out.println("Número multiple");
        int multiple = sc.nextInt();

        for (int i = numMax; i > 0; i--) {

            if(i%multiple ==0){

                System.out.println(i);
            }
        }

    }
    public static void multiplicacioNumSenars(){

        int quantitat = sc.nextInt();
        int numQuantitat = 0;
        int num = 1;

        do{
            if(num%2 != 0){

                System.out.println(num);
                numQuantitat++;
            }
            num++;

        }while(quantitat != numQuantitat);
    }
    public static int factorialNumero(int num){

        int factorial = num;
        int total = 1;

        while (factorial != 0){

            total *= factorial;
            factorial--;
        }
        return total;
    }
    public static void mitjanaNumeros(){

        int mitjanaNegativa = 0;
        int quantitatNegatius = 0;

        int mitjanaPositiva = 0;
        int quantitatPositius = 0;

        int quantitatCeros = 0;

        for (int i = 0; i < 10; i++) {

            int num = sc.nextInt();
            if(num > 0){

                mitjanaPositiva += num;
                quantitatPositius++;
            }else  if(num < 0){

                mitjanaNegativa += num;
                quantitatNegatius++;
            }else{
                quantitatCeros++;
            }
        }
        System.out.println("La mitjana dels números negatius ingressats es: " + mitjanaNegativa/quantitatNegatius);
        System.out.println("La mitjana dels números positius ingressats es:  " + mitjanaPositiva/quantitatPositius);
        System.out.println("Has intriduit " + quantitatCeros + " ceros");
    }

    public static void mitjanesAlumnes() {
        int mitjanaEdat = 0;
        int quantitatEdat = 0;
        int majorsEdat = 0;

        int mitjanaAltura = 0;
        int quantitatAltura = 0;
        int mesDe175 = 0;

        System.out.println("Posa les edats dels alumnes:");
        for (int i = 0; i < 5; i++) {

            int edat = sc.nextInt();
            mitjanaEdat += edat;
            quantitatEdat++;

            if(edat >= 18){
                majorsEdat++;
            }
        }
        System.out.println("Posa les altures amb cm dels alumnes:");
        for (int i = 0; i < 5; i++) {

            int altura = sc.nextInt();
            mitjanaAltura += altura;
            quantitatAltura++;

            if(altura >= 175){
                mesDe175++;
            }
        }
        System.out.println("La mitjana de les edats dels alumnes es: " + mitjanaEdat/quantitatEdat + ", hi ha " + majorsEdat +
                " alumnes majors d'edat.");
        System.out.println("La mitjana d'altura dels alumnes es: " + mitjanaAltura/quantitatAltura +", hi ha " +
                mesDe175 + " alumnes que medeixen més de 175 cm.");
    }
    public static void taulaMultiplicar(){

        int num = sc.nextInt();;

        for (int i = 0; i <= 10; i++) {

            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
    public static void qualificacioNotes(){

        int suspesos = 0;
        int be = 0;
        int notables = 0;
        int exelents = 0;

        for (int i = 0; i < 11; i++) {

            int notes = sc.nextInt();

            switch (notes){

                case 1:
                case 2:
                case 3:
                case 4:
                    suspesos++;
                    break;
                case 5:
                case 6:
                    be++;
                    break;
                case 7:
                case 8:
                    notables++;
                    break;
                case 9:
                case 10:
                    exelents++;
                    break;
                default:
                    System.out.println("No es pot posar més que un 10");
            }
        }
        System.out.println("Suspesos: " + suspesos + "\nBens: " + be + "\nNotables: " + notables + "\nExel·lents: " + exelents);
    }
    public static void multipleTres(){

        for (int i = 0; i < 5; i++) {

            int num = sc.nextInt();

            if (num % 3 == 0) {

                System.out.println("El número " + num + " es multiple de 3");
            }else {
                System.out.println("El número " + num + " no es multiple de 3");
            }
        }
    }


}
