package com.gmail.zernetcsgo.hw14;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));
    }
}