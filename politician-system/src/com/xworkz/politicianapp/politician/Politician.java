package com.xworkz.politicianapp.politician;

public class Politician {
    private int politicianId;

    public int getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(int politicianId) {
        this.politicianId = politicianId;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int noOfvotes;

    public int getNoOfvotes() {
        return noOfvotes;
    }

    public void setNoOfvotes(int noOfvotes) {
        this.noOfvotes = noOfvotes;
    }

    public void getPoliticianInfo(){
        System.out.println("fetching Politician info ----");
        System.out.println("the id of the Politician is :"+politicianId);
        System.out.println("the name of the Politician : "+name);
        System.out.println("the noOfvotes in the Politician :"+noOfvotes);
    }
}
