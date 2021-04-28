package com.Marian.Exercicis.ExercicisP;

import com.Marian.Exercicis.Classes.Shirt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsProcessing {


    private String file = "src/com/Marian/Exercicis/gettys.html";
    private Pattern pat;
    private Matcher mat;

    public void trobarPattern() {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = "";

            //pat = Pattern.compile("^<h4>");
            //pat = Pattern.compile("^\\s{4}");
            //pat = Pattern.compile("^<[p|d]");
            pat = Pattern.compile("^</.*?>$");

            while ((line = reader.readLine()) != null){

                mat = pat.matcher(line);
                if(mat.find()){
                    System.out.println(line);
                }
            }
        }catch (IOException e){

            e.printStackTrace();
        }
    }
    public void canviarPattern() {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = "";

            pat = Pattern.compile("\\bp");

            while ((line = reader.readLine()) != null){

                mat = pat.matcher(line);
                if(mat.find()){
                    line = mat.replaceAll("span");
                    System.out.println(line);
                }
            }
        }catch (IOException e){

            e.printStackTrace();
        }
    }


    public static void addShirt(String camisetes) {

        ArrayList<Shirt> arrayshirts = new ArrayList<>();

        String[] shirts = camisetes.split(";");

        for (String shirt : shirts) {

            String[] camiseta = shirt.split(",");

            arrayshirts.add(new Shirt(Integer.parseInt(camiseta[0]), camiseta[1], camiseta[2], camiseta[3].charAt(0)));

        }
        for (Shirt shirt : arrayshirts) {

            System.out.println(shirt);
        }
    }
}
