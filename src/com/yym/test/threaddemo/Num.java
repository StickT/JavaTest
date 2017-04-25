package com.yym.test.threaddemo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by StickT on 2017/4/20.
 */
public class Num {

    private ReentrantLock lock = new ReentrantLock();

    private int count;

    public Num() {
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
