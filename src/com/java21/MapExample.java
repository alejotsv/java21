package com.java21;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args){
        System.out.println("Hello there");
        String[] defenders = { "Carvajal", "Varane", "Sergio Ramos", "Mendy"};
        String[] midfielders = { "Casemiro", "Valverde", "Kroos" };
        String[] forwards = { "Benzema", "Hazard", "Jovic" };

        HashMap lineUp = new HashMap();

        lineUp.put("defense", defenders);
        lineUp.put("midfield", midfielders);
        lineUp.put("forward", forwards);

        String[] lineD = (String[])lineUp.get("defense");

        for(String defender : lineD){
            System.out.println(defender);
        }


    }
}
