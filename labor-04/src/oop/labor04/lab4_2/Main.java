package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

    }

    public static void readFile(String fileName, ArrayList<Customer> customers){
        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                if (items[0].equals("Customer")){
                    customers.add(new Customer())
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
