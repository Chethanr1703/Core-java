package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.projectvalidator.ProjectValidator;

public class Company {
    Project projects[]= new Project[20];
    int index;

    public boolean isProjectAdded(Project project1){
        boolean isProjectAdded= false;

        ProjectValidator projectValidator=new ProjectValidator();
        boolean isProjectInfoValid=projectValidator.isProjectValidated(project1);
        if(isProjectInfoValid==true){
//            this.project1=project1;
            projects[index]= project1;
            index++;
            isProjectAdded=true;
        }else{
            System.out.println("the details of the project is not valid");
        }
        return isProjectAdded;
    }
    public void getProjectDetails(){
        for(Project project :projects) {
            System.out.println("the id of the project is  " + project.getProjectId());
            System.out.println("the company name of the project is  " + project.getCompanyName());
            System.out.println("the name of the project is  " + project.getProjectName());
            System.out.println("the no of members of the project is  " + project.getNoOfMembers());
            System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
            System.out.println("");
        }
    }
}
