package com.xworkz.lockapp;

import com.xworkz.lockapp.lock.Lock;
import com.xworkz.lockapp.lock.impl.LockImpl;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new LockImpl();
        lock.unlock();
        lock.lock();
    }
}
