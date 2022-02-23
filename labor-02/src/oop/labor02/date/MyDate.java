package oop.labor02.date;

public class MyDate {
    //Attributes
    int year, month, day;

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString(){
        return this.year + "/" + this.month + "/" +this.day;
    }
}
