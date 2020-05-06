package com.asalasdev.dominoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

//    Shuffle set and save in ArrayList to remove pieces as needed
    void shuffleSet(Domino[] dominoes){
        this.shuffledSet = new ArrayList<>(Arrays.asList(dominoes));
        Collections.shuffle(shuffledSet);
        System.out.println("Shuffled");
    }


}
