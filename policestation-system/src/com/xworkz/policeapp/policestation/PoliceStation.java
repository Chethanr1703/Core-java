package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.constants.Post;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policevalidator.PoliceValidator;

public class PoliceStation {
    Police policeDetails[];
    int index;


    public  PoliceStation (int size){
        policeDetails =new Police[size];
    }

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
    public void getPoliceDetails(Police police){

            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println(" ");

    }

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
