package com.Marian.Exercicis.Classes.Abstracte;

import java.util.Date;

public class Customer extends Account{

    private String firstName;
    private String lastName;
    private TimeDepositAccount[] accounts;
    private int numberOfAccounts;

    public Customer(double balance,String f, String l) {

        super(balance);

        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new TimeDepositAccount[10];
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(TimeDepositAccount acct) {
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public TimeDepositAccount getAccount(int account_index) {
        return accounts[account_index];
    }

    @Override
    public String getDescription() { return "This person  " + firstName  + lastName + " have " +
            numberOfAccounts + numberOfAccounts;
    }
    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}