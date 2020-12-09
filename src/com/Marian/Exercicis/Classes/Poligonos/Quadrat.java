package com.Marian.Exercicis.Classes.Poligonos;

public class Quadrat extends Poligon{

    public Quadrat(){}
    public Quadrat (int perimetre, int area){

        super(perimetre,area);
    }

    public void calcularperimetre( int numeroAltura1, int numeroAltura2, int numeroAncho1, int numeroAncho2){

         setPerimetre(numeroAltura1 + numeroAltura1 + numeroAncho1 + numeroAncho2);
    }
    public void calcularArea(int numero){

        setArea((int) Math.pow(numero,2));
    }
}
