package com.asalasdev.dominoes;

public class DominoSetCuban extends DominoSet {
    static final int MAX_VALUE = 9;
    static final int NUM_OF_PIECES = 55;

    public DominoSetCuban(){
        super(MAX_VALUE, NUM_OF_PIECES);
    }

    public static int getMaxValue() {
        return MAX_VALUE;
    }

    public static int getNumOfPieces() {
        return NUM_OF_PIECES;
    }
}
