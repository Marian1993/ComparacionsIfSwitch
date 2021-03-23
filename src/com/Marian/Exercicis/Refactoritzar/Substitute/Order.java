package com.Marian.Exercicis.Refactoritzar.Substitute;

public class Order {
    public float applyVAT (int vatType ) {

        float[] vat = new float[]{-1,1.04f, 1.18f, 1.21f};

        for (int i = 0; i < vat.length; i++) {

            if(vatType == i){

                return vat[i];
            }
        }
        return -1;
    }
}
