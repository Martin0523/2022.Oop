package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        readFile("lab4_2_input.txt", customers);
        for (Customer customer:customers){
            System.out.println(customer);
        }

    }

    public static void readFile(String fileName, ArrayList<Customer> customers){
        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                if (items[0].trim().equals("Customer")){
                    customers.add(new Customer(items[1].trim(), items[2].trim()));
                }
                else if(items[0].trim().equals("Account")){
                    customers.get(customers.size()-1).addAccount(new BankAccount(items[1].trim()));
                    customers.get(customers.size()-1).getAccount(items[1].trim()).deposit(Double.parseDouble(items[2].trim()));
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
