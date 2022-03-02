package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //customer1
        Customer customer1 = new Customer("John", "BLACK");
        BankAccount account1 = new BankAccount("OTP00001");
        BankAccount account2 = new BankAccount("OTP00002");
        BankAccount account3 = new BankAccount("OTP00003");
        BankAccount account4 = new BankAccount("OTP00004");
        BankAccount account5 = new BankAccount("OTP00005");
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.addAccount(account3);
        customer1.addAccount(account4);
        customer1.addAccount(account5);

        //customer2
        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount account6 = new BankAccount("OTP00006");
        BankAccount account7 = new BankAccount("OTP00007");
        BankAccount account8 = new BankAccount("OTP00008");
        BankAccount account9 = new BankAccount("OTP00009");
        BankAccount account10 = new BankAccount("OTP000010");
        BankAccount account11 = new BankAccount("OTP000011");
        BankAccount account12 = new BankAccount("OTP000012");
        BankAccount account13 = new BankAccount("OTP000013");
        BankAccount account14 = new BankAccount("OTP000014");
        customer2.addAccount(account6);
        customer2.addAccount(account7);
        customer2.addAccount(account8);
        customer2.addAccount(account9);
        customer2.addAccount(account10);
        customer2.addAccount(account11);
        customer2.addAccount(account12);
        customer2.addAccount(account13);
        customer2.addAccount(account14);

        System.out.println(customer1);
        System.out.println(customer2);

        //Depositing a random ammount of money in each account
        Random rand = new Random();
        customer1.getAccount("OTP00001").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00002").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00003").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00004").deposit(rand.nextInt(5000));
        customer1.getAccount("OTP00005").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP00006").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP00007").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP00008").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP00009").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP000010").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP000011").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP000012").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP000013").deposit(rand.nextInt(5000));
        customer2.getAccount("OTP000014").deposit(rand.nextInt(5000));

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP000014");
        System.out.println(customer1);
        System.out.println(customer2);


    }
}
