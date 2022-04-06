package oop.labor08.lab8_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super(); //ez kerul be elso elemnek a konstruktorba
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance = (balance * (interestRate + 100))/100;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
