package com.Marian.Exercicis.GenericsIColeccions.TendaCamisetes;

import java.util.HashMap;
import java.util.TreeMap;

public class Tenda <T> {

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

        if(stock.o)
    }
}
