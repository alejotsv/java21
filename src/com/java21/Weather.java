package com.java21;

public class Weather {
    public static void main(String[] args){
        float fahrenheit = 86;
        showCelsius(fahrenheit);

        float celsius = 33;
        showFahrenheit(celsius);

        showFahrenheit(12);
        showCelsius(84);

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

    static float convertToFahrenheit(float celsius){
        float fahrenheit;
        fahrenheit = (celsius*9/5) + 32;
        return fahrenheit;
    }

    static void showFahrenheit(float celsius){
        float fahrenheit = convertToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }



}
