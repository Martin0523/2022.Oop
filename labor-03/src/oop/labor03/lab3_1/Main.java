package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        //System.out.println(customer1.toString());
        System.out.println(customer1);
        BankAccount account1 = new BankAccount("OTP00001");
        customer1.setAccount(account1);
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.getAccount().withdraw(200);
        System.out.println(customer1);

        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount account2 = new BankAccount("OTP00002");
        customer2.setAccount(account2);
        System.out.println(customer2);
        customer2.getAccount().deposit(300);
        //System.out.println(customer2);
        customer2.getAccount().withdraw(120);
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setLastName("BLACK");
        customer2.setAccount(account1);
        System.out.println(customer1);
        System.out.println(customer2);

    }
}