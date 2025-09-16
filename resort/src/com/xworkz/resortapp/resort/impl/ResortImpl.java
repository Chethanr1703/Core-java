package com.xworkz.resortapp.resort.impl;

import com.xworkz.resortapp.resort.Resort;

public class ResortImpl implements Resort {

    @Override
    public void checkIn() { System.out.println("Resort check-in completed"); }
    @Override
    public void checkOut() { System.out.println("Resort check-out completed"); }
    @Override
    public void facilities() { System.out.println("Enjoying resort facilities"); }

}
