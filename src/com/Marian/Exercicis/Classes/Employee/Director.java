package com.Marian.Exercicis.Classes.Employee;

import java.util.ArrayList;

public class Director extends Manager{

    private double budget;

    public Director(){}

    public Director(String empID, String name, int ssn, double salary, String departament,
                    double budget, Employee[] employees, int numEmployee){

        super(empID, name, ssn, salary, departament,employees,numEmployee);

        this.budget = budget;
    }

    public String display(){

        return "Director: " + super.toString() + "\nNumber of employees: " + getNumEmployee() +
                "\nDepartament: " + getDepartment() + "\nBudget: " + budget;
    }

    public double getBudget() {
        return budget;
    }
}
