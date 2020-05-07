package com.asalasdev.dominoes;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Domino> dominoSet;
    int position;

    public Player(String player, int position){
        this.name = player;
        this.position = position;
        this.dominoSet = new ArrayList<>();
    }

    void grabPieces(ArrayList<Domino> shuffledSet, int pos){

    }
}
