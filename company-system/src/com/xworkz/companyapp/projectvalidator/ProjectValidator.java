package com.xworkz.companyapp.projectvalidator;

import com.xworkz.companyapp.project.Project;

public class ProjectValidator {
    public boolean isProjectValidated(Project project){
        boolean isProjectInfovalid=false;

        boolean isIdValid=false;
        boolean isCompanyNameValid=false;
        boolean isProjectnameValid=false;
        boolean isNoOfMembersValid=false;
        boolean isNoOfDevelopersValid=false;

        if(project.getProjectId()>0){
            isIdValid=true;
        }else {
            System.out.println("the id of the project is not valid ");
        }
        if(project.getCompanyName()!=null &&!project.getCompanyName().isEmpty()){
            isCompanyNameValid=true;
        }else {
            System.out.println("the company name of the project is not valid ");
        }
        if(project.getProjectName()!=null && !project.getProjectName().isEmpty()){
            isProjectnameValid=true;
        }else {
            System.out.println("the name of the project is not valid ");
        }
        if(project.getNoOfMembers()>0){
            isNoOfMembersValid=true;
        }else {
            System.out.println("the no of members of the project is not valid ");
        }
        if(project.getNoOfDeveloper()>0){
            isNoOfDevelopersValid=true;
        }else {
            System.out.println("the no of developer of the project is not valid ");
        }

        if(isIdValid&&isCompanyNameValid&&isProjectnameValid&&isNoOfMembersValid&&isNoOfDevelopersValid){
            isProjectInfovalid=true;
        }else{
            System.out.println("the info the project is not valid");
        }
        return isProjectInfovalid;
    }
}
