package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    //constant
    public static final int MAX_ACCOUNTS = 10;

    private String firstName;
    private String lastName;
    //number of accounts
    private int numAccounts;
    //array for the accounts
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account){
        if (numAccounts < MAX_ACCOUNTS){
            this.accounts[numAccounts] = account;
            numAccounts++;
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; ++i){
            if (this.accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){
        for (int i = 0; i < numAccounts; ++i){
            if (this.accounts[i].getAccountNumber().equals(accountNumber)){
                this.accounts[i] = this.accounts[numAccounts-1];
                numAccounts--;
            }
        }
    }

    public int getNumAccounts(){
        return numAccounts;
    }

    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i){
            if (this.accounts[i] != null){
                result.append("\t" + accounts[i].toString() + "\n");
            }
        }
        return result.toString();
    }
}
