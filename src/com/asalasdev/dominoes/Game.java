package com.asalasdev.dominoes;

public class Game {

    public DominoSet createSet(String variant){
        DominoSet newSet = null;
        if (variant.equals("Venezuelan")){
            newSet = new DominoSetVenezuelan();
        } else if (variant.equals("Cuban")){
            newSet = new DominoSetCuban();
        } else {
            System.out.println("The variant " + variant + " is not supported.");
        }
        return newSet;
    }

}
