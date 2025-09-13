package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.constants.ProjectType;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the projects");
        int size = scanner.nextInt();
        Company company=new Company(size);

        for(int index =0;index<size; index++){
            Project project1= new Project();

            System.out.println("enter the id of the project");
            project1.setProjectId(scanner.nextInt());

            System.out.println("enter the company name of the project");
            project1.setCompanyName(scanner.next());

            System.out.println("enter the project name ");
            project1.setProjectName(scanner.next());

            System.out.println("enter the type of project");
            project1.setProjectType(ProjectType.valueOf(scanner.next().toUpperCase()));

            System.out.println("enter the no of team member in a team");
            project1.setNoOfTeamMembers((scanner.nextInt()));

            System.out.println("enter the no of developer in a team");
            project1.setNoOfDeveloper(scanner.nextInt());

            company.isProjectAdded(project1);
        }
        company.getProjectDetails();

        System.out.println("enter the projectId to get project");
        Project project = company.getProductById(scanner.nextInt());
        company.getProjectDetails(project);

        System.out.println("enter the projectId to get Companyname");
        String companyName = company.getCompanyNameBYID(scanner.nextInt());
        System.out.println(companyName);


        System.out.println("enter the projectId to get projectType");
        ProjectType projectType =company.getProjectTypeByProjectId(scanner.nextInt());
        System.out.println(projectType);

        System.out.println("enter the projectId to get no Of team member");
         int gettemmember=company.getNoofTeamMemberByProjectId(scanner.nextInt());
        System.out.println(gettemmember);


        System.out.println("enter the projectId to get no of developer");
        int getDeveloper=company.getNoofdeveloperbyProjectId(scanner.nextInt());
        System.out.println(getDeveloper);

        System.out.println("enter the projectname to get no of developer");
        getDeveloper =company.getNoofdeveloperbyProjectName(scanner.next());
        System.out.println(getDeveloper);

        System.out.println("enter the projectname to get no of developer");
        gettemmember =company.getNoofTeamMemberByProjectname(scanner.next());
        System.out.println(gettemmember);

        System.out.println("enter the projectid to get project name");
        String projectName=company.getprojectNameById(scanner.nextInt());
        System.out.println(projectName);


        System.out.println("enter the projectname to get ProjectType");
        ProjectType projectType1=company.getProjectTypeByProjectName(scanner.next());
        System.out.println(projectType1);

        //update operation
        System.out.println("enter the project name");
        String projectname = scanner.next();
        System.out.println("enter the new projectId ");
        int projectId = scanner.nextInt();
      boolean updateProjectIdByProjectname=  company.updateProjectIdByProjectname(projectname,projectId);
        System.out.println(updateProjectIdByProjectname);
      if(updateProjectIdByProjectname){
          company.getProjectDetails();
      }

        System.out.println("enter the project name");
         projectname = scanner.next();
        System.out.println("enter the new type of the project");
         projectType= ProjectType.valueOf(scanner.next().toUpperCase());
        boolean isupdateprojectType = company.updateProjectTypeByProjectname(projectname,projectType);
        System.out.println(isupdateprojectType);
        if(isupdateprojectType){
            company.getProjectDetails();
        }


        System.out.println("enter the project Id");
        projectId = scanner.nextInt();
        System.out.println("enter the updated team member");
        int noOfTeamMember = scanner.nextInt();
        boolean isTeamMemberUpdated = company.updateNoofTeamMemberByProjectId(projectId,noOfTeamMember);
        if(isTeamMemberUpdated){
            company.getProjectDetails();
        }

        System.out.println("enter the project name");
        projectname = scanner.next();
        System.out.println("enter the updated team member");
        int noOfDeveloper = scanner.nextInt();
        boolean isDeveloperUpdated = company.updateNoofDeveloperByProjectName(projectname,noOfDeveloper);
        if(isDeveloperUpdated){
            company.getProjectDetails();
        }

    }
}
