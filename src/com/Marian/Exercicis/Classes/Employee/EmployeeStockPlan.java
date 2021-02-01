package com.Marian.Exercicis.Classes.Employee;

public class EmployeeStockPlan{

    public static int granStock(Employee e){

        if(e instanceof Director){
            return 1000;

        }else if (e instanceof Manager){
            return 100;

        }else {
            return 10;
        }
    }
    public static String printEmployee(Employee e){

        if(e instanceof Director){
            return "Is Director, and you Stock plan is: " + granStock(e);

        }else if (e instanceof Manager){
            return "Is Manager, and you Stock plan is: " + granStock(e);

        }else if(e instanceof Administrador){
            return "Is Administrador, and you Stock plan is: " + granStock(e);

        }else if(e instanceof Engineer){
            return "Is Engineer, and you Stock plan is: " + granStock(e);

        }else {
            return "Is Employee, and you Stock plan is: " + granStock(e);

        }
    }
}
