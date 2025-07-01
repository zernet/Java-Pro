package com.gmail.zernetcsgo.hw2;

import java.util.Scanner;

public class AppInfo {

    public static void main(String[] args) {
        Converter.print();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть температуру та одиницю (наприклад 100C або 212F): ");

        String input = scanner.nextLine().trim().toUpperCase();
        if (input.endsWith("C")) {
            double c = Double.parseDouble(input.substring(0, input.length() - 1));
            double f = FahrenheitCelsiusConverter.toFahrenheit(c);
            System.out.printf("%.2f °C = %.2f °F%n", c, f);
        } else if (input.endsWith("F")) {
            double f = Double.parseDouble(input.substring(0, input.length() - 1));
            double c = FahrenheitCelsiusConverter.toCelsius(f);
            System.out.printf("%.2f °F = %.2f °C%n", f, c);
        } else {
            System.err.println("Неправильний формат. Приклад: 36.6C або 98F");
        }
    }
}