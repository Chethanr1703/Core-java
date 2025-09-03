package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company=new Company();

        Project project1= new Project();

        project1.setProjectId(1);
        project1.setCompanyName("IBM");
        project1.setProjectName("Biling");
        project1.setNoOfMembers(20);
        project1.setNoOfDeveloper(10);


        Project project2  = new Project(101,"Xworkz","Company App",15,10);
        Project project3  = new Project(102,"Innova","E-Commerce Platform",20,12);
        Project project4  = new Project(103,"CodeHub","Learning Portal",10,6);
        Project project5  = new Project(104,"MediCare","Health Tracker",18,9);
        Project project6  = new Project(105,"AgriTech","Farmer Support App",14,7);
        Project project7  = new Project(106,"FinEdge","Banking System",22,15);
        Project project8  = new Project(107,"EduSmart","School Management",16,8);
        Project project9  = new Project(108,"Foodies","Food Delivery App",19,10);
        Project project10 = new Project(109,"TravelGo","Travel Booking App",17,11);
        Project project11 = new Project(110,"AutoRide","Cab Service App",20,14);
        Project project12 = new Project(111,"GreenWorld","Eco Awareness",12,6);
        Project project13 = new Project(112,"BuildTech","Construction ERP",15,8);
        Project project14 = new Project(113,"RetailX","Retail POS",21,12);
        Project project15 = new Project(114,"SmartPay","Payment Gateway",18,9);
        Project project16 = new Project(115,"CityCare","Municipal Services",13,7);
        Project project17 = new Project(116,"FarmFresh","Grocery Delivery",16,8);
        Project project18 = new Project(117,"EventPro","Event Manager",14,6);
        Project project19 = new Project(118,"News360","News Aggregator",17,9);
        Project project20 = new Project(119,"Sportify","Sports Tracker",20,12);

        boolean isProjectAddedToCompany=company.isProjectAdded(project1);


         isProjectAddedToCompany=company.isProjectAdded(project2);
        isProjectAddedToCompany=company.isProjectAdded(project3);
        isProjectAddedToCompany=company.isProjectAdded(project4);
        isProjectAddedToCompany=company.isProjectAdded(project5);
        isProjectAddedToCompany=company.isProjectAdded(project6);
        isProjectAddedToCompany=company.isProjectAdded(project7);
        isProjectAddedToCompany=company.isProjectAdded(project8);
        isProjectAddedToCompany=company.isProjectAdded(project9);
        isProjectAddedToCompany=company.isProjectAdded(project10);
        isProjectAddedToCompany=company.isProjectAdded(project11);
        isProjectAddedToCompany=company.isProjectAdded(project12);
        isProjectAddedToCompany=company.isProjectAdded(project13);
        isProjectAddedToCompany=company.isProjectAdded(project14);
        isProjectAddedToCompany=company.isProjectAdded(project15);
        isProjectAddedToCompany=company.isProjectAdded(project16);
        isProjectAddedToCompany=company.isProjectAdded(project17);
        isProjectAddedToCompany=company.isProjectAdded(project18);
        isProjectAddedToCompany=company.isProjectAdded(project19);
        isProjectAddedToCompany=company.isProjectAdded(project20);





        company.getProjectDetails();

//       boolean isProjectAddedToCompany= company.isProjectAdded(project1);
//       if(isProjectAddedToCompany){
//           company.getProjectDetails();
//       }else{
//           System.out.println("the info of the project not valid");
//       }
    }
}
