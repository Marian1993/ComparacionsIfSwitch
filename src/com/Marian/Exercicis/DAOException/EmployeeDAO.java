package com.Marian.Exercicis.DAOException;

public interface EmployeeDAO extends AutoCloseable {

    public void add(Employee emp) throws DAOExeption;

    public void update(Employee emp) throws DAOExeption;

    public void delete(int id) throws DAOExeption;

    public Employee findById(int id) throws DAOExeption;

    public Employee[] getAllEmployees() throws DAOExeption;
}
