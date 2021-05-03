package com.Marian.Exercicis.DAOException;

public class EmployeeDAOFactory {

    public EmployeeDAO createEmployeeDAO() {

        return (EmployeeDAO) new EmployeeDAOMemoryImpl();
    }
}
