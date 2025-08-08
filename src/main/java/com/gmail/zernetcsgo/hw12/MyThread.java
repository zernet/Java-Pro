package com.gmail.zernetcsgo.hw12;

class MyThread extends Thread {

    private final DataHandler dataHandler;

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }

    @Override
    public void run() {
        dataHandler.getOutput();
    }
}