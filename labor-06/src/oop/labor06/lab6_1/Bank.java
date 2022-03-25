package oop.labor06.lab6_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;

    }

    public Customer getCustomer(int index){
        if (index > customers.size()-1){
            System.out.println("Customer does not exist!");
            return null;
        }
        return customers.get(index);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public int numCostumers(){
        return customers.size();
    }

    public void printCustomersToStdOut(){
        printCustomers(System.out);
    }

    public void printCustomersToFile(String fileName){
        try(PrintStream output = new PrintStream(fileName)){
            printCustomers(output);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private void printCustomers(PrintStream printStream){
        printStream.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer :customers){
            printStream.println(customer.getId()+ ", " + customer.getFirstName() + ", " + customer.getLastName()
            + ", " + customer.getNumAccounts());
        }
        printStream.close();
    }
}
