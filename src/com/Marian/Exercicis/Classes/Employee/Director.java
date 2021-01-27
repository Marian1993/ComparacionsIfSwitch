package com.Marian.Exercicis.Classes.Employee;

public class Director extends Manager{

    private double budget;

    public Director(){}

    public Director(String empID, String name, int ssn, double salary, String departament,
                    double budget, Employee[] employees, int numEmployee){

        super(empID, name, ssn, salary, departament,employees,numEmployee);

        this.budget = budget;
    }
}
