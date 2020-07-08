package com.java21;

import java.util.*;

public class StackExample {
    public static void main(String[] args){
        Stack stack = new Stack();
        String[] numbers = { "Zero", "One", "Two", "Three", "Four" };
        for (String num : numbers){
            stack.push(num);
            System.out.println("Adding: " + num);
        }

        System.out.println("--------------------");

        showStack(stack);

        popped(stack);
        popped(stack);
        popped(stack);
        popped(stack);
        popped(stack);
    }

    static void showStack(Stack stack){
        for(Object element : stack){
            System.out.println(element);
        }
    }

    static void popped(Stack stack){
        Object ob = stack.pop();
        System.out.println("--------------------");
        System.out.println("This is what I just popped: " + ob);
        System.out.println("--------------------");
        showStack(stack);
        if (stack.empty()){
            System.out.println("This is empty");
        } else {
            System.out.println("Go on");
        }
    }
}
