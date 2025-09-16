package com.xworkz.lockapp.lock.impl;

import com.xworkz.lockapp.lock.Lock;

public class LockImpl implements Lock {
    @Override
    public void unlock() {
        System.out.println("Lock unlocked");
    }

    @Override
    public void lock() {
        System.out.println("Lock locked");
    }
}
