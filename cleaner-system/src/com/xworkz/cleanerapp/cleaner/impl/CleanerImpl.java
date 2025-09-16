package com.xworkz.cleanerapp.cleaner.impl;

import com.xworkz.cleanerapp.cleaner.Cleaner;

public class CleanerImpl implements Cleaner {
    @Override
    public void startCleaning() {
        System.out.println("Cleaning started");
    }

    @Override
    public void stopCleaning() {
        System.out.println("Cleaning stopped");
    }

    @Override
    public void setMode() {
        System.out.println("Cleaner mode set");
    }
}
