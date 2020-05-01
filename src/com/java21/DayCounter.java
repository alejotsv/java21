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

        int itChanged = myYear.dayChange(1996);
        System.out.println(itChanged);




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
            dayChanger++;
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
        return (dayChanger%7);
    }

//    Calculate day of January 1st of selected year
    public int firstDay(int year){
        int dayNumber = 0;
        switch(dayChange(year)){
            case 0:
                dayNumber = 3;
                break;
            case -1:
            case 6:
                dayNumber = 2;
                break;
            case -2:
            case 5:
                dayNumber = 1;
                break;
            case -3:
            case 4:
                dayNumber = 7;
                break;
            case -4:
            case 3:
                dayNumber = 6;
                break;
            case -5:
            case 2:
                dayNumber = 5;
                break;
            case -6:
            case 1:
                dayNumber = 4;
                break;
        }
        return dayNumber;
    }

}


