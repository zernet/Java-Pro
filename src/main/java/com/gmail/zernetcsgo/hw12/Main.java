package com.gmail.zernetcsgo.hw12;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        DataHandler dataHandler = new DataHandler();
        MyThread myThread1 = new MyThread("Thread 1", dataHandler);
        MyThread myThread2 = new MyThread("Thread 2", dataHandler);

        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
    }
}

