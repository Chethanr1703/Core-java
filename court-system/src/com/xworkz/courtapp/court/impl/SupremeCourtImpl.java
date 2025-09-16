package com.xworkz.courtapp.court.impl;

import com.xworkz.courtapp.court.Court;

public class SupremeCourtImpl implements Court {
    @Override
    public void hearCase() {
        System.out.println("case hearing");
    }

    @Override
    public void giveJudgment() {
        System.out.println("giving judgement");
    }

    @Override
    public void maintainOrder() {
        System.out.println("maintain the order");
    }
}
