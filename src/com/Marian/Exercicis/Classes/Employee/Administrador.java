package com.Marian.Exercicis.Classes.Employee;

public class Administrador extends Employee{

    public Administrador(){}

    public Administrador(String empID, String name, int ssn, double salary){

        super(empID, name, ssn, salary);

    }
    public String display(){

        return "Administrador: " + "\nID: " + getEmpID() + "\nName: " + getName()
                + "\nSSN: " + getSsn() + "\nSalary: " + getSalary();
    }

}
