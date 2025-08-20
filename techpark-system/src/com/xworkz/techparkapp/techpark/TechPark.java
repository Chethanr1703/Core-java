package com.xworkz.techparkapp.techpark;

public class TechPark {

    private int techParkId;
    public int getTechParkId() {
        return techParkId;
    }

    public void setTechParkId(int techParkId) {
        this.techParkId = techParkId;
    }

            private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
        private String location;

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public void getTechParkInfo() {
//        System.out.println("fetching TechPark info ----");
//        System.out.println("the id of the TechPark is :" + this.techParkId);
//            System.out.println("the name of the TechPark : "+this.name);
//            System.out.println("the location in the TechPark :"+this.location);
//
//    }

}

