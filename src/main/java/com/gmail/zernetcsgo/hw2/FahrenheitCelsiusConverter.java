package com.gmail.zernetcsgo.hw2;

public final class FahrenheitCelsiusConverter {

    private FahrenheitCelsiusConverter() {}

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}
