package com.asalasdev.dominoes;

public class DominoSet {
    Domino[] dominoSet;

    public DominoSet(int maxValue, int numOfPieces){
        this.dominoSet = createSet(maxValue, numOfPieces);
    }

    static Domino[] createSet(int maxValue, int numOfPieces) {
        Domino[] dominoSet = new Domino[numOfPieces];
        for (int i=0; i<=maxValue; i++){
            for (int j=0; j<=maxValue; j++){
                Domino domino = new Domino(i,j);
                System.out.println("Pieza: " + domino.top + "|" + domino.bottom);
            }
        }

        return dominoSet;
    }

//  Getters
    public Domino[] getDominoSet() {
        return dominoSet;
    }

}
