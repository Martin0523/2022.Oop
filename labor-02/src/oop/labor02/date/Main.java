package oop.labor02.date;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyDate[] dates = new MyDate[1000];
        Random rand = new Random();
        int invalidDateCount = 0;
        for (int i = 0; i < 1000; i++){
            int year = 1 + rand.nextInt(4000);
            int month = 1 + rand.nextInt(40);
            int day = 1 + rand.nextInt(100);
            dates[i] = new MyDate(year, month, day);
            if (DateUtil.isValidDate(year, month, day)){
                System.out.println(dates[i].toString());
            }
            else{
                invalidDateCount++;
            }
        }
        System.out.println("The invalid amount of dates generated: " + invalidDateCount);
    }
}
