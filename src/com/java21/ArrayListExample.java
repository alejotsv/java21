package com.java21;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> xMen = new ArrayList<String>();
        String[] arr = { "Xavier", "Magneto", "Jean", "Cyclops", "Wolverine"};
        for(String x : arr){
            xMen.add(x);
        }

        Iterator i = xMen.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
            System.out.println(i.hasNext());
        }




    }
}
