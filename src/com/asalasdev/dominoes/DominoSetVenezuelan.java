package com.asalasdev.dominoes;

public class DominoSetVenezuelan extends DominoSet {
    static final int MAX_VALUE = 6;
    static final int NUM_OF_PIECES = 28;

    public DominoSetVenezuelan() {
        super(MAX_VALUE, NUM_OF_PIECES);
    }

    public static int getMaxValue() {
        return MAX_VALUE;
    }

    public static int getNumOfPieces() {
        return NUM_OF_PIECES;
    }
}
