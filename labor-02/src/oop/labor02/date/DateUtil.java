package oop.labor02.date;

public class DateUtil {

    public static boolean leapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day){
        if (year > 0 && year < 2023){
            if (month > 0 && month < 13){
                if (month == 1 && day < 32 && day > 0){
                    return true;
                }
                if (month == 2 && leapYear(year) && day < 30 && day > 0){
                    return true;
                }
                if (month == 2 && !leapYear(year) && day < 29 && day > 0){
                    return true;
                }
                if (month == 3 && day < 32 && day > 0){
                    return true;
                }
                if (month == 4 && day < 31 && day > 0){
                    return true;
                }
                if (month == 5 && day < 32 && day > 0){
                    return true;
                }
                if (month == 6 && day < 31 && day > 0){
                    return true;
                }
                if (month == 7 && day < 32 && day > 0){
                    return true;
                }
                if (month == 8 && day < 32 && day > 0){
                    return true;
                }
                if (month == 9 && day < 31 && day > 0){
                    return true;
                }
                if (month == 10 && day < 32 && day > 0){
                    return true;
                }
                if (month == 11 && day < 31 && day > 0){
                    return true;
                }
                if (month == 12 && day < 32 && day > 0){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
