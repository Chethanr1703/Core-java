package com.xworkz.counselorapp.counselor.impl;

import com.xworkz.counselorapp.counselor.Counselor;

public class CounselorImpl implements Counselor {

    @Override
    public void listen() { System.out.println(" listening"); }
    @Override
    public void advise() { System.out.println(" giving advice"); }
    @Override
    public void support() { System.out.println(" support"); }
}

