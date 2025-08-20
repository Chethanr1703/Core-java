package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.projectvalidator.ProjectValidator;

public class Company {
    Project project1;

    public boolean isProjectAdded(Project project1){
        boolean isProjectAdded= false;

        ProjectValidator projectValidator=new ProjectValidator();
        boolean isProjectInfoValid=projectValidator.isProjectValidated(project1);
        if(isProjectInfoValid==true){
            this.project1=project1;
            isProjectAdded=true;
        }else{
            System.out.println("the details of the project is not valid");
        }
        return isProjectAdded;
    }
    public void getProjectDetails(){
        System.out.println("the id of the project is  "+project1.getProjectId());
        System.out.println("the company name of the project is  "+project1.getCompanyName());
        System.out.println("the name of the project is  "+project1.getProjectName());
        System.out.println("the no of members of the project is  "+project1.getNoOfMembers());
        System.out.println("the no of developer of the project is  "+project1.getNoOfDeveloper());

    }
}
