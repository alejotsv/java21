package com.asalasdev.dominoes;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Domino> dominoSet;
    int position;
    boolean canPlay;

    public Player(String player, int position){
        this.name = player;
        this.position = position;
        this.dominoSet = new ArrayList<>();
    }

//    Method for players to get 7 pieces from a Domino set, based on their position
    void grabPieces(ArrayList<Domino> shuffledSet, int pos){
        for (int i=pos; i<pos+7; i++){
            this.dominoSet.add(shuffledSet.get(i));
        }
    }

    Domino playDomino(int index){
        return this.dominoSet.remove(index);
    }
}
