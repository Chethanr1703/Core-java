package com.xworkz.catagoryapp.catagory;

public class Catagory {
    private   int catagoryId;

    public int getCatagoryId(){
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    private   String cName;

    public String getcName(){
        return cName;
    }

    public void setcName(String cName){
        this.cName=cName;
    }
    private   int noOfproduct;

    public int getNoOfproduct(){
        return noOfproduct;
    }

    public void setNoOfproduct(int noOfproduct) {
        this.noOfproduct = noOfproduct;
    }

//    public void getCatagoryInfo(){
//        System.out.println("fetching Catagory info ----");
//        System.out.println("the id of the Catagory is :"+catagoryId);
//        System.out.println("the name of the Catagory : "+cName);
//        System.out.println("the noOfproduct in the Catagory :"+noOfproduct);
//    }
}
