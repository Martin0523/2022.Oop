package oop.labor02.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.toString());
        account1.deposit(1000);
        System.out.println(account1.toString());
        boolean result = account1.withdraw(500);
        if (!result){
            System.out.println("Insufficient funds");
        }
        System.out.println(account1.toString());
        result = account1.withdraw(1000);
        if (!result){
            System.out.println("Insufficient funds");
        }
        System.out.println(account1.toString());
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.toString());
        account2.deposit(2000);
        System.out.println(account2.toString());
    }
}
