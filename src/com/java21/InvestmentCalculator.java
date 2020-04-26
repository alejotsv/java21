package com.java21;

public class InvestmentCalculator {
    public static void main(String[] args){
        float investment = 14000;
        float firstYear = investmentValue(investment, '+','%', 40);
        System.out.println("-----------");
        float secondYear = investmentValue(firstYear, '-', '$', 1500);
        System.out.println("-----------");
        float thirdYear = investmentValue(secondYear, '+', '%', 12);
    }

    static float investmentValue(float inv, char sign, char type, float change){
        System.out.println("Initial investment: $" + inv);

        float finalInv = inv;
        if (type == '%'){
            change = inv*(change/100);
            System.out.println();
        }
        if (sign == '+'){
            finalInv += change;
            System.out.println("Gain: $" + change);
        } else {
            finalInv -= change;
            System.out.println("Loss: $" + change);
        }

        System.out.println("Current worth: $" + finalInv);
        return finalInv;
    }


}
