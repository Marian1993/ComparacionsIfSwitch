package com.Marian.Exercicis;

import com.Marian.Exercicis.Classes.Employee.*;
import com.Marian.Exercicis.ExercicisDeReforç.*;
import com.Marian.Exercicis.ExercicisP.TiposDeSorts;
import com.Marian.Exercicis.GenericsIColeccions.TendaCamisetes.Tenda;
import com.Marian.Exercicis.Refactoritzar.Customer;
import com.Marian.Exercicis.Refactoritzar.EliminarAssignacioParametre;
import com.Marian.Exercicis.Refactoritzar.LocalExtension.MyConversor;

import java.util.Arrays;

import static java.lang.Integer.max;

public class Main {

    public static void main(String[] args) {


        Tenda tenda = new Tenda();

        tenda.afeguirPrenda("A100","Camiseta");
        tenda.afeguirPrenda("A101","Jarse");
        tenda.afeguirPrenda("A102","Pantalons");
        tenda.afeguirPrenda("A103","Jaqueta");
        tenda.afeguirPrenda("A104","Pantalons");
        tenda.afeguirPrenda("A105","Pantalons");
        tenda.afeguirPrenda("A106","Pantalons");

        tenda.imprimirPrendes();
        System.out.println();

        System.out.println(tenda.cercarPrenda("Pantalons"));

        System.out.println();

        System.out.println(tenda.stockPrenda("Pantalons"));

    }
}



