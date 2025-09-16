package com.xworkz.osapp;

import com.xworkz.osapp.os.Os;
import com.xworkz.osapp.os.impl.OsImpl;

public class OsRunner {
    public static void main(String[] args) {
        Os os = new OsImpl();
        os.bootUp();
        os.shutDown();
    }
}
