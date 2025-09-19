package com.xworkz.companyapp.project;

import com.xworkz.companyapp.constants.ProjectType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Project {
    private int projectId;
    private String companyName;
    private String projectName;
    private ProjectType projectType;
    private int noOfTeamMembers;
    private int noOfDeveloper;



}
