package Exercicis.ExercicisP;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Condicionales {

    public void Ejercicio1Condicionales() {

        int b = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));

        if (b < 0)
            System.out.println("El número es negativo");

        else if (b > 0)

            System.out.println("El número es positivo");
    }

    public void Ejercicio2Condicionales() {

        int resto;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un número, y te diré si es multiplo de dos"));
        int num1 = 2;

        resto = num % num1;

        if (resto == 0) {
            System.out.println(num + " Es multiplo de " + num1);

        } else {
            System.out.println(num + " No es multiplo de " + num1);
        }
    }

    public void Ejercicio3Condicionales() {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un numero"));

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Pon otro número"));

        if (num < num1) {

            System.out.println(num + " es menor que " + num1);

        } else if (num > num1) {

            System.out.println(num + " es mayaor que" + num1);
        } else {

            System.out.println(num + " es igual a " + num1);
        }
    }

    public void Ejercicio4CondicionalesA() {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Pon un dia de la semana"));

        if (dia == 1) {
            System.out.println("Estamos a lunes");
        } else if (dia == 2) {
            System.out.println("Estamos a martes");
        } else if (dia == 3) {
            System.out.println("Estamos a miercoles");
        } else if (dia == 4) {
            System.out.println("Estamos a jueves");
        } else if (dia == 5) {
            System.out.println("Estamos a viernes");
        } else if (dia == 6) {
            System.out.println("Estamos a sabado");
        } else if (dia == 7) {
            System.out.println("Estamos a domingo");
        } else {
            System.out.println("No hay tantos días de la semana.");
        }
    }

    public void Ejercicio4CondicionalesB() {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Pon un dia de la semana"));

        switch (dia) {
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
        }
    }

    public void Ejercicio5Condicionales() {

        int hora = Integer.parseInt(JOptionPane.showInputDialog("Que hora es?"));

        switch (hora) {
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
                System.out.println("A esta hora tendrias que estar durmiendo");
        }
    }

    public void Ejercicio6Condicionales() {

        Scanner in = new Scanner(System.in);

        int notas = in.nextInt();

        if (notas >= 0 && notas == 4) {

            System.out.println("Insuficiente");
        }
        if (notas == 5) {

            System.out.println("Suficinete");
        }
        if (notas == 6) {

            System.out.println("Bien");
        }
        if (notas == 7 && notas == 8) {

            System.out.println("Notable");
        }
        if (notas == 9 && notas == 10) {

            System.out.println("Excelente");
        }
    }

    public void Ejercicio7Condicionales() {

        Scanner a = new Scanner(System.in);

        int dia = a.nextInt();
        int mes = a.nextInt();
        int año = a.nextInt();

        if (dia >= 1 && dia <= 30) {
            System.out.print("Estamos a día " + dia);
        }
        if (mes >= 1 && mes <= 12) {

            System.out.print(" en el mes " + mes);
        }
        if (año >= 0 && año <= 2020) {

            System.out.print(" en el año " + año + ".");
        }
    }

    public void Ejercicio8Condicionales() {

        Scanner a = new Scanner(System.in);

        int dia = a.nextInt();
        int mes = a.nextInt();
        int año = a.nextInt();
        boolean esCorrecto = false;


        if (dia >= 0 && dia <= 31) {

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    esCorrecto = true;
                    System.out.print("Estamos en el día " + dia);
                    System.out.print(" en el mes " + mes);
                    break;
            }
        }
        if (dia >= 1 && dia <= 30) {

            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    esCorrecto = true;
                    System.out.print("Estamos en el día " + dia);
                    System.out.print(" en el mes " + mes);
                    break;
            }
        }
        if (dia >= 1 && dia <= 28) {

            switch (mes) {
                case 2:
                    esCorrecto = true;
                    System.out.print("Estamos en el día " + dia);
                    System.out.print(" en el mes " + mes);
                    break;
            }
        }
        if (esCorrecto == false) {
            System.out.print("No hay tantos días para este mes " + mes);
        }
        if (año >= 0 && año <= 2020) {

            System.out.print(", y estamos en el año " + año + ".");
        } else {
            System.out.print(" este año está mal " + año + ".");
        }
    }

    public void Ejercicio9Condicionales() {

        Scanner a = new Scanner(System.in);

        System.out.println("Pon el primer número: ");
        int a1 = a.nextInt();
        System.out.println("Pon el segundo número: ");
        int b1 = a.nextInt();
        System.out.println("Pon el tercer número: ");
        int c1 = a.nextInt();

        if (a1 > b1 && b1 > c1) {
            System.out.print("De Mayor a menor " + a1 + ", " + b1 + ", " + c1 + ".");

        } else if (a1 > c1 && c1 > b1) {
            System.out.print("De Mayor a menor " + a1 + ", " + c1 + ", " + b1 + ".");

        } else if (b1 > a1 && a1 > c1) {
            System.out.print("De Mayor a menor " + b1 + ", " + a1 + ", " + c1 + ".");

        } else if (b1 > c1 && c1 > a1) {
            System.out.print("De Mayor a menor " + b1 + ", " + c1 + ", " + a1 + ".");

        } else if (c1 > a1 && a1 > b1) {
            System.out.print("De Mayor a menor " + c1 + ", " + b1 + ", " + b1 + ".");

        } else if (c1 > b1 && b1 > a1) {
            System.out.print("De Mayor a menor " + c1 + ", " + b1 + ", " + a1 + ".");

        }
    }

    public void Ejercicio10Condicionales() {

        Scanner in = new Scanner(System.in);

        System.out.println("Pon tu edat: ");
        int num = in.nextInt();

        if (num >= 0 && num <= 17) {
            System.out.print("Eres menor de edat");

        } else {
            System.out.print("Eres mayor de edat");

        }
    }

    public void Ejercicio11Condicionales() {

        Scanner in = new Scanner(System.in);

        System.out.println("Cuanto dinero quiere sacar: ");
        int dinero = in.nextInt();

        int b50 = 0, b20 = 0, b10 = 0, b5 = 0, m2 = 0, m1 = 0;
        //523
        b50 = dinero / 50;//b50=10
        dinero = dinero - (b50 * 50);//dinero=523-(500), dinero=23
        //23
        b20 = dinero / 20;//b20=1
        dinero = dinero - (b20 * 20);//dinero=23-(20), dinero=3
        //3, no se puede hacer la operación
        b10 = dinero / 10;
        dinero = dinero - (b10 * 10);
        //3, no se puede hacer la operación
        b5 = dinero / 5;
        dinero = dinero - (b5 * 5);
        //3
        m2 = dinero / 2;//m2=1
        dinero = dinero - (m2 * 2);//dinero=3-(2), dinero=1
        //1
        m1 = dinero / 1;//m1=1
        dinero = dinero - (m1 * 1);//dinero=1-(1), dinero=0

        if (b50 > 0) {
            System.out.println("Nº billetes de 50: " + b50);

        }
        if (b20 > 0) {
            System.out.println("Nº billetes de 20: " + b20);

        }
        if (b10 > 0) {
            System.out.println("Nº billetes de 10: " + b10);

        }
        if (b5 > 0) {
            System.out.println("Nº billetes de 5: " + b5);

        }
        if (m2 > 0) {
            System.out.println("Nº monedas de 2: " + m2);

        }
        if (m1 > 0) {
            System.out.println("Nº monedas de 1: " + m1);

        }
    }
}


