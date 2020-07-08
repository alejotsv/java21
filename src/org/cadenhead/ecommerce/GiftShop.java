package org.cadenhead.ecommerce;

public class GiftShop {
    public static void main(String[] args){
        Storefront store = new Storefront();
        store.addItem("C01", "MUG", "9.99", "150");
        store.addItem("C02", "LG MUG", "12.99", "82");
        store.addItem("C03", "MOUSE PAD", "10.49", "800");
        store.addItem("D01", "T SHIRT", "16.99", "1000");

        store.sort();

        for (int i = 0; i < store.getSize(); i++){
            Item show = (Item) store.getItem(i);
            System.out.println("\nItem ID: " + show.getId());
            System.out.println("Name: " + show.getName());
            System.out.println("Retail price: $" + show.getRetail());
            if (show.getNoDiscount()){
                System.out.println("No discount here");
            } else {
                System.out.println("Price: $" + show.getPrice());
            }
            System.out.println("Quantity: " + show.getQuantity());
        }
    }
}
