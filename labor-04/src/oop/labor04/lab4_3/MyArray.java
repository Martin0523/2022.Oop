package oop.labor04.lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {

    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(double[] array) {
        this.elements = new double[array.length];
        System.arraycopy(array, 0, elements, 0, array.length);
        this.length = array.length;
    }

    public MyArray(MyArray array){
        this.length = array.length;
        this.elements = array.elements;
    }

    public MyArray(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))){
            String numberOfElements = scanner.nextLine();
            this.length = Integer.parseInt(numberOfElements);
            this.elements = new double[length];
            String[] elem = scanner.nextLine().split(" ");
            for (int i = 0; i < length; i++) {
                elements[i] = Double.parseDouble(elem[i].trim());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void fillRandom(double a, double b){
        Random random = new Random();

        for (int i = 0; i < length; ++i){
            elements[i] = random.nextDouble(b - a) + a;
        }
    }

    public double mean(){
        double temp = 0;
        for (double elem:elements){
            temp += elem;
        }
        return temp/length;
    }

    public double stddev(){
        double mean = mean();
        double stddev = 0;
        for (double elem:elements){
            stddev += Math.pow(elem - mean, 2);

        }
        return Math.sqrt(stddev/length);
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void print(String array){
        System.out.printf(array + ": ");
        for (double elem:elements){
            System.out.printf("%10.2f ", elem);
        }
        System.out.println();
    }
}
