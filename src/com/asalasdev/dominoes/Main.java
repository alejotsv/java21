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

        newGame.distributeDominoes(thesePlayers, shuffled);

        for (Player player : thesePlayers){
            System.out.println("Player " + player.position + ": " + player.name);
            ArrayList<Domino> tempSet = player.dominoSet;
            for(Domino piece : tempSet){
                System.out.println(piece.top + " | " + piece.bottom);
            }
            System.out.println("-----------------------");
        }

        Player player1 = thesePlayers.get(0);
        System.out.println(player1.name);

        Domino playedDomino = player1.playDomino(0);
        System.out.println("Domino played: " + playedDomino.top + " | " + playedDomino.bottom);

        for (Player player : thesePlayers){
            System.out.println("Player " + player.position + ": " + player.name);
            ArrayList<Domino> tempSet = player.dominoSet;
            for(Domino piece : tempSet){
                System.out.println(piece.top + " | " + piece.bottom);
            }
            System.out.println("-----------------------");
        }



    }

}
