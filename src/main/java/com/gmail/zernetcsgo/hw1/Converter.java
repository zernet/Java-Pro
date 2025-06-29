package com.gmail.zernetcsgo.hw1;

public class Converter {
    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Version 1.0.");
        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        System.out.println("Result is " + pounds + " pounds.");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}
