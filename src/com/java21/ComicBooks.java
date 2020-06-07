package com.java21;

import java.util.HashMap;
import java.util.Iterator;

public class ComicBooks {
    HashMap<String, Float> condition = new HashMap<String, Float>();

    public ComicBooks() {
        setInitialCondition();
    }

    public static void main(String[] args){
        System.out.println("This is my Comics class: ");
    }

    public void setInitialCondition() {
        String[] conditions = {"mint", "near mint", "very fine", "fine", "good", "poor"};
        for (String condition : conditions) {
            this.condition.put(condition, 1F);
        }
    }

    public void setCondition(Float[] priceChange){
        this.condition.replace("mint", priceChange[0]);
        this.condition.replace("near mint", priceChange[1]);
        this.condition.replace("very fine", priceChange[2]);
        this.condition.replace("fine", priceChange[3]);
        this.condition.replace("good", priceChange[4]);
        this.condition.replace("poor", priceChange[5]);
    }

    class Comic {
        String title;
        String issue;
        float basePrice;
        float price;

        Comic(){

        }


    }

}
