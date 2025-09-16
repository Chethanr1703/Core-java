package com.xworkz.clerkapp.impl;

import com.xworkz.clerkapp.clerk.Clerk;

public class ClerkImpl implements Clerk {

    @Override
    public void maintainRecords() {
        System.out.println("Clerk maintaining office records");
    }
    @Override
    public void updateRecords() {
        System.out.println("Clerk updating records");
    }
    @Override
    public void retrieveRecords() {
        System.out.println("Clerk retrieving records");
    }
}

