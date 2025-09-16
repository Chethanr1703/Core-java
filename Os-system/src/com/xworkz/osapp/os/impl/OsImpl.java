package com.xworkz.osapp.os.impl;

import com.xworkz.osapp.os.Os;

public class OsImpl implements Os {
    @Override
    public void bootUp() {
        System.out.println("Operating System booting up...");
    }

    @Override
    public void shutDown() {
        System.out.println("Operating System shutting down...");
    }
}
