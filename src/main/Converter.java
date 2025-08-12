package main;

public class Converter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void runChallenge() {
        double celsius = 25.0;
        System.out.println(celsius + " degrees C is " + celsiusToFahrenheit(celsius) + " degrees F.");
        
        double fahrenheit = 77.0;
        System.out.println(fahrenheit + " degrees F is " + fahrenheitToCelsius(fahrenheit) + " degrees C.");
    }
}