package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //customer1
        Customer customer1 = new Customer("John", "BLACK");
        Random rand = new Random();
        BankAccount[] accounts = new BankAccount[1000];
        String accNr = "OTP";
        for (int i = 0; i < customer1.getNumAccounts()+1; i++) {
            accounts[i] = new BankAccount(accNr.concat(String.valueOf(i)));
            customer1.addAccount(accounts[i]);
            accounts[i].deposit(rand.nextInt(5000));
        }
        //System.out.println(customer1);

        //customer2
        Customer customer2 = new Customer("Mary", "WHITE");
        for (int i = customer1.getNumAccounts(); i < customer1.getNumAccounts() + customer2.getNumAccounts()+1; i++) {
            accounts[i] = new BankAccount(accNr.concat(String.valueOf(i)));
            customer2.addAccount(accounts[i]);
            accounts[i].deposit(rand.nextInt(5000));
        }


        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP6");
        customer2.closeAccount("OTP12");
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
