package com.java21;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Birthday {
    public static void main(String[] args){
        System.out.println("Birthday");
        birthdaySlicer("09/19/81");
    }

    static void birthdaySlicer(String birthday){
        String[] arr = new String[3];
        StringTokenizer token = new StringTokenizer(birthday, "/");
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
    }


}
