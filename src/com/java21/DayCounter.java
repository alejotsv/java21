package com.java21;

public class DayCounter {
    public static void main(String[] args){
        System.out.println("counting days...");
        DayCounter myYear = new DayCounter();
        boolean leapYear = myYear.isLeap(2020);
        System.out.println(leapYear);

    }

    public boolean isLeap(int year){
        boolean leap = false;
        if (year%4 == 0){
            if (year%100 == 0 && year%400 != 0){
                return leap;
            } else {
                leap = true;
            }
        }
        return leap;
    }


}


