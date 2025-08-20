package com.xworkz.techparkapp;

import com.xworkz.techparkapp.techpark.TechPark;

public class TechParkRunner {

        public static void main(String[] args) {
            TechPark techpark1 =new TechPark();

            techpark1.setTechParkId(1);
          int id=  techpark1.getTechParkId();
            techpark1.setName("manyatha");
        String name  =  techpark1.getName();
            techpark1.setLocation("near Hebbala");
         String location=   techpark1.getLocation();


                System.out.println("fetching TechPark info ----");
                System.out.println("the id of the TechPark is :" +id);
                System.out.println("the name of the TechPark : "+name);
                System.out.println("the location in the TechPark :"+location);



        }

    }


