package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.ProjectType;
import com.xworkz.companyapp.project.Project;

public interface Company {
    boolean isProjectAdded(Project project1);

    void getProjectDetails();

    void getProjectDetails(Project project);

    Project getProductById(int id);

    String getCompanyNameBYID(int projectId);

    String getprojectNameById(int id);

    ProjectType getProjectTypeByProjectName(String projectName);


    int getNoofdeveloperbyProjectName(String projectName);

    int getNoofTeamMemberByProjectname(String projectName);

    int getNoofdeveloperbyProjectId(int id);

    int getNoofTeamMemberByProjectId(int id);

    ProjectType getProjectTypeByProjectId(int id);

    boolean updateProjectTypeByProjectname(String projectName ,ProjectType projectType);

    boolean updateProjectIdByProjectname(String projectName, int id);

    boolean updateNoofTeamMemberByProjectId(int projectId, int noOfteamMemeber);

    boolean updateNoofDeveloperByProjectName(String projectName, int newNoofDeveloper);
}