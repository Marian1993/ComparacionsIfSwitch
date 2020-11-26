package com.Marian.Exercicis.Classes;

public class Treballador {

    //Declarar atributos como variables
    private String name;
    private int age;
    private double salary;

    //metodo constructor
    public Treballador(String name, int age, double salary){

        this.name=name;
        this.age=age;
        this.salary=salary;

    }
    //GETTER
    public String getname(){

        return this.name;
    }
    public int getage(){

        return this.age;
    }
    public double getsalary(){

        return this.salary;
    }
    //SETTER
    public void setName(String name) {

        this.name= name;
    }

    public void setAge(int age) {

        this.age=age;
    }

    public void setSalary(double salary) {

        this.salary=salary;
    }
}
