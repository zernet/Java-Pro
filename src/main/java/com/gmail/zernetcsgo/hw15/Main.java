package com.gmail.zernetcsgo.hw15;

public class Main {
    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.getAll());
        uiOperator.getOutput(handler.getById(172));
    }
}
