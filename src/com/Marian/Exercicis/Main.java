package com.Marian.Exercicis;


import com.Marian.Exercicis.DAOException.DAOExeption;


import javax.swing.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        /*EmployeeDAOFactory factory = new EmployeeDAOFactory();

        boolean timeToQuit = false;

        EmployeeDAO dao = factory.createEmployeeDAO();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            timeToQuit = executeMenu(in, dao);
        } while (!timeToQuit);*/

        try {

            exepcio();
        }catch (NumberFormatException e){

            System.out.println("No has de posar lletres");
        }
    }

    private static void exepcio() throws NumberFormatException{

        int mama = Integer.parseInt(JOptionPane.showInputDialog("di algo"));
        System.out.println(mama);

    }
}



