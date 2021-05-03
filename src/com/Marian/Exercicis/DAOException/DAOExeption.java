package com.Marian.Exercicis.DAOException;

public class DAOExeption extends Exception{

    public DAOExeption (){
        super();
    }

    public DAOExeption(String message){
        super(message);
    }

    public DAOExeption(String message, Throwable cause ){

        super(message,cause);
    }

    public DAOExeption(Throwable cause){
        super(cause);
    }

}
