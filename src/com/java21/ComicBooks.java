package com.java21;

import java.util.HashMap;

public class ComicBooks {

    public static void main(String[] args){
        System.out.println("This is my Comics class: ");
    }

    public class Comic {
        HashMap<String, Float> condition = new HashMap<String, Float>();
        String title;
        String issue;
        float basePrice;
        float price;

        public void setInitialCondition(){
            String[] conditions = { "mint", "near mint", "very fine", "fine", "good", "poor" };
            for ( String condition : conditions ){
                this.condition.put(condition, 1F);
            }
        }

    }



}
