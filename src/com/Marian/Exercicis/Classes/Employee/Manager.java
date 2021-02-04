package com.Marian.Exercicis.Classes.Employee;

import java.util.ArrayList;

public class Manager extends Employee implements Managment{

    private String department;
    private Employee[] employees;
    private int numEmployee;


    public Manager(){}
    public Manager(String empID, String name, int ssn, double salary,
                   String departament, Employee[] employees,
                   int numEmployee ){

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
    public String addEmployee(Employee employee){

        if(numEmployee <= 20 && findEmployee(employee) == -1) {

            employees[numEmployee] = employee;
            numEmployee++;

            return "The employee has been added to the list";
        }else{
        return "The employee already on the list";
        }
    }
    public boolean removeEmployee(Employee employee){

        Employee[] newEmployee = new Employee[employees.length];
        boolean found = false;
        int position = 0;

        for (int i = 0; i <employees.length; i++) {

            if(employees[i] == employee){

                employees[i] = null;
                found = true;
            }else {
                newEmployee[position] = employees[i];
                position++;
            }
        }
        for (int i = 0; i < newEmployee.length; i++) {

            employees[i] = newEmployee[i];
        }
        if (found){
            return true;
        }else {
            return false;
        }
    }

    public String getDepartment() {
        return department;
    }
    public void printArray(){

        for (int i = 0; i < employees.length; i++) {

            if(employees[i] != null) {
                System.out.println("\nPosition in the array: " + i + "\nID: " + employees[i].getEmpID() + "\nName: " +
                        employees[i].getName() + "\nSSN: " + employees[i].getSsn() + "\nSalary: " + employees[i].getSalary());
            }
        }
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public String toString(){

        return "Manager: " + super.toString() +
                "\nDepartament: " + department + "\nNumber of employees: " + numEmployee;
    }

    public void printStaffDetails(){
        System.out.println("Manager: " + super.toString() +
                "\nDepartament: " + department + "\nNumber of employees: " + numEmployee);

        for (int i = 0; i < employees.length; i++) {


            System.out.println("\nEmployee: " + "\nPosition in the array: " + i + "\nID: " + getEmpID() + "\nName: " + getName()
                    + "\nSSN: " + getSsn() + "\nSalary: " + getSalary());

        }
    }

    @Override
    public void plan() {
        System.out.println("S'ha fet una plinificació en el departament de" + department +
                ", i la persona encarregada d'aquest projecte es na " + getName());
    }

    @Override
    public void hire(Employee e) {
        addEmployee(e);
    }
}
