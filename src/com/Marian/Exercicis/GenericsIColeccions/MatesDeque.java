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

             if(dq.size()  == 1) {

                 if (dq.getFirst().charAt(0) == '(') {

                     dq.removeFirst();
                 }
             }else{
                 dq.add(")");
             }
         }
     }
     if (dq.size() == 0){
         return true;
     }else {
         return false;
     }
 }

}
