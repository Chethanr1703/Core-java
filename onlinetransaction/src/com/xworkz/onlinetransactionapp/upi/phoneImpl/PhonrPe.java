package com.xworkz.onlinetransactionapp.upi.phoneImpl;

import com.xworkz.onlinetransactionapp.upi.Upi;

import java.util.SortedMap;

public class PhonrPe implements Upi {
    @Override
    public void toPayment() {
        System.out.println("do payment using PhonePe");
    }

    @Override
    public void requestMoney() {
        System.out.println("request money using PhonePe");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking the status using PhonePe");

    }
}
