package com.xworkz.resortapp;

import com.xworkz.resortapp.resort.impl.ResortImpl;
import com.xworkz.resortapp.resort.Resort;

public class ResortRunner {
    public static void main(String[] args) {


        Resort resort = new ResortImpl();

        resort.facilities();
        resort.checkIn();
        resort.checkOut();

    }
}
