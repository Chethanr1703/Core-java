package com.xworkz.policeapp.policestation.impl;

import com.xworkz.policeapp.constants.Post;
import com.xworkz.policeapp.exception.*;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;
import com.xworkz.policeapp.policevalidator.PoliceValidator;

public class PoliceStationImpl implements PoliceStation {
    Police policeDetails[];
    int index;


    public PoliceStationImpl(int size) {
        policeDetails = new Police[size];
    }

    @Override
    public boolean isPoliceAdded(Police policeDetail) {
        boolean isPoliceAdded = false;

        PoliceValidator policeValidator = new PoliceValidator();

        boolean isInfoValid = policeValidator.isPoliceInfoValid(policeDetail);
        try {
            if (isInfoValid) {
//            this.policeDetails=policeDetails;
                policeDetails[index] = policeDetail;
                index++;
                isPoliceAdded = true;
            } else {
                throw new PoliceNotAddedException("the police info is not added and is not valid");
            }
        } catch (PoliceNotAddedException e) {
            e.printStackTrace();
        }
        return isPoliceAdded;

    }

    @Override
    public void getPoliceDetails() {
        for (Police police : policeDetails) {
            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println(" ");
        }
    }

    @Override
    public void getPoliceDetails(Police police) {

        System.out.println("the id of the police is  " + police.getPoliceId());
        System.out.println("the name of the police is  " + police.getName());
        System.out.println("the type of post of the police is  " + police.getTypeOfPost());
        System.out.println("the salary of the police is  " + police.getSalary());
        System.out.println("the experience of the police is  " + police.getExperience());
        System.out.println(" ");

    }

    @Override
    public String getNameById(int id) {
        String name = null;
        try {
            if (id != 0) {
                for (Police police : policeDetails) {
                    if (police.getPoliceId() == id) {
                        name = police.getName();
                    }
                }
            }
            if (name == null) {
                throw new NameNotFoundException("enter the valid id to get name");
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

        return name;
    }

    @Override
    public Post getPostById(int id) {
        Post typeOfPost = null;
        try {
            if (id != 0) {
                for (Police police : policeDetails) {
                    if (police.getPoliceId() == id) {
                        typeOfPost = police.getTypeOfPost();
                    }
                }
            }
            if (typeOfPost == null) {
                throw new PostNotFoundException("type of post is not found ");
            }
        } catch (PostNotFoundException e) {
            e.printStackTrace();
        }
        return typeOfPost;
    }

    @Override
    public Post getPostByName(String name) {
        Post typeOfPost = null;
        try{
        if (name != null) {
            for (Police police : policeDetails) {
                if (police.getName().equalsIgnoreCase(name)) {
                    typeOfPost = police.getTypeOfPost();
                }
            }
        } if(typeOfPost==null){
            throw new PostNotFoundException("enter valid name to get post");
            }}catch (PostNotFoundException e){
            e.printStackTrace();
        }
        return typeOfPost;
    }

    @Override
    public int getIdByName(String name) {
        int id = 0;
        try{
        if (name != null) {
            for (Police police : policeDetails) {
                if (police.getName().equalsIgnoreCase(name)) {
                    id = police.getPoliceId();
                }
            }
        } if(id<0){
            throw new IdNotFoundException("enter valid name to get id");
            }}catch (IdNotFoundException e){
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public double getSalaryById(int id) {
        double salary = 0.0;
        try{
        if (id != 0) {
            for (Police police : policeDetails) {
                if (police.getPoliceId() == id) {
                    salary = police.getSalary();
                }
            }
        } if(salary<0){
            throw new SalaryNotFoundException("enter valid id to get salary");
            }}catch (SalaryNotFoundException e){
            e.printStackTrace();
        }
        return salary;
    }

    @Override
    public double getSalaryByName(String name) {
        double salary = 0.0;
        try{
        if (name != null) {
            for (Police police : policeDetails) {
                if (police.getName().equalsIgnoreCase(name)) {
                    salary = police.getSalary();
                }
            }
        }if (salary < 0.0){
          throw new SalaryNotFoundException("Name not found to get salary");
        }}catch (SalaryNotFoundException e){
            e.printStackTrace();
        }
        return salary;
    }

    @Override
    public int getExperienceById(int id) {
        int experience = 0;
        try{
        if (id != 0) {
            for (Police police : policeDetails) {
                if (police.getPoliceId() == id) {
                    experience = police.getExperience();
                }
            }
        } if(experience<0){
            throw new ExperienceNotFoundException("enter the valid id to get experience");
            }}catch (ExperienceNotFoundException e){
            e.printStackTrace();
        }
        return experience;
    }

    @Override
    public int getExperienceByName(String name) {
        int experience = 0;
        try{
        if (name != null) {
            for (Police police : policeDetails) {
                if (police.getName().equalsIgnoreCase(name)) {
                    experience = police.getExperience();
                }
            }
        } if(experience<0){
            throw new ExperienceNotFoundException("enter valid name to get experience");
            }}catch (ExperienceNotFoundException e){
            e.printStackTrace();
        }
        return experience;
    }

    @Override
    public Police getPoliceByid(int id) {
        Police police = null;
        try{
        if (id > 0) {
            for (Police police1 : policeDetails) {
                if (police1.getPoliceId() == id) {
                    police = police1;
                }
            }
        }if(police== null){
            throw new PoliceNotFoundException("enter the valid id to get police");
            }}catch (PoliceNotFoundException e){
            e.printStackTrace();
        }
        return police;
    }

    @Override
    public boolean updateNameById(int id, String name) {
        boolean isupdatedNameById = false;
        try{
        if (id != 0) {
            for (Police police : policeDetails) {
                if (police.getPoliceId() == id) {
                    police.setName(name);
                    isupdatedNameById = true;
                }
            }
        }if(isupdatedNameById==false){
            throw new NameNotUpdatedException("enter the valid name to updated the name");
            }}catch (NameNotUpdatedException e){
            e.printStackTrace();
        }
        return isupdatedNameById;
    }

    @Override
    public boolean updatePostById(int id, Post newPost) {
        boolean isUpdated = false;
        try{
        if (id != 0) {
            for (Police police : policeDetails) {
                if (police.getPoliceId() == id) {
                    police.setTypeOfPost(newPost);
                    isUpdated = true;
                }
            }
        } if(isUpdated==false){
            throw new PostNotUpdatedException("enter the valid id to updated the post");
        }}catch (PostNotUpdatedException e){
        e.printStackTrace();
    }
        return isUpdated;
    }

    @Override
    public boolean updateSalaryById(int id, double newSalary) {
        boolean isUpdated = false;
        try{
        if (id != 0) {
            for (Police police : policeDetails) {
                if (police.getPoliceId() == id) {
                    police.setSalary(newSalary);
                    isUpdated = true;
                }
            }
        } if(isUpdated==false){
            throw new SalaryNotUpdatedException("enter the valid name to updated the name");
        }}catch (SalaryNotUpdatedException e){
        e.printStackTrace();
    }
        return isUpdated;
    }

    @Override
    public boolean updateExperienceById(int id, int newExperience) {
        boolean isUpdated = false;
        try{
        if (id != 0) {
            for (Police police : policeDetails) {
                if (police.getPoliceId() == id) {
                    police.setExperience(newExperience);
                    isUpdated = true;
                }
            }
        } if(isUpdated==false){
                throw new ExperienceNotUpdateException("enter the valid name to updated the name");
            }}catch (ExperienceNotUpdateException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

}
