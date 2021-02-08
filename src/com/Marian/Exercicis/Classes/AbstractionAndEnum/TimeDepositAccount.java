package com.Marian.Exercicis.Classes.AbstractionAndEnum;

import java.util.Calendar;
import java.util.Date;

public class TimeDepositAccount extends  Account{

    private Date maturityDate;


    public TimeDepositAccount(double balance, DepositLenght duration) {
        super(balance);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, duration.getDays());
        this.maturityDate = calendar.getTime();
    }
    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance;
    }


    public boolean withdraw(double amount) {
        Date today = new Date();
        if(today.after(maturityDate)) {
            if(amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    
}