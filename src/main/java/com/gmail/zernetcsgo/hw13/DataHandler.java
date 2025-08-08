package com.gmail.zernetcsgo.hw13;

public class DataHandler {

    private final Locker lock = new Locker();

    public int modify(int num) {
        lock.lock();
        try {
            return num * 3;
        } finally {
            lock.unlock();
        }
    }
}
