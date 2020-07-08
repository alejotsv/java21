package com.java21;

public class Divider {
    public static void main(String[] args){
        showResult(40, 20);
    }

    static int divideNum(int x, int y){
        return x/y;
    }

    static int remainder(int x, int y){
        return x%y;
    }

    static void showResult(int x, int y){
        int result = divideNum(x,y);
        int remainder = remainder(x,y);
        System.out.println("Result: " + result + "\tRemainder: " + remainder);
    }

}
