package com.Marian.Exercicis.Classes.Abstracte;

public class CustomerReport extends Account{

    private Bank bank;


    public CustomerReport(double balance, Bank bank){

        super(balance);

        this.bank = bank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
            Customer customer = bank.getCustomer(cust_idx);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            // For each account for this customer...
            for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
                TimeDepositAccount account = customer.getAccount(acct_idx);

                // Print the current balance of the account
                System.out.println("    " + account);
            }
        }
    }

    @Override
    public String getDescription() { return "In this bank " + bank + " have " + balance;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
