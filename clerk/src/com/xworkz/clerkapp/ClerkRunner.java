package com.xworkz.clerkapp;

import com.xworkz.clerkapp.clerk.Clerk;
import com.xworkz.clerkapp.impl.ClerkImpl;

public class ClerkRunner {

    public static void main(String[] args) {
        Clerk clerk = new ClerkImpl();
        clerk.maintainRecords();
        clerk.updateRecords();
        clerk.retrieveRecords();
    }
}
