package oop.labor11.lab11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg szamokat szokozzel elvalasztva: ");
        String line = scanner.nextLine();
        double sum = 0;
        String[] items = line.split(" ");
        for (String item:items){
            try {
                sum += Double.parseDouble(item);
            } catch (NumberFormatException ex){
                System.out.println("Hibas input: " + item + " nem egy szam");
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
