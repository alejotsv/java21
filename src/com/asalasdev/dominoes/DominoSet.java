package com.asalasdev.dominoes;

public class DominoSet {
    Domino[] dominoSet;

    public DominoSet(int maxValue, int numOfPieces){
        this.dominoSet = createSet(maxValue, numOfPieces);
    }

    static Domino[] createSet(int maxValue, int numOfPieces) {
        Domino[] dominoSet = new Domino[numOfPieces];
        int counter = 0;
        for (int i=0; i<=maxValue; i++){
            for (int j=0; j<=maxValue; j++){
                Domino domino = new Domino(i,j);
                System.out.println("Pieza " + (counter + j)+ ": " + domino.top + "|" + domino.bottom);
            }
//            TODO: fix repeated dominoes and add to Domino array
        }

        return dominoSet;
    }

//  Getters
    public Domino[] getDominoSet() {
        return dominoSet;
    }

}
