package oop.labor08;

import oop.labor08.lab8_1.*;
import oop.labor08.lab8_2.StackAggregation;
import oop.labor08.lab8_2.StackInheritance;

public class Main {
    public static void main(String[] args) {
/*
        Bank bank1 = new Bank("OTP");
        Customer customer1 = new Customer("Customer", "One");
        Customer customer2 = new Customer("Customer", "Two");
        customer1.addAccount(new SavingsAccount(1.2));
        customer1.addAccount(new CheckingAccount(30));
        customer2.addAccount(new SavingsAccount(1.4));
        customer2.addAccount(new CheckingAccount(60));

//        for (int cid: bank1.get)

        //hianyzik a customerbol a getAccountNumbers()

//        customer1.getAccountNumbers();

//        customer1.getAccount("OTP0000001").deposit(100);
//        customer1.getAccount("OTP0000002").deposit(32);
//        customer2.getAccount("OTP0000003").deposit(150);
//        customer2.getAccount("OTP0000004").deposit(56);

        System.out.println(customer1);
        System.out.println(customer2);
        */

        StackAggregation stack1 = new StackAggregation( 5 );
        for( int i=0; i<10; ++i ){
// boxing: int --> Integer
            stack1.push( i );
        }
        System.out.print("StackAggregation : ");
        while( !stack1.isEmpty() ){
            System.out.print( stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();
        StackInheritance stack2 = new StackInheritance( 5 );
        for( int i=0; i<10; ++i ){
            stack2.push( i );
        }
        stack2.remove( 1 );
        System.out.print("StackInheritance : ");
        while( !stack2.isEmpty() ){
            System.out.print( stack2.top() + " ");
            stack2.pop();
        }
        System.out.println();
    }
}
