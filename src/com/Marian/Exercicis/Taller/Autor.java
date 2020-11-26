package com.Marian.Exercicis.Taller;

public class Autor {

    private String name;
    private Obra[] obras;
    //private ArrayList<Obra> obras;

    public Autor( String name, Obra[] obras ){//ArrayList<Obra>obras

        this.name=name;
        this.obras=obras;
    }
    public Obra ObraMasLarga(){
        int maxPaginas=0;
        Obra obra=new Obra("kdhn","wdih",23);
        for(int i=0;i<obras.length;i++){//obras.size() si es una array list

            if(this.obras[i].getPaginas()>maxPaginas){

                maxPaginas=this.obras[i].getPaginas();

                obra=this.obras[i];
            }
        }
        return obra;
    }
}
