package com.Marian.Exercicis.ExercicisP;

import java.util.ArrayList;

public class Lista {

    private ArrayList<Integer> numbers;

    public Lista(ArrayList<Integer> numbers){

        this.numbers=numbers;
    }
    public Lista(){}

    public void addList(int addList){
        this.numbers.add(addList);

    }
    public void rermoveList(int removeListIndex){

        this.numbers.remove(removeListIndex);
    }
    public int getList(int getList){

        this.numbers.get(getList);

        return getList;
    }
    public void sizeList(){

        for(int i=0;i<numbers.size();i++){

            System.out.println(numbers.get(i));
        }

    }
}
