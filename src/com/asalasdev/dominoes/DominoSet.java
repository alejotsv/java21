package com.asalasdev.dominoes;

public class DominoSet {
    String variant;
    Domino[] dominoSet;
    int maxValue;
    int numOfPieces;

    public DominoSet(String variant){
        this.variant = variant;
        if (variant == "Venezuelan"){
            this.maxValue = 6;
            this.numOfPieces = 28;
        } else if (variant == "Cuban"){
            this.maxValue = 9;
            this.numOfPieces = 55;
        }

    }

    Domino[] createSet(int maxValue, int numOfPieces) {
        Domino[] dominoSet = new Domino[numOfPieces];
    }

//  Getters
    public String getVariant() {
        return variant;
    }

    public Domino[] getDominoSet() {
        return dominoSet;
    }

     public int getMaxValue() {
        return maxValue;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

}
