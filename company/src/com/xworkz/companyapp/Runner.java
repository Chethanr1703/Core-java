package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.impl.CompanyImpl;

public class Runner {
    public static void main(String[] args) {

        Company company = new CompanyImpl();

        company.addStaff();
        company.doProject();
        company.removeStaff();
    }
}
