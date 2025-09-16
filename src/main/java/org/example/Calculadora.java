package org.example;


public class Calculadora {

    // Celsius → Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    // Fahrenheit → Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
}

