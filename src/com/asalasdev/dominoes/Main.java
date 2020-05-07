package com.asalasdev.dominoes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        String variant = "Venezuelan";
        String[] players = {"Alejandro", "Juan", "Arcadio", "Oscar"};
        System.out.println("Creating a new game");

        Game newGame = new Game(players, variant);

        Domino[] myDominoes = newGame.gameSet.dominoSet;

        newGame.shuffleSet(myDominoes);

        ArrayList<Domino> shuffled = newGame.shuffledSet;

        for (Domino dom : shuffled) {
            System.out.println(dom.top + " | " + dom.bottom);
        }

        ArrayList<Player> thesePlayers = newGame.players;

        for (Player player : thesePlayers){
            System.out.println(player.name);
        }

    }

}
