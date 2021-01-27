package com.Marian.Exercicis.Classes.Employee;

import java.util.ArrayList;

public class Manager extends Employee{

    private String department;
    private Employee[] employees;
    private int numEmployee;

    public Manager(){}
    public Manager(String empID, String name, int ssn, double salary,
                   String departament, Employee[] employees,
                   int numEmployee){

        super(empID, name, ssn, salary);

        this.department = departament;
        this.employees = employees;
        this.numEmployee = numEmployee;
    }

    public int findEmployee(Employee employee){

        for (int i = 0; i < employees.length; i++) {

            if(employees[i] == employee){

                return i;
            }
        }
        return -1;
    }
    public boolean addEmployee(Employee[] employees){

        this.employees = employees;

        for (int i = 0; i < employees.length; i++) {

            if ()

        }

        return false;
    }

    public String getDepartment() {
        return department;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public String display(){

        return "Manager: " + "\nID: " + getEmpID() + "\nName: " + getName()
                + "\nSSN: " + getSsn() + "\nSalary: " + getSalary() +
                "\nDepartament: " + department + "\nNumber of employees: " + numEmployee;
    }

}
