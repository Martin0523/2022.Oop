package oop.labor08;

import oop.labor08.lab8_1.*;
import oop.labor08.lab8_2.StackAggregation;
import oop.labor08.lab8_2.StackInheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank bank1 = new Bank("OTP");
        Customer customer1 = new Customer("Customer", "One");
        Customer customer2 = new Customer("Customer", "Two");
        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);

        customer1.addAccount(new SavingsAccount(1.2));
        customer1.addAccount(new CheckingAccount(30));
        customer2.addAccount(new SavingsAccount(1.4));
        customer2.addAccount(new CheckingAccount(60));


        for (int i = 0; i < bank1.numCostumers(); i++){
            ArrayList<String> accId = bank1.getCustomer(i).getAccountNumbers();
            for (String id:accId){
                bank1.getCustomer(i).getAccount(id).deposit(100);
            }
        }

        System.out.println(customer1);
        System.out.println(customer2);

        for (int i = 0; i < bank1.numCostumers(); i++){
            ArrayList<String> accId = bank1.getCustomer(i).getAccountNumbers();
            for (String id:accId){
                if (bank1.getCustomer(i).getAccount(id) instanceof SavingsAccount){
                    ((SavingsAccount) bank1.getCustomer(i).getAccount(id)).addInterest();
                }
            }
        }

        System.out.println(customer1);
        System.out.println(customer2);

        for (int i = 0; i < bank1.numCostumers(); i++){
            ArrayList<String> accId = bank1.getCustomer(i).getAccountNumbers();
            for (String id:accId){
                bank1.getCustomer(i).getAccount(id).withdraw(145);
            }
        }

        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println('\n');

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
