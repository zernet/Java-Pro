package com.gmail.zernetcsgo.hw7;

public class Main {

    public static void main(String[] args) {
        Corrector corrector = new Corrector();
        DataProvider dataProvider = new DataProvider();
        getOutput(corrector.handleData(dataProvider.getData()));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
