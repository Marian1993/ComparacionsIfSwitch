package com.Marian.Exercicis.Refactoritzar.ForeignMethod;

public class PasswordChecker {

    public static String improvePassword (String password) {
        if (password.length() < 5) {
            return morePassword(password);
        } else {
            return password;
        }
    }
    public static String morePassword(String password){

        return password + "mesllarg";
    }
}
