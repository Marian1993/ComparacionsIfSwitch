package com.Marian.Exercicis.GenericsIColeccions.TendaCamisetes;

import java.util.Map;
import java.util.TreeMap;

public class TendaTreeMap{

    Map<String,String> roba = new TreeMap<String,String>();
    Map<String,Integer> stock = new TreeMap<String, Integer>();

    public void afeguirPrenda(String clau, String prenda){

        roba.put(clau,prenda);
    }
    public void modificarPrenda(String clau, String prenda){

        roba.replace(clau, prenda);
    }
    public void eliminarPrenda(String clau){

        roba.remove(clau);
    }
    public boolean cercarPrenda(String prenda){

        for (Map.Entry r: roba.entrySet()) {

            if(r.getValue() == prenda){

                return true;
            }
        }
        return false;
    }
    public String stockPrenda(String prenda){

        int contador = 0;

        for (Map.Entry r: roba.entrySet()) {

            if(r.getValue() == prenda && contador == 0){
                contador++;
                stock.put(prenda,1);

            }else if( r.getValue() == prenda && contador > 0) {

                stock.replace(prenda,contador += 1);
            }
        }
        for (Map.Entry s: stock.entrySet()) {

            if(s.getKey() == prenda)
            return "Quantitat: " + s.getValue();
        }
        return "No existeix aquesta prenda";
    }
    public void imprimirPrendes(){

        for (Map.Entry r: roba.entrySet()) {

            System.out.println("Clau: " + r.getKey() + " Valor: " + r.getValue());
        }
    }

    public String quantitatStock(){

        int contador = 0;

        for (Map.Entry r: roba.entrySet()) {
            for (Map.Entry s: stock.entrySet()) {

                if(s.getKey() == r.getValue()){


                }
            }
        }

        return "No existeix aquesta prenda";
    }

}


