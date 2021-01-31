package com.Marian.Exercicis.Classes.Employee;

public class Engineer extends Employee{

    public Engineer(){}

    public Engineer(String empID, String name, int ssn, double salary){

        super(empID, name, ssn, salary);
    }

    public String display(){

        return "Engineer: " + super.toString();
    }
}
