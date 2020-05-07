package com.asalasdev.dominoes;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Domino> dominoSet;

    public Player(String player){
        this.name = player;
        this.dominoSet = new ArrayList<>();
    }
}
