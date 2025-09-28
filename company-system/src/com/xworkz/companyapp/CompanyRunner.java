package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.company.impl.CompanyImpl;
import com.xworkz.companyapp.constants.ProjectType;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the projects");
        int size = scanner.nextInt();
        Company company = new CompanyImpl(size);

        for (int index = 0; index < size; index++) {
            Project project1 = new Project();

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
//        company.getProjectDetails();

        String input = null;
        do {
            System.out.println("press #1 to fetch project Info by id");
            System.out.println("press #2 to fetch company name  by  id");
            System.out.println("press #3  to fetch project type by project id");
            System.out.println("press #4 to fetch no of team member by project id");
            System.out.println("press #5 to fetch no of developer by project id");
            System.out.println("press #6 to fetch no of developer by project name");
            System.out.println("press #7 to fetch no of team member by project name");
            System.out.println("press #8 to fetch project name by project id");
            System.out.println("press #9 to fetch project type by project name");
            System.out.println("press #10 to update project id by project name");
            System.out.println("press #11 to update project type by project name");
            System.out.println("press #12 to update no of team member by project id");
            System.out.println("press #13 to update no of developer  by project name");
            System.out.println("press #14 to fetch all the project");
            System.out.println(" ");

            System.out.println("enter the option which do you require");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the projectId to get project");
                    Project project = company.getProductById(scanner.nextInt());
                    company.getProjectDetails(project);
                    break;
                case 2:
                    System.out.println("enter the projectId to get Companyname");
                    String companyName = company.getCompanyNameBYID(scanner.nextInt());
                    System.out.println(companyName);
                    break;
                case 3:
                    System.out.println("enter the projectId to get projectType");
                    ProjectType projectType = company.getProjectTypeByProjectId(scanner.nextInt());
                    System.out.println(projectType);
                    break;
                case 4:
                    System.out.println("enter the projectId to get no Of team member");
                    int gettemmember = company.getNoofTeamMemberByProjectId(scanner.nextInt());
                    System.out.println(gettemmember);
                    break;
                case 5:
                    System.out.println("enter the projectId to get no of developer");
                    int getDeveloper = company.getNoofdeveloperbyProjectId(scanner.nextInt());
                    System.out.println(getDeveloper);
                    break;
                case 6:
                    System.out.println("enter the projectname to get no of developer");
                    getDeveloper = company.getNoofdeveloperbyProjectName(scanner.next());
                    System.out.println(getDeveloper);
                    break;
                case 7:
                    System.out.println("enter the projectname to get no of developer");
                    gettemmember = company.getNoofTeamMemberByProjectname(scanner.next());
                    System.out.println(gettemmember);
                    break;
                case 8:
                    System.out.println("enter the projectid to get project name");
                    String projectName = company.getprojectNameById(scanner.nextInt());
                    System.out.println(projectName);
                    break;
                case 9:
                    System.out.println("enter the projectname to get ProjectType");
                    ProjectType projectType1 = company.getProjectTypeByProjectName(scanner.next());
                    System.out.println(projectType1);
                    break;

                case 10:
                    System.out.println("enter the project name");
                    String projectname = scanner.next();
                    System.out.println("enter the new projectId ");
                    int projectId = scanner.nextInt();
                    boolean updateProjectIdByProjectname = company.updateProjectIdByProjectname(projectname, projectId);
                    System.out.println(updateProjectIdByProjectname);
                    if (updateProjectIdByProjectname) {
                        company.getProjectDetails();
                    }break;

                case 11:
                    System.out.println("enter the project name");
                    projectname = scanner.next();
                    System.out.println("enter the new type of the project");
                    projectType = ProjectType.valueOf(scanner.next().toUpperCase());
                    boolean isupdateprojectType = company.updateProjectTypeByProjectname(projectname, projectType);
                    System.out.println(isupdateprojectType);
                    if (isupdateprojectType) {
                        company.getProjectDetails();

                    }
                    break;

                case 12:
                    System.out.println("enter the project Id");
                    projectId = scanner.nextInt();
                    System.out.println("enter the updated team member");
                    int noOfTeamMember = scanner.nextInt();
                    boolean isTeamMemberUpdated = company.updateNoofTeamMemberByProjectId(projectId, noOfTeamMember);
                    if (isTeamMemberUpdated) {
                        company.getProjectDetails();
                    }
                    break;
                case 13:
                    System.out.println("enter the project name");
                    projectname = scanner.next();
                    System.out.println("enter the updated team member");
                    int noOfDeveloper = scanner.nextInt();
                    boolean isDeveloperUpdated = company.updateNoofDeveloperByProjectName(projectname, noOfDeveloper);
                    if (isDeveloperUpdated) {
                        company.getProjectDetails();
                    }
                    break;
                case 14:
                    company.getProjectDetails();
                    break;
                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes")) ;

            System.out.println("thank you for visting this app ........");


            scanner.close();


    }
}