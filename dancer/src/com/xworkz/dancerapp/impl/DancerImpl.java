package com.xworkz.dancerapp.impl;

import com.xworkz.dancerapp.dancer.Dancer;

public class DancerImpl implements Dancer {

    @Override
    public void practiceDance() { System.out.println(" practicing "); }
    @Override
    public void performDance() { System.out.println(" performing"); }
    @Override
    public void receiveFeedback() { System.out.println(" receiving feedback"); }

}
