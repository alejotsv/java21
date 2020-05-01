package com.java21;

import java.sql.Date;

public class DayCounter {
//    Start day: January 1st, 2020 = Wednesday
    static int START_DAY = 3;
    static int START_YEAR = 2020;

    public static void main(String[] args){
        DayCounter myYear = new DayCounter();
        myYear.getDay("September", 13, 2020);



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

//    Calculate the number of days from January 1st until the selected day
    public int valueOfDate(String month, int day, int year){
        int valueOfMonth = 0;
        switch(month){
            case "January":
                valueOfMonth = 0;
                break;
            case "February":
                valueOfMonth = 31;
                break;
            case "March":
                valueOfMonth = 59;
                break;
            case "April":
                valueOfMonth = 90;
                break;
            case "May":
                valueOfMonth = 120;
                break;
            case "June":
                valueOfMonth = 151;
                break;
            case "July":
                valueOfMonth = 181;
                break;
            case "August":
                valueOfMonth = 212;
                break;
            case "September":
                valueOfMonth = 243;
                break;
            case "October":
                valueOfMonth = 273;
                break;
            case "November":
                valueOfMonth = 304;
                break;
            case "December":
                valueOfMonth = 334;
                break;
        }
        if (isLeap(year)){
            valueOfMonth++;
        }
        return valueOfMonth + day;
    }

//    Calculate what day of the week is any given date
    public String dayOfTheWeek(String month, int day, int year){
        String theDay = "day";
        int firstDay = firstDay(year);
        int valueOfDate = valueOfDate(month, day, year);
        int thisDay = (firstDay + valueOfDate - 1)%7;

        switch(thisDay){
            case 1:
                theDay = "Monday";
                break;
            case 2:
                theDay = "Tuesday";
                break;
            case 3:
                theDay = "Wednesday";
                break;
            case 4:
                theDay = "Thursday";
                break;
            case 5:
                theDay = "Friday";
                break;
            case 6:
                theDay = "Saturday";
                break;
            case 0:
                theDay = "Sunday";
                break;
        }

        return theDay;

    }

//    Print day of the week for any given date
    public void getDay(String month, int day, int year){
        System.out.println("Day of the week for " + month + " " + day + ", " + year + ":\n" + dayOfTheWeek(month, day, year));
    }

}


