package com.asalasdev.dominoes;

public class Game {
    String[] players;
    DominoSet gameSet;

    public Game(String[] players, String variant) {
        this.players = players;
        createSet(variant);
    }

    void createSet(String variant){
        if (variant.equals("Venezuelan")){
            this.gameSet = new DominoSetVenezuelan();
        } else if (variant.equals("Cuban")){
            gameSet = new DominoSetCuban();
        } else {
            System.out.println("The variant " + variant + " is not supported.");
        }
    }

}
