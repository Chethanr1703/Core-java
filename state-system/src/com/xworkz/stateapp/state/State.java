package com.xworkz.stateapp.state;

public class State {
    private int stateId;

    public int getStateId(){
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }
    private String stateName;

    public String getStateName(){
        return stateName;
    }

    public void setStateName(String stateName){
        this.stateName=stateName;
    }
    private int noOfstate;
    public int getNoOfstate(){
        return noOfstate;
    }

    public void setNoOfstate(int noOfstate){
        this.noOfstate=noOfstate;
    }


    public void getStateinfo(){
        System.out.println("fetching state info-------");
        System.out.println("the id of the state :"+stateId);
        System.out.println("the name of the state is : "+stateName);
        System.out.println("the noOfstate in country is :"+noOfstate);
    }
}
