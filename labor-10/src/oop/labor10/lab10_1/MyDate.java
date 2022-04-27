package oop.labor10.lab10_1;

public class MyDate implements Comparable<MyDate>{
    //Attributes
    private int year, month, day;

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

    @Override
    public int compareTo(MyDate o) {
        if (this.year == o.year){
            if (this.month == o.month){
                if (this.day == o.day){
                    return 0;
                }
                return this.day - o.day;
            }
            return this.month - o. month;
        }
        return this.year - o.year;
    }
}
