package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.constants.Post;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policevalidator.PoliceValidator;

public class PoliceStationImpl implements PoliceStation {
    Police policeDetails[];
    int index;


    public  PoliceStationImpl (int size){
        policeDetails =new Police[size];
    }
    @Override
    public boolean isPoliceAdded(Police policeDetail){
       boolean isPoliceAdded=false;

        PoliceValidator policeValidator =new PoliceValidator();

        boolean isInfoValid =policeValidator.isPoliceInfoValid(policeDetail);
        if(isInfoValid){
//            this.policeDetails=policeDetails;
            policeDetails[index]=policeDetail;
            index++;
            isPoliceAdded=true;
        }else {
            System.out.println("the police info is not added and is not valid");
        }
        return isPoliceAdded;

    }
    @Override
    public void getPoliceDetails(){
        for(Police police :policeDetails) {
            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println(" ");
        }
    }
    @Override
    public void getPoliceDetails(Police police){

            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println(" ");

    }
    @Override
    public  String getNameById(int id){
        String name =null;
        if(id!=0){
            for (Police police:policeDetails){
                if(police.getPoliceId()==id){
                   name= police.getName();
                }
            }
        }else System.out.println("id is invalid");

        return name;
    }
    @Override
    public Post getPostById(int id){
        Post typeOfPost = null;
        if(id != 0){
            for(Police police : policeDetails){
                if(police.getPoliceId() == id){
                    typeOfPost = police.getTypeOfPost();
                }
            }
        } else System.out.println("enter valid ID");
        return typeOfPost;
    }
    @Override
    public Post getPostByName(String name){
        Post typeOfPost = null;
        if(name != null){
            for(Police police : policeDetails){
                if(police.getName().equalsIgnoreCase(name)){
                    typeOfPost = police.getTypeOfPost();
                }
            }
        } else System.out.println("enter valid name");
        return typeOfPost;
    }
    @Override
    public int getIdByName(String name){
        int id = 0;
        if(name != null){
            for(Police police : policeDetails){
                if(police.getName().equalsIgnoreCase(name)){
                    id = police.getPoliceId();
                }
            }
        } else System.out.println("enter valid name");

        return id;
    }
    @Override
    public double getSalaryById(int id){
        double salary = 0.0;
        if(id != 0){
            for(Police police : policeDetails){
                if(police.getPoliceId() == id){
                    salary = police.getSalary();
                }
            }
        } else System.out.println("enter valid ID");
        return salary;
    }
    @Override
    public double getSalaryByName(String name){
        double salary = 0.0;
        if(name != null){
            for(Police police : policeDetails){
                if(police.getName().equalsIgnoreCase(name)){
                    salary = police.getSalary();
                }
            }
        } else System.out.println("enter valid name");
        if(salary == 0.0) System.out.println("Name not found");
        return salary;
    }
    @Override
    public int getExperienceById(int id){
        int experience = 0;
        if(id != 0){
            for(Police police : policeDetails){
                if(police.getPoliceId() == id){
                    experience = police.getExperience();
                }
            }
        } else System.out.println("enter valid ID");
        return experience;
    }
    @Override
    public int getExperienceByName(String name){
        int experience = 0;
        if(name != null){
            for(Police police : policeDetails){
                if(police.getName().equalsIgnoreCase(name)){
                    experience = police.getExperience();
                }
            }
        } else System.out.println("enter valid name");
        return experience;
    }
    @Override
    public Police getPoliceByid(int id){
        Police police =null;
        if(id>0){
            for(Police police1 :policeDetails){
                if(police1.getPoliceId()==id){
                    police=police1;
                }
            }
        }return  police;
    }

    @Override
  public   boolean updateNameById(int id,String name){
        boolean isupdatedNameById=false;
        if(id!=0){
            for (Police police:policeDetails){
                if(police.getPoliceId()==id){
                    police.setName(name);
                    isupdatedNameById=true;
                }
            }
        }else System.out.println("id is invalid");
        return  isupdatedNameById;
  }
    @Override
    public boolean updatePostById(int id, Post newPost){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : policeDetails){
                if(police.getPoliceId() == id){
                    police.setTypeOfPost(newPost);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updateSalaryById(int id, double newSalary){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : policeDetails){
                if(police.getPoliceId() == id){
                    police.setSalary(newSalary);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updateExperienceById(int id, int newExperience){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : policeDetails){
                if(police.getPoliceId() == id){
                    police.setExperience(newExperience);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }

}
