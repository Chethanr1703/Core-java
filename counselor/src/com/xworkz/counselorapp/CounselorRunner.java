package com.xworkz.counselorapp;

import com.xworkz.counselorapp.counselor.Counselor;
import com.xworkz.counselorapp.counselor.impl.CounselorImpl;

public class CounselorRunner {

    public static void main(String[] args) {
        Counselor counselor = new CounselorImpl();
        counselor.listen();
        counselor.advise();
        counselor.support();
    }
}
