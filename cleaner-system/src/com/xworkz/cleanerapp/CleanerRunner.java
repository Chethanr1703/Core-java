package com.xworkz.cleanerapp;

import com.xworkz.cleanerapp.cleaner.Cleaner;
import com.xworkz.cleanerapp.cleaner.impl.CleanerImpl;

public class CleanerRunner {
    public static void main(String[] args) {
        Cleaner cleaner = new CleanerImpl();
        cleaner.startCleaning();
        cleaner.setMode();
        cleaner.stopCleaning();
    }
}
