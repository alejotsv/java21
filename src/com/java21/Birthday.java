package com.java21;

import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Math.abs;

public class Birthday {
    public static void main(String[] args){
        ArrayList<String> birthdayDates = birthdaySlicer("09/19/81");
        printBirthday(birthdayDates);
    }

    static ArrayList<String> birthdaySlicer(String birthday){
        ArrayList<String> arr = new ArrayList<String>();
        StringTokenizer token = new StringTokenizer(birthday, "/");
        while(token.hasMoreTokens()){
            arr.add(token.nextToken());
        }
        return arr;
    }

    static void printBirthday(ArrayList<String> birthday){
        System.out.println("Birthday\nMonth: " + birthday.get(0) + "\nDay: " + birthday.get(1) + "\nYear: " + birthday.get(2));
    }


}
