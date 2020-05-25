package com.java21;

import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args){
        System.out.println("This will return the holidays");
    }

    BitSet setHolidays(int[] holidays){
        BitSet holidaySchedule = new BitSet(365);
        for(int holiday : holidays){
            holidaySchedule.set(holiday);
        }
        return holidaySchedule;
    }

}
