package com.xworkz.stateapp;

import com.xworkz.stateapp.state.State;

public class StateRunner {
    public static void main(String[] args) {
        State state1=new State();
        state1.setStateId(1023);
        state1.getStateId();
        state1.setStateName("karnataka");
        state1.getStateName();
        state1.setNoOfstate(30);
        state1.getNoOfstate();
state1.getStateinfo();
    }
}
