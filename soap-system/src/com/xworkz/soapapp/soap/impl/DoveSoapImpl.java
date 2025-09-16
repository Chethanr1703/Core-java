package com.xworkz.soapapp.soap.impl;

import com.xworkz.soapapp.soap.Soap;

public class DoveSoapImpl implements Soap {
    @Override
    public void toClean() {
        System.out.println("to clean ");
    }

    @Override
    public void toWash() {
        System.out.println(" to wash ");
    }
}
