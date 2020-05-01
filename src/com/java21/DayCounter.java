package com.java21;

import java.sql.Date;

public class DayCounter {
//    Start day: January 1st, 2020 = Wednesday
    static int START_DAY = 3;
    static int START_YEAR = 2020;

    public static void main(String[] args){
        System.out.println("counting days...");
        DayCounter myYear = new DayCounter();
        boolean leapYear = myYear.isLeap(2020);
        System.out.println(leapYear);

        System.out.println(myYear.dayChange(2019));



    }
//  Determines if a year is leap or not
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

//    Calculates how many days apart is January 1st of the selected year in comparison to the START_DATE
    public int dayChange(int year){
        int dayChanger = 0;
        if (year > START_YEAR){
            for (int i = year; i > START_YEAR; i--){
                if(isLeap(i)){
                    dayChanger += 2;
                } else {
                    dayChanger++;
                }
            }
        } else {
            for (int i = year; i < START_YEAR; i++){
                if(isLeap(i)){
                    dayChanger -= 2;
                } else {
                    dayChanger--;
                }
            }
        }
        return dayChanger%7;
    }


}


