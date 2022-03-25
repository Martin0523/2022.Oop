package oop.labor06;

import oop.labor06.lab6_1.Bank;
import oop.labor06.lab6_1.BankAccount;
import oop.labor06.lab6_1.Customer;
import oop.labor06.lab6_2.Matrix;

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
        bank1.addCustomer(new Customer("Customer", "One"));
        bank1.addCustomer(new Customer("Customer", "Two"));
        bank1.getCustomer(0).addAccount(new BankAccount());
        bank1.getCustomer(0).addAccount(new BankAccount());
        bank1.getCustomer(1).addAccount(new BankAccount());
        bank1.getCustomer(1).addAccount(new BankAccount());
        System.out.println(bank1.getCustomer(1));
        bank1.getCustomer(0).getAccount("OTP0000151").deposit(1000);
        bank1.getCustomer(0).getAccount("OTP0000152").deposit(2000);
        bank1.getCustomer(1).getAccount("OTP0000153").deposit(500);
        bank1.getCustomer(1).getAccount("OTP0000154").deposit(1300);
        System.out.println(bank1.getCustomer(2));
        bank1.printCustomersToFile("bank_customers.csv");

        //Matrix test
        System.out.println();
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix m0 = new Matrix(d);
        System.out.println("m0 rows: " + m0.getRows()+", cols: " + m0.getColumns());
        System.out.println("m0: ");
        m0.printMatrix();
        System.out.println();
        Matrix m00 = new Matrix( m0 );
        System.out.println("m00 is a deep copy of m0: ");
        m00.printMatrix();
        System.out.println("************************");
        Matrix m1 = new Matrix(2, 3);
        m1.fillRandom(1,2);
        System.out.println("m1: ");
        m1.printMatrix();
        System.out.println();
        Matrix m2 = new Matrix(2, 3);
        m2.fillRandom(1,2);
        System.out.println("m2: ");
        m2.printMatrix();
        System.out.println("Sum: m1 + m2");
        Matrix.add(m1, m2).printMatrix();
        Matrix m3 = new Matrix(3, 4);
        m3.fillRandom(2, 3);
        System.out.println("m3: ");
        m3.printMatrix();
        System.out.println("Product: m1 * m3");
        Matrix.multiply(m1, m3).printMatrix();
        System.out.println("Transpose(m3)");
        Matrix.transpose( m3 ).printMatrix();
    }
}
