package com.java21;

import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args){
        int[] holidays = { 1, 15, 50, 148, 185, 246, 281, 316, 326, 359 };
        BitSet myHolidays = setHolidays(holidays);
        System.out.println(isHoliday(myHolidays, 50));

    }

    static BitSet setHolidays(int[] holidays){
        BitSet holidaySchedule = new BitSet(365);
        for(int holiday : holidays){
            holidaySchedule.set(holiday);
        }
        return holidaySchedule;
    }

    static boolean isHoliday(BitSet holidaySet, int day){
        return holidaySet.get(day);
    }

}
