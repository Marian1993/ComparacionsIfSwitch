package com.Marian.Exercicis.DAOException;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl {
    // not thread-safe
    private static Employee[] employeeArray = new Employee[10];

    // package level access
    EmployeeDAOMemoryImpl() {
    }

    // Add an Employee record
        public void add (Employee emp) throws DAOExeption {
        try{
            employeeArray[emp.getId()] = emp;
        }catch (IndexOutOfBoundsException e){
            System.err.println("No es poden aferguir mes empleats");
        }
    }


    // Update an employee record
    public void update(Employee emp) throws DAOExeption{
        try{

            employeeArray[emp.getId()] = emp;
        }catch (IndexOutOfBoundsException e){
            System.err.println("Aquest empleat no existeix");
        }
    }

    // Delete an employee record that has this ID
    public void delete(int id) throws DAOExeption{
        try {

            employeeArray[id] = null;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Aquesta id no existeix");
        }
    }

    // Find an Employee record using this ID
    public Employee findById(int id) throws Exception{
        return employeeArray[id];
    }

    // Return an array of all of the Employee records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
}
