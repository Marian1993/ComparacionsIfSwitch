package com.Marian.Exercicis.GenericsIColeccions;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatesDeque {

    Deque<String> dq = new ArrayDeque<String>();

    public boolean calculCorrecte(String calcul){

     for (int i = 0; i < calcul.length(); i++) {

         if(calcul.charAt(i) == '('){
             dq.add("(");

         }else if(calcul.charAt(i) == ')'){

             if(dq.isEmpty()) {
                 return false;

             }else{
                 dq.pop();
             }
         }
     }
     return dq.isEmpty();
    }
 }


