package com.asalasdev.dominoes;

public class DominoSet {
    Domino[] dominoSet;

    public DominoSet(int maxValue, int numOfPieces){
        this.dominoSet = createSet(maxValue, numOfPieces);
    }

    static Domino[] createSet(int maxValue, int numOfPieces) {
        Domino[] dominoSet = new Domino[numOfPieces];
        int arrPosition = 0;
        int counter = 0;
        for (int i=counter; i<=maxValue; i++){
            for (int j=counter; j<=maxValue; j++){
                Domino domino = new Domino(i,j);
                dominoSet[arrPosition] = domino;
                arrPosition++;
            }
            counter++;//
        }

        return dominoSet;
    }

//  Getters
    public Domino[] getDominoSet() {
        return dominoSet;
    }

}
