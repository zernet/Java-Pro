package com.gmail.zernetcsgo.hw12;

public class DataHandler {

    private final String[] fruits = new DataRepository().getData();

    public void getOutput() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < fruits.length; i++) {
                sb.append(String.format("(%d) %s ", i + 1, fruits[i]));
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}
