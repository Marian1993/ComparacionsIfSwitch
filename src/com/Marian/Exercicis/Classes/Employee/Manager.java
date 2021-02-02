package com.Marian.Exercicis.Classes.Employee;

import java.util.ArrayList;

public class Manager extends Employee implements Managment{

    private String department;
    private ArrayList<Employee> employees;
    private int numEmployee;


    public Manager(){}
    public Manager(String empID, String name, int ssn, double salary,
                   String departament, ArrayList<Employee> employees,
                   int numEmployee ){

        super(empID, name, ssn, salary);

        this.department = departament;
        this.employees = employees;
        this.numEmployee = numEmployee;
    }

    public int findEmployee(Employee employee){

        for (int i = 0; i < employees.size(); i++) {

            if(employees.get(i) == employee){

                return i;
            }
        }
        return -1;
    }
    public String addEmployee(Employee employee){

        if(numEmployee >= 20 && findEmployee(employee) == -1) {

            employees.add(employee);
            return "The employee has been added to the list";
        }else{
        return "The employee already on the list";
        }
    }
    public boolean removeEmployee(Employee employee){

        for (int i = 0; i <employees.size(); i++) {

            if(employees.get(i) == employee){

                employees.remove(i);

                return true;
            }
        }
        return false;
    }

    public String getDepartment() {
        return department;
    }
    public void printArray(){

        for (int i = 0; i < employees.size(); i++) {

            System.out.println("\nPosition in the array: " + i + "\nID: " + employees.get(i).getEmpID() + "\nName: " + employees.get(i).getName()
                    + "\nSSN: " + employees.get(i).getSsn() + "\nSalary: " + employees.get(i).getSalary());

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

        for (int i = 0; i < employees.size(); i++) {


            System.out.println("\nEmployee: " + "\nPosition in the array: " + i + "\nID: " + employees.get(i).getEmpID() + "\nName: " + employees.get(i).getName()
                    + "\nSSN: " + employees.get(i).getSsn() + "\nSalary: " + employees.get(i).getSalary());

        }
    }

    @Override
    public void plan() {
        System.out.println("S'ha fet una plinificació en el departament de" + department +
                ", i la persona encarregada d'aquest projecte es na " + getName());
    }

    @Override
    public void hire(Employee e) {
        employees.add(e);
    }
}
