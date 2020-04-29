package com.java21;

public class DayCounter {
    public static void main(String[] args){
        System.out.println("counting days...");

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

}
