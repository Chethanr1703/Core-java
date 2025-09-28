package com.xworkz.companyapp.company.impl;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.constants.ProjectType;
import com.xworkz.companyapp.exception.*;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.projectvalidator.ProjectValidator;

public class CompanyImpl implements Company {
    Project projects[];
    int index;

    public CompanyImpl(int size) {

        projects = new Project[size];
    }

    @Override
    public boolean isProjectAdded(Project project1) {
        boolean isProjectAdded = false;
        try {
            ProjectValidator projectValidator = new ProjectValidator();
            boolean isProjectInfoValid = projectValidator.isProjectValidated(project1);
            if (isProjectInfoValid == true) {
//            this.project1=project1;
                projects[index] = project1;
                index++;
                isProjectAdded = true;
            }
            if (isProjectInfoValid == false) {
                ProjectNotAddedException projectNotAddedException = new ProjectNotAddedException("the details of the project is not valid");
                throw projectNotAddedException;
            }
        } catch (ProjectNotAddedException e) {
            e.printStackTrace();
        }
        return isProjectAdded;
    }

    @Override
    public void getProjectDetails() {
        for (Project project : projects) {
            System.out.println("the id of the project is  " + project.getProjectId());
            System.out.println("the company name of the project is  " + project.getCompanyName());
            System.out.println("the name of the project is  " + project.getProjectName());
            System.out.println("the project type is " + project.getProjectType());
            System.out.println("the no of members of the project is  " + project.getNoOfTeamMembers());
            System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
            System.out.println("");
        }
    }

    @Override
    public void getProjectDetails(Project project) {
        try {
            if (project != null) {
                System.out.println("the id of the project is  " + project.getProjectId());
                System.out.println("the company name of the project is  " + project.getCompanyName());
                System.out.println("the name of the project is  " + project.getProjectName());
                System.out.println("the project type is " + project.getProjectType());
                System.out.println("the no of members of the project is  " + project.getNoOfTeamMembers());
                System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
                System.out.println("");
            } else {
                ProjectNotFoundException productNotFoundException = new ProjectNotFoundException("ptoduct not found");
                throw productNotFoundException;
            }
        } catch (ProjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Project getProductById(int id) {
        Project project = null;
        try {
            if (id > 0) {
                for (Project project1 : projects) {
                    if (project1.getProjectId() == id) {
                        project = project1;
                    }
                }
            }
            if (project == null) {
                ProjectNotFoundException productNotFoundException = new ProjectNotFoundException("the product not found");
                throw productNotFoundException;
            }
        } catch (ProjectNotFoundException e) {
            e.printStackTrace();
        }
        return project;
    }

    @Override
    public String getCompanyNameBYID(int projectId) {
        String companyName = null;
        try {
            if (projectId > 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        companyName = project.getCompanyName();
                    }
                }
            }
            if (companyName == null) {
                CompanyNameNotFound companyNameNotFound = new CompanyNameNotFound("project id given is not not valid to get companyName");
                throw companyNameNotFound;
            }
        } catch (CompanyNameNotFound e) {
            e.printStackTrace();
        }


        return companyName;
    }

    @Override

    public String getprojectNameById(int id) {
        String projectName = null;
        if (id > 0) {
            for (Project project : projects) {
                if (project.getProjectId() == id) {
                    projectName = project.getProjectName();
                }
            }
        }
        if (projectName == null) System.out.println("project id given is not not valid to get projectname");

        return projectName;
    }

