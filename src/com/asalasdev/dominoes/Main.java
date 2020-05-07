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
        Player first = thesePlayers.get(0);
        first.grabPieces(shuffled,first.position);

        for (Player player : thesePlayers){
            System.out.println("Player " + player.position + ": " + player.name);
            System.out.println(player.name + "'s pieces left: " + player.dominoSet.size());
        }

        ArrayList<Domino> alejoSet = first.dominoSet;

        for (Domino domino : alejoSet){
            System.out.println(domino.top + " | " + domino.bottom);
        }

    }

}
