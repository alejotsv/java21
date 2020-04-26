package com.java21;

public class Weather {
    public static void main(String[] args){
        float fahrenheit = 86;
        showCelsius(fahrenheit);

    }


    static float convertToCelsius(float fahrenheit){
        float celsius;
        celsius = ((fahrenheit - 32)/9)*5;
        return celsius;
    }

    static void showCelsius(float fahrenheit){
        float celsius = convertToCelsius(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }





}
