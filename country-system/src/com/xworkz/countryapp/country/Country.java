package com.xworkz.countryapp.country;

public class Country {
   private int id;

   public int getId(){
       return id;
   }

    public void setId(int id) {
        this.id = id;
    }

    private String countryname;

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    private int noOfCountry;
    public int getNoOfCountry(){
        return noOfCountry;
    }
    public void setNoOfCountry(int noOfCountry){
        this.noOfCountry=noOfCountry;
    }


    public void getCountryInfo(){
        System.out.println("fetching country info ----");
        System.out.println("the id of the country is :"+id);
        System.out.println("the name of the country : "+countryname);
        System.out.println("the noOfCountry in the world :"+noOfCountry);
    }
}
