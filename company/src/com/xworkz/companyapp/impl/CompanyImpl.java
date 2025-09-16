package com.xworkz.companyapp.impl;

import com.xworkz.companyapp.company.Company;

public class CompanyImpl implements Company {
    @Override
    public void addStaff() {
        System.out.println("Adding  staff ");
    }

    @Override
    public void doProject() {
        System.out.println("doing Project");
    }

    @Override
    public void removeStaff() {
        {
            System.out.println("Removing staff ");
        }
    }
}
