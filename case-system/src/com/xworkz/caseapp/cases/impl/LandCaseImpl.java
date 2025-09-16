package com.xworkz.caseapp.cases.impl;

import com.xworkz.caseapp.cases.Cases;

public class LandCaseImpl implements Cases {
    @Override
    public void fileCase() {
        System.out.println("filing the case");
    }

    @Override
    public void reviewCase() {
        System.out.println(" reviewing the case");
    }

    @Override
    public void closeCase() {
        System.out.println("closeing case");
    }
}
