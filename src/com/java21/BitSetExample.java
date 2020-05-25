package com.java21;

import java.util.BitSet;

public class BitSetExample {
    public static final int PLAY = 0;
    public static final int STOP = 1;
    public static final int PAUSE = 2;

    public static void main(String[] args){
        System.out.println(PAUSE);

        BitSet mySet = new BitSet(3);

        mySet.set(0);
        mySet.clear(1);
        mySet.clear(2);

        boolean bool = mySet.get(BitSetExample.PAUSE);

        System.out.println(bool);
    }
}
