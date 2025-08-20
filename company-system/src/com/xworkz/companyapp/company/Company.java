package com.xworkz.companyapp.company;

public class Company {
    private int cId;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private int noOffloor;
    public int getNoOffloor(){
        return noOffloor;
    }
    public void setNoOffloor(int noOffloor){
        this.noOffloor=noOffloor;
    }



//    public void getCompanyInfo(){
//        System.out.println("fetching company info ----");
//        System.out.println("the id of the company is :"+cId);
//        System.out.println("the name of the company : "+companyName);
//        System.out.println("the noOffloor in the company :"+noOffloor);
//    }
}
