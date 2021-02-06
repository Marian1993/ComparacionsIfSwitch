package com.Marian.Exercicis.Classes.AbstractionAndEnum;

public class CheckingAccount extends Account{

    private double overDraftLimit;

    public CheckingAccount(double balance){

        super(balance);
        overDraftLimit = 0;
    }

    public CheckingAccount(double balance, double overDraftLimit){

        super(balance);

        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String getDescription() {
        return "Can have " + overDraftLimit + "in negative";
    }

    @Override
    public boolean withdraw(double amount) {

        if((balance -= amount) >= overDraftLimit){

            return true;
        }else {
            return false;
        }
    }
}
