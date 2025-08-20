package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        Project project1= new Project();
        project1.setProjectId(1);
        project1.setCompanyName("IBM");
        project1.setProjectName("Biling");
        project1.setNoOfMembers(20);
        project1.setNoOfDeveloper(10);

        Company company=new Company();
       boolean isProjectAddedToCompany= company.isProjectAdded(project1);
       if(isProjectAddedToCompany){
           company.getProjectDetails();
       }else{
           System.out.println("the info of the project not valid");
       }
    }
}
