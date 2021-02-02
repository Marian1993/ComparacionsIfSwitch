package com.Marian.Exercicis.Classes.Employee;

public class Administrador extends Employee implements Managment{

    private String project;

    public Administrador(){}

    public Administrador(String empID, String name, int ssn, double salary, String project){

        super(empID, name, ssn, salary);

        this.project=project;

    }
    public String toString(){

        return "Administrador: " + super.toString();
    }


    @Override
    public void plan() {
        System.out.println("S'ha fet la plinificació " + project + ", i la persona encarregada d'aquest" +
                " projecte es na " + getName());
    }

    @Override
    public void hire(Employee e) {
        System.out.println(toString());
        System.out.println();
        System.out.println("El nou empleat contractat es: " + e.toString());
    }
}
