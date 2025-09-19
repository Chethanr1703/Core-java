package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.constants.Post;
import com.xworkz.policeapp.police.Police;

public interface PoliceStation {
    boolean isPoliceAdded(Police policeDetail);
    void getPoliceDetails();
    void getPoliceDetails(Police police);
    String getNameById(int id);
    Post getPostById(int id);
    Post getPostByName(String name);
    int getIdByName(String name);
    double getSalaryById(int id);
    double getSalaryByName(String name);
    int getExperienceById(int id);
    int getExperienceByName(String name);
    Police getPoliceByid(int id);
    boolean updateNameById(int id,String name);
    boolean updatePostById(int id, Post newPost);
    boolean updateSalaryById(int id, double newSalary);
    boolean updateExperienceById(int id, int newExperience);
}
