package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company2= new Company();
        company2.setcId(10);
        int id =company2.getcId();
        company2.setCompanyName("IBM");
        String name=company2.getCompanyName();
        company2.setNoOffloor(15);
        int noOffloor=company2.getNoOffloor();
        System.out.println("fetching company info ----");
        System.out.println("the id of the company is :"+id);
        System.out.println("the name of the company : "+name);
        System.out.println("the noOffloor in the company :"+noOffloor);


    }
}
