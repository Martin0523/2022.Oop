package oop.labor08.lab8_1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        //hatterben itt a super hivasa
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }

    @Override
    public boolean withdraw(double sum) {
        if(balance + overdraftLimit - sum >= 0){
            this.balance -= sum;
            return true;
        }
        return false;
    }
}
