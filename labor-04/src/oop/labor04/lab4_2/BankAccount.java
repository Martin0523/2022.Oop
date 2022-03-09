package oop.labor04.lab4_2;

public class BankAccount {

    //Atributumok
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double sum){
        if (sum > 0){
            this.balance += sum;
        }
    }

    public boolean withdraw(double sum){
        if (this.balance >= sum){
            this.balance -= sum;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account: " +this.accountNumber +
                ", balance: " + this.balance;
    }
}
