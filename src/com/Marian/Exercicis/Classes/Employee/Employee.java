package com.Marian.Exercicis.Classes.Employee;

import org.w3c.dom.ls.LSOutput;

public class Employee {

    private String empID;
    private String name;
    private int ssn;
    private double salary;

    public Employee(){}
    public Employee(String empID, String name, int ssn, double salary){

        this.empID = empID;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getName(){return name;}

    public String getEmpID() {return empID;}

    public int getSsn() {return ssn;}

    public double getSalary(){return salary;}

    public void setName(String name){this.name = name;}

    public void salaryIncrease(double num){salary += salary*(num/100);}

    public String toString(){

        return "\nID: " + empID + "\nName: " + name
                + "\nSSN: " + ssn + "\nSalary: " + salary;
    }
}
