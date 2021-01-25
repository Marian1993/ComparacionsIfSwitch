package com.Marian.Exercicis.Refactoritzar.Extraccions;

import java.util.Scanner;


public class ExtracionsVariables {

    private static Scanner sc = new Scanner(System.in);
    private static final int majoriaEdat = 18;
    private static final double PI = 3.14;
    private static final int radi = 16;
    private static final int num = 10;
    private static boolean yFound = false;
    private static int counter = 0;

    public static boolean sabreSiEsMajorEdat(int age) {
        if (age < majoriaEdat) {
            return true;
        }
        return false;
    }

    /**
     * Àrea d'una cirfunferència: PI * r ^ 2
     */
    public static double areaCircunferencia() {
        double area = PI * radi;
        return area;
    }

    /**
     * Volum cilindre: PI * radi ^ 2 * altura
     */
    public static double volumCilindre() {
        double volum = PI * radi * 5;
        return volum;
    }

    public static void exercici4() {
        int[] elements = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void exercici5() {

        for (int i = 0; i < "lorem ipsum".length(); i++) {
            if ("lorem ipsum".charAt(i) == 'y') {
                yFound = true;
            }
            if (yFound && "lorem ipsum".charAt(i) == 'x') {
                counter++;
            }
        }

        System.out.println("Número d'aparicions del caràcter 'x' " +
                "després de la primera 'y': " + counter);
    }
}
