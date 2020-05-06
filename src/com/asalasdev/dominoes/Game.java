package com.asalasdev.dominoes;

import java.util.ArrayList;

public class Game {
    String[] players;
    DominoSet gameSet;
    ArrayList<Domino> shuffledSet;

    public Game(String[] players, String variant) {
        this.players = players;
        createSet(variant);
    }

//    Create dominoes set depending on variant
//    Venezuelan: 28 pieces
//    Cuban (for kids): 55 pieces
    void createSet(String variant){
        if (variant.equals("Venezuelan")){
            this.gameSet = new DominoSetVenezuelan();
        } else if (variant.equals("Cuban")){
            gameSet = new DominoSetCuban();
        } else {
            System.out.println("The variant " + variant + " is not supported.");
        }
    }

    void shuffleSet(Domino[] dominoes){

    }


}
