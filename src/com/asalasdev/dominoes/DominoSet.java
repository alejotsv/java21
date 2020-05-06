package com.asalasdev.dominoes;

public class DominoSet {
    Domino[] dominoSet;

    public DominoSet(int maxValue, int numOfPieces){
        this.dominoSet = createSet(maxValue, numOfPieces);
    }

    static Domino[] createSet(int maxValue, int numOfPieces) {
        Domino[] dominoSet = new Domino[numOfPieces];
        int pieza = 1;
        int counter = 0;
        for (int i=counter; i<=maxValue; i++){
            for (int j=counter; j<=maxValue; j++){
                Domino domino = new Domino(i,j);
                System.out.println("Pieza " + pieza + ": " + domino.top + "|" + domino.bottom);
                pieza ++;
            }
            counter++;
//            TODO: fix repeated dominoes and add to Domino array
        }

        return dominoSet;
    }

//  Getters
    public Domino[] getDominoSet() {
        return dominoSet;
    }

}
