package com.Marian.Exercicis.Classes.Poligonos;

public class Triangle extends Poligon{

    public Triangle(){}

    public Triangle (double perimetre, double area){

        super(perimetre,area);
    }
    public void calcularperimetre( int numeroAltura1, int numeroAltura2, int numeroAncho1){

        setPerimetre(numeroAltura1 + numeroAltura2 + numeroAncho1);
    }
    public void calcularArea( double lado, double base){

        setArea((lado*base)/2.0);
    }
}
