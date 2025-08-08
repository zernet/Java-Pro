package com.gmail.zernetcsgo.hw13;

import java.util.concurrent.locks.ReentrantLock;

public class Locker {
    private final ReentrantLock lock = new ReentrantLock();

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }
}
