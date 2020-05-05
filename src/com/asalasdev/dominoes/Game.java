package com.asalasdev.dominoes;

public class Game {

    public static void main(String[] args){
        String variant;
        System.out.println("Creating a new game");
        variant = "Venezuelan";
        if (variant.equals("Venezuelan")){
            DominoSetVenezuelan newGame = new DominoSetVenezuelan();
        } else if (variant.equals("Cuban")){
            DominoSetCuban newGame = new DominoSetCuban();
        } else {
            System.out.println("The variant " + args[0] + " is not supported.");
        }

    }

}
