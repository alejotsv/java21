package com.asalasdev.dominoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Game {
    ArrayList<Player> players;
    DominoSet gameSet;
    ArrayList<Domino> shuffledSet;
    boolean isOver = false;

    public Game(String[] players, String variant) {
        createSet(variant);
        this.players = addPlayers(players);
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
        System.out.println("Shuffled set");
    }

//    Create ArrayList of Player objects from Array of players' names
    ArrayList<Player> addPlayers(String[] players){
        Player[] tempArr = new Player[players.length];
        for (int i=0; i<players.length; i++){
            tempArr[i] = new Player(players[i], i);
        }
        return new ArrayList<>(Arrays.asList(tempArr));
    }

    void distributeDominoes(ArrayList<Player> players, ArrayList<Domino> set){
        int i = 0;
        for(Player player : players){
            player.grabPieces(set, player.position + i);
            i += 6;
        }
    }

}
