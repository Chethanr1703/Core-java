package com.xworkz.soapapp;

import com.xworkz.soapapp.soap.Soap;
import com.xworkz.soapapp.soap.impl.DoveSoapImpl;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new DoveSoapImpl();
        soap.toWash();
        soap.toClean();
    }
}
