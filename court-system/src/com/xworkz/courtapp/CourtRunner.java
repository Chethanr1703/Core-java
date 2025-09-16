package com.xworkz.courtapp;

import com.xworkz.courtapp.court.Court;
import com.xworkz.courtapp.court.impl.SupremeCourtImpl;

public class CourtRunner {
    public static void main(String[] args) {
        Court court = new SupremeCourtImpl();
        court.hearCase();
        court.giveJudgment();
        court.maintainOrder();
    }
}
