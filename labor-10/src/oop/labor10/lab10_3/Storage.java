package oop.labor10.lab10_3;

import oop.labor10.lab10_1.MyDate;
import oop.labor10.lab10_2.Employee;
import oop.labor10.lab10_2.Manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> products = new ArrayList<>();

    public Storage(String fileName) {
        try (Scanner scanner = new Scanner((new File("Data/"+fileName)))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] items = line.split(" ");
                int ID = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());
                int price = Integer.parseInt(items[3].trim());
                products.add(new Product(ID, name, amount, price));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        products.sort(Product::compareTo);

    }

    public void update(String fileName){
        int updated = 0;
        try (Scanner scanner = new Scanner(new File("Data/"+fileName))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] items = line.split(" ");
                int ID = Integer.parseInt(items[0].trim());
                int index = binarySearch(products, ID);
                if (index != -1){
                    products.get(index).increaseAmount(Integer.parseInt(items[1].trim()));
                    updated++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of products that were successfully updated: " + updated);
    }

    public int binarySearch(ArrayList<Product> products, int ID){
        int left = 0;
        int right = products.size()-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (products.get(mid).getID() == ID){
                return mid;
            }
            if (products.get(mid).getID() < ID){
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
        return -1;
    }

    public void print(){
        for (Product p:products){
            System.out.println(p);
        }
    }
}
