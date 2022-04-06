package oop.labor08.lab8_1;

public class BankAccount {

    //Atributumok
    protected final String accountNumber;
    protected double balance;

    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;

    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private static String createAccountNumber() {
//        String accNr = new String();
//        accNr = PREFIX;
//        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH - PREFIX.length() - String.valueOf(numAccounts).length(); i++) {
//            accNr += "0";
//        }
//        accNr += String.valueOf(numAccounts);
//        return accNr;
        int numAccountsLength = String.valueOf(numAccounts).length();
        return PREFIX + "0".repeat(ACCOUNT_NUMBER_LENGTH - PREFIX.length() - numAccountsLength) + numAccounts;
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
