package com.xworkz.stadiumapp.events.impl;

import com.xworkz.stadiumapp.events.EventVenue;

public class Chepak implements EventVenue {
    @Override
    public void scheduleEvent() {
        System.out.println("scheduleEvent");
    }

    @Override
    public void manageTickets() {
        System.out.println("manageTickets");

    }

    @Override
    public void ensureSafety() {
        System.out.println("ensureSafety");

    }
}
