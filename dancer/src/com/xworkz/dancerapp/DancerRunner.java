package com.xworkz.dancerapp;

import com.xworkz.dancerapp.dancer.Dancer;
import com.xworkz.dancerapp.impl.DancerImpl;

public class DancerRunner {

    public static void main(String[] args) {
        Dancer dancer = new DancerImpl();
        dancer.practiceDance();
        dancer.performDance();
        dancer.receiveFeedback();
    }
}
