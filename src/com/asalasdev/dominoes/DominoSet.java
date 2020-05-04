package com.asalasdev.dominoes;

public class DominoSet {
    String variant;
    Domino[] dominoSet;
    int maxValue;
    int numOfPieces;

//  Getters and Setters
    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Domino[] getDominoSet() {
        return dominoSet;
    }

    public void setDominoSet(Domino[] dominoSet) {
        this.dominoSet = dominoSet;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

    public void setNumOfPieces(int numOfPieces) {
        this.numOfPieces = numOfPieces;
    }
}
