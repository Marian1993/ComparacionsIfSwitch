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
}
