package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.ProjectType;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.projectvalidator.ProjectValidator;

public class Company {
    Project projects[];
    int index;

    public Company(int size){

        projects = new Project[size];
    }

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
            System.out.println("the project type is "+project.getProjectType());
            System.out.println("the no of members of the project is  " + project.getNoOfTeamMembers());
            System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
            System.out.println("");
        }
    }

    public void getProjectDetails(Project project){

            System.out.println("the id of the project is  " + project.getProjectId());
            System.out.println("the company name of the project is  " + project.getCompanyName());
            System.out.println("the name of the project is  " + project.getProjectName());
            System.out.println("the project type is "+project.getProjectType());
            System.out.println("the no of members of the project is  " + project.getNoOfTeamMembers());
            System.out.println("the no of developer of the project is  " + project.getNoOfDeveloper());
            System.out.println("");
        }

        public Project getProductById(int id){
            Project project=null;
                if(id>0){
                    for (Project project1:projects){
                        if(project1.getProjectId()==id){
                            project=project1;
                        }
                    }
                }return project;
        }

    public String getCompanyNameBYID(int projectId){
        String companyName= null;
        if(projectId!=0){
            for(Project project :projects){
                if(project.getProjectId()==projectId){
                    companyName=project.getCompanyName();
                }
            }
        }if(companyName==null) System.out.println("project id given is not not valid to get companyName");

        return companyName;
    }


    public String  getprojectNameById(int id){
        String projectName = null;
        if(id!=0){
            for(Project project :projects){
                if(project.getProjectId()==id){
                    projectName=project.getProjectName();
                }
            }
        }if(projectName==null) System.out.println("project id given is not not valid to get projectname");

        return projectName;
    }

    public ProjectType getProjectTypeByProjectName(String projectName){
        ProjectType projectType=null;
        if(projectName!= null){
            for(Project project :projects){
                if(project.getProjectName().equals(projectName)){
                    projectType=project.getProjectType();
                }
            }
        }if(projectName==null) System.out.println("project name given is not not valid to get projectType");

        return  projectType;
    }


    public int getNoofdeveloperbyProjectName(String projectName){
        int noOfDeveloper =0;
        if(projectName!= null){
            for(Project project :projects){
                if(project.getProjectName().equals(projectName)){
                    noOfDeveloper=project.getNoOfDeveloper();
                }
            }
        }if(projectName==null) System.out.println("project name given is not not valid to get noOFdeveloper");
        return noOfDeveloper;
    }


    public int getNoofTeamMemberByProjectname(String projectName){
        int noOfteamMember =0;
        if(projectName!= null){
            for(Project project :projects){
                if(project.getProjectName().equals(projectName)){
                    noOfteamMember=project.getNoOfTeamMembers();
                }
            }
        }if(projectName==null) System.out.println("project name given is not not valid to get noOfteamMember");
        return noOfteamMember;
    }
    public int getNoofdeveloperbyProjectId(int id){
        int noOfDeveloper =0;
        if(id!= 0){
            for(Project project :projects){
                if(project.getProjectId()==id){
                    noOfDeveloper=project.getNoOfDeveloper();
                }
            }
        }if(id==0) System.out.println("project id given is not not valid to get noOFdeveloper");
        return noOfDeveloper;
    }
    public int getNoofTeamMemberByProjectId(int id){
        int noOfteamMember =0;
        if(id!= 0){
            for(Project project :projects){
                if(project.getProjectId()==id){
                    noOfteamMember=project.getNoOfTeamMembers();
                }
            }
        }if(id==0) System.out.println("project id given is not not valid to get noOfteamMember");
        return noOfteamMember;
    }


    public ProjectType getProjectTypeByProjectId(int id){
        ProjectType projectType =null;
        if(id!=0){
            for(Project project :projects){
                if(project.getProjectId()==id){
                    projectType=project.getProjectType();
                }
            }
        }if(id!=0) System.out.println("project id given is not not valid to get projectType");
        return projectType;
    }


    // update operation


    public boolean updateProjectIdByProjectname(String projectName ,int id){
        boolean isIdupdateByName=false;
        if(projectName!=null){
            for(Project project :projects){
                if(project.getProjectId()==id){
                    project.setProjectName(projectName);
                    isIdupdateByName=true;
                }
            }
        }if(isIdupdateByName==false ) System.out.println("the project name given to update is not valid");
        return isIdupdateByName;
    }
    public boolean updateProjectTypeByProjectname(String projectName ,ProjectType projectType){
        boolean isUpdatedProjectType=false;
        if(projectName!= null){
            for(Project project:projects){
                if(project.getProjectName().equals(projectName)){
                    project.setProjectType(projectType);
                    isUpdatedProjectType=true;
                }
            }
        }if(isUpdatedProjectType== false) System.out.println("the project name give not valid");

        return isUpdatedProjectType;
    }
    public boolean updateNoofTeamMemberByProjectId(int projectId , int noOfteamMemeber){
        boolean isUpdateTeamMember=false;
        if(projectId!=0){
            for(Project project:projects){
                if(project.getProjectId()==projectId){
                    project.setNoOfTeamMembers(noOfteamMemeber);
                    isUpdateTeamMember=true;
                }
            }
        }if(isUpdateTeamMember==false) System.out.println("not valid");
        return isUpdateTeamMember;

    }
    public boolean updateNoofDeveloperByProjectName(String projectName , int newNoofDeveloper){
        boolean isUpdateDeveloper=false;
        if(projectName!=null){
            for(Project project:projects){
                if(project.getProjectName().equals(projectName)){
                    project.setNoOfDeveloper(newNoofDeveloper);
                    isUpdateDeveloper=true;
                }
            }
        }if(isUpdateDeveloper==false) System.out.println("not valid");
        return isUpdateDeveloper;
    }

}
