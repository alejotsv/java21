package com.java21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ComicBooks {
    HashMap<String, Float> condition = new HashMap<String, Float>();
    ArrayList<Comic> myComics = new ArrayList<Comic>();

    public ComicBooks() {
        setInitialCondition(this.condition);
    }

    public static void main(String[] args){
        System.out.println("This is my Comics class: ");
        Float[] priceChange = { 3F, 2F, 1.5F, 1F, 0.5F, 0.25F };
        ComicBooks comix = new ComicBooks();
        comix.setCondition(priceChange);

        Comic spiderMan = new Comic("Amazing Spider-Man", "1A", 12000F, "very fine");
        spiderMan.setPrice(comix.setFinalPrice(spiderMan.condition, spiderMan.basePrice));
        comix.myComics.add(spiderMan);

        Comic hulk = new Comic("Incredible Hulk", "181", 680F, "near mint");
        hulk.setPrice(comix.setFinalPrice(hulk.condition, hulk.basePrice));
        comix.myComics.add(hulk);

        Comic cerebus = new Comic("Cerebus", "1A", 190F, "good");
        cerebus.setPrice(comix.setFinalPrice(cerebus.condition, cerebus.basePrice));
        comix.myComics.add(cerebus);

        comix.printComics();
       

    }

    void setInitialCondition(HashMap<String, Float> finalCondition) {
        String[] conditions = {"mint", "near mint", "very fine", "fine", "good", "poor"};
        for (String condition : conditions) {
            finalCondition.put(condition, 1F);
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

    public float setFinalPrice(String conditionIn, float basePriceIn){
        float finalPrice = (Float)this.condition.get(conditionIn) * basePriceIn;
        return finalPrice;
    }

    public void printComics(){
        for ( Comic comic : this.myComics ){
            System.out.println("Title: " + comic.getTitle());
            System.out.println("Issue: " + comic.getIssue());
            System.out.println("Condition: " + comic.getCondition());
            System.out.println("Price: $" + comic.getPrice());
            System.out.println("-----------------------------------");
        }
    }

    static class Comic {
        String title;
        String issue;
        String condition;
        float basePrice;
        float price;

        Comic(String titleIn, String issueIn, float basePriceIn, String conditionIn){
            this.setTitle(titleIn);
            this.setIssue(issueIn);
            this.setBasePrice(basePriceIn);
            this.setCondition(conditionIn);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public float getBasePrice() {
            return basePrice;
        }

        public void setBasePrice(float basePrice) {
            this.basePrice = basePrice;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }
    }

}
