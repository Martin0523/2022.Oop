package oop.labor06;

import oop.labor06.lab6_1.Bank;
import oop.labor06.lab6_1.BankAccount;
import oop.labor06.lab6_1.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            accounts.add(new BankAccount());
            System.out.println(accounts.get(i));
        }
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            customers.add(new Customer("asd", "dsa"));
            customers.get(i).addAccount(accounts.get(i));
            System.out.println(customers.get(i));
        }
        System.out.println();
        Bank bank1 = new Bank("OTP");
        for (Customer c:customers){
            bank1.addCustomer(c);
        }
        bank1.printCustomersToStdOut();
    }
}
