package com.asalasdev.dominoes;

public class Main {

    public static void main(String[] args){
        String variant = "Venezuelan";
        String[] players = {"Alejandro", "Juan", "Arcadio", "Oscar"};
        System.out.println("Creating a new game");

        Game newGame = new Game(players, variant);


    }

}
