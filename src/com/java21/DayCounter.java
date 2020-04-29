package com.java21;

public class DayCounter {
    public static void main(String[] args){
        System.out.println("counting days...");
        Object[][] thisYear = populateMonths(1984);
        System.out.println(thisYear[0][22]);
    }

    public static boolean isLeap(int year){
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

    public static Object[][] populateMonths(int year){
        boolean leap = isLeap(year);
        Object[][] populatedYear = new Object[12][31];
        return populatedYear;
    }

}
