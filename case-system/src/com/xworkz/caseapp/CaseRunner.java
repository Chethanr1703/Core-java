package com.xworkz.caseapp;

import com.xworkz.caseapp.cases.Cases;
import com.xworkz.caseapp.cases.impl.LandCaseImpl;

public class CaseRunner {
    public static void main(String[] args) {


        Cases cases = new LandCaseImpl();
        cases.fileCase();
        cases.reviewCase();
        cases.closeCase();
    }
}
