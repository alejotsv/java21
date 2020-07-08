package org.cadenhead.ecommerce;

public class Item implements Comparable {
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount = false;

    Item(String idIn, String nameIn, String retailIn, String qIn) {
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);

        if (quantity > 1000) {
            price = retail * .5D;
        } else if (quantity > 500) {
            price = retail * .6D;
        } else if (quantity > 200){
            price = retail * .7D;
        } else {
            price = retail;
            noDiscount = true;
        }

        price = Math.floor((price*100) + .5) / 100;
    }

    public int compareTo(Object obj) {
        Item temp = (Item) obj;
        if (this.quantity < temp.quantity) {
            return 1;
        } else if (this.quantity > temp.quantity){
            return -1;
        }
        return 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean getNoDiscount() {
        return noDiscount;
    }
}
