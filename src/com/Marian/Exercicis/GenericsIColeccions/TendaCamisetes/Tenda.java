package com.Marian.Exercicis.GenericsIColeccions.TendaCamisetes;

import java.util.HashMap;
import java.util.TreeMap;

public class  Tenda <T> {

    TreeMap<Integer,T> elements;
    HashMap<T,Integer> stock;

    public Tenda(){
        elements = new TreeMap<>();
        stock = new HashMap<>();
    }
    public void afegir(Integer clau, T valor){

        elements.put(clau,valor);
        if(stock.containsKey(valor)){

            stock.put(valor,stock.get(valor)+1);
            return;
        }
        stock.put(valor,1);
    }
    public void eliminarElement(Integer key, T valor){

        if(stock.get(valor) > 1){

            stock.put(valor, stock.get(valor) -1);
            return;
        }
    }
    public boolean existencies(Integer key, T valor){
        return elements.containsKey(key);
    }
    public int cantidad( T valor){
        return stock.get(valor);
    }
    public void display(){

        System.out.println("Prenda - Stock");
        for (T key: stock.keySet()) {

            System.out.println(key + " - " + stock.get(key));

        }
    }
}