    @Override
    public ProjectType getProjectTypeByProjectName(String projectName) {
        ProjectType projectType = null;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        projectType = project.getProjectType();
                    }
                }
            }
            if (projectName == null) {
                ProjectTypeNotFoundException projectTypeNotFoundException = new ProjectTypeNotFoundException("project name given is not not valid to get projectType");
                throw projectTypeNotFoundException;
            }
        } catch (ProjectTypeNotFoundException e) {
            e.printStackTrace();
        }

        return projectType;
    }

    @Override

    public int getNoofdeveloperbyProjectName(String projectName) {
        int noOfDeveloper = 0;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        noOfDeveloper = project.getNoOfDeveloper();
                    }
                }
            }
            if (noOfDeveloper <= 0) {
                NoOfDeveloperNotFoundException noOfDeveloperNotFoundException = new NoOfDeveloperNotFoundException("project name given is not not valid to get noOFdeveloper");
                throw noOfDeveloperNotFoundException;
            }
        } catch (NoOfDeveloperNotFoundException e) {
            e.printStackTrace();
        }
        return noOfDeveloper;
    }


    @Override
    public int getNoofTeamMemberByProjectname(String projectName) {
        int noOfteamMember = 0;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        noOfteamMember = project.getNoOfTeamMembers();
                    }
                }
            }
            if (projectName == null) {
                NoOfDeveloperNotFoundException noOfDeveloperNotFoundException = new NoOfDeveloperNotFoundException("project name given is not not valid to get noOfteamMember");
                throw noOfDeveloperNotFoundException;
            }
        } catch (NoOfDeveloperNotFoundException e) {
            e.printStackTrace();
        }
        return noOfteamMember;
    }

    @Override
    public int getNoofdeveloperbyProjectId(int id) {
        int noOfDeveloper = 0;
        try {
            if (id != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == id) {
                        noOfDeveloper = project.getNoOfDeveloper();
                    }
                }
            }
            if (id == 0) {
                NoOfDeveloperNotFoundException noOfDeveloperNotFoundException = new NoOfDeveloperNotFoundException("project id given is not not valid to get noOFdeveloper");
                throw noOfDeveloperNotFoundException;
            }
        } catch (NoOfDeveloperNotFoundException e) {
            e.printStackTrace();
        }
        return noOfDeveloper;
    }

    @Override
    public int getNoofTeamMemberByProjectId(int id) {
        int noOfteamMember = 0;
        try {
            if (id > 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == id) {
                        noOfteamMember = project.getNoOfTeamMembers();
                    }
                }
            }
            if (noOfteamMember < 0) {
                NoOfMemberNotFoundException noOfMemberNotFoundException = new NoOfMemberNotFoundException("project id given is not not valid to get noOfteamMember");
                throw noOfMemberNotFoundException;
            }
        } catch (NoOfMemberNotFoundException e) {
            e.printStackTrace();
        }
        return noOfteamMember;
    }

    @Override

    public ProjectType getProjectTypeByProjectId(int id) {
        ProjectType projectType = null;
        try {
            if (id > 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == id) {
                        projectType = project.getProjectType();
                    }
                }
            }
            if (projectType == null) {
                ProjectTypeNotFoundException projectTypeNotFoundException = new ProjectTypeNotFoundException("project id given is not not valid to get projectType");
                throw projectTypeNotFoundException;
            }
        } catch (ProjectTypeNotFoundException e) {
            e.printStackTrace();
        }
        return projectType;
    }


    // update operation

    @Override
    public boolean updateProjectIdByProjectname(String projectName, int id) {
        boolean isIdupdateByName = false;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectId() == id) {
                        project.setProjectName(projectName);
                        isIdupdateByName = true;
                    }
                }
            }
            if (isIdupdateByName == false) {
                ProjectIdNotUpdatedException projectIdNotUpdatedException = new ProjectIdNotUpdatedException("the project name given to update is not valid");
                throw projectIdNotUpdatedException;
            }
        } catch (ProjectIdNotUpdatedException e) {
            e.printStackTrace();
        }
        return isIdupdateByName;

    }

    @Override
    public boolean updateProjectTypeByProjectname(String projectName, ProjectType projectType) {
        boolean isUpdatedProjectType = false;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        project.setProjectType(projectType);
                        isUpdatedProjectType = true;
                    }
                }
            }
            if (isUpdatedProjectType == false) {
                ProjectTypeNotUpdatedException projectTypeNotUpdatedException = new ProjectTypeNotUpdatedException("the project name give not valid");
                throw projectTypeNotUpdatedException;
            }
        } catch (ProjectTypeNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdatedProjectType;
    }

    @Override
    public boolean updateNoofTeamMemberByProjectId(int projectId, int noOfteamMemeber) {
        boolean isUpdateTeamMember = false;
        try {
            if (projectId != 0) {
                for (Project project : projects) {
                    if (project.getProjectId() == projectId) {
                        project.setNoOfTeamMembers(noOfteamMemeber);
                        isUpdateTeamMember = true;
                    }
                }
            }
            if (isUpdateTeamMember == false) {
                NoOfteamMemberNotUpdatedException noOfteamMemberNotUpdatedException = new NoOfteamMemberNotUpdatedException("not valid");
                throw noOfteamMemberNotUpdatedException;
            }
        } catch (NoOfteamMemberNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdateTeamMember;

    }

    @Override
    public boolean updateNoofDeveloperByProjectName(String projectName, int newNoofDeveloper) {
        boolean isUpdateDeveloper = false;
        try {
            if (projectName != null) {
                for (Project project : projects) {
                    if (project.getProjectName().equals(projectName)) {
                        project.setNoOfDeveloper(newNoofDeveloper);
                        isUpdateDeveloper = true;
                    }
                }
            }
            if (isUpdateDeveloper == false) {
                NoOfDeveloperNotUpdatedException noOfDeveloperNotUpdatedException = new NoOfDeveloperNotUpdatedException("not update the no of developer");
                throw noOfDeveloperNotUpdatedException;
            }
        } catch (NoOfDeveloperNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdateDeveloper;
    }

}
