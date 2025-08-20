package com.xworkz.busapp;

import com.xworkz.busapp.bus.Bus;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus1=new Bus();
        bus1.setBudId(230);
       int id= bus1.getBudId();
        bus1.setBusName("abhi bus");
        String name=bus1.getBusName();
        bus1.setDiverName("abhi");
        String dName=bus1.getDiverName();



            System.out.println("fetching bus info +++++");
            System.out.println("the id of the bus is :"+id);
            System.out.println("the name of the bus is : "+name);
            System.out.println("the diverName of the bus is : "+dName);



    }
}
