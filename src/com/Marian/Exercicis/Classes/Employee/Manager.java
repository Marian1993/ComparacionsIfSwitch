package com.Marian.Exercicis.Classes.Employee;

import java.util.ArrayList;

public class Manager extends Employee{

    private String department;
    private double budget;
    private Employee[] employees;
    private int numEmployee;

    public Manager(){}
    public Manager(String empID, String name, int ssn, double salary,
                   String departament, double budget, Employee[] employees,
                   int numEmployee){

        super(empID, name, ssn, salary);

        this.department = departament;
        this.budget = budget;
        this.employees = employees;
        this.numEmployee = numEmployee;
    }

    public int findEmployee(Employee[] employee){

        this.employees = employees;

        for (int i = 0; i < employees.length; i++) {

            if(employees[i].getName() == employee){

                return i;
            }
        }
        return -1;
    }
    public boolean addEmployee(Employee[] employees){

        this.employees = employees;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getName())

        }

        return false;
    }






    public String display(){

        return "Manager: " + "\nID: " + getEmpID() + "\nName: " + getName()
                + "\nSSN: " + getSsn() + "\nSalary: " + getSalary() +
                "\nDepartament: " + department + "\nBudget: " + budget
                + "\nNumber of employees: " + numEmployee;
    }

}
