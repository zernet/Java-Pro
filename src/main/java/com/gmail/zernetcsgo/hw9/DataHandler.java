package com.gmail.zernetcsgo.hw9;

public class DataHandler {
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (T item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString().trim();
    }
}
