package oop.labor10.lab10_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10;) {
            int y = 2022;
            int m = rand.nextInt(12) + 1;
            int d = rand.nextInt(31) + 1;
            if (DateUtil.isValidDate(y,m,d)){
                dates.add(new MyDate(y,m,d));
                i++;
            }
        }
        for (MyDate d:dates){
            System.out.println(d);
        }
        Collections.sort(dates);
        System.out.println("After sort:");
        for (MyDate d:dates){
            System.out.println(d);
        }
    }
}
