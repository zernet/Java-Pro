package com.gmail.zernetcsgo.hw2;

public final class FahrenheitCelsiusConverter {

    private FahrenheitCelsiusConverter() {}
    // Convert to Celsius
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Convert to Fahrenheit
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}
