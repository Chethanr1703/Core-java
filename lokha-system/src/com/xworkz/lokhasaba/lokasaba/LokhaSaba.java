package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.constants.Nationality;
import com.xworkz.lokhasaba.politician.Politician;
import com.xworkz.lokhasaba.politicianvalidator.PoliticianValidator;

public class LokhaSaba {
    Politician politicians[];
    int index;

    public LokhaSaba(int size) {
        politicians = new Politician[size];
    }

    public boolean isPoliticionAdded(Politician politician) {
        boolean isPoliticionAdded = false;

        PoliticianValidator politicianValidator = new PoliticianValidator();
        boolean isValid = politicianValidator.isDetailsValid(politician);
        if (isValid == true) {
//            this.politician=politician;
            politicians[index] = politician;
            index++;
            isPoliticionAdded = true;
        } else {
            System.out.println("the details of the politicion is not valid");
        }
        return isPoliticionAdded;
    }

    public void getDetails() {
        for (Politician politician : politicians) {
            System.out.println("the id of the politicion is   " + politician.getId());
            System.out.println("the name of the politicion is   " + politician.getName());
            System.out.println("the constitution of the politicion is   " + politician.getConstitution());
            System.out.println("the age of the politicion is   " + politician.getAge());
            System.out.println("the is Indian of the politicion is   " + politician.getNationality());
            System.out.println(" ");
        }
    }

    public void getDetails(Politician politician) {

            System.out.println("the id of the politicion is   " + politician.getId());
            System.out.println("the name of the politicion is   " + politician.getName());
            System.out.println("the constitution of the politicion is   " + politician.getConstitution());
            System.out.println("the age of the politicion is   " + politician.getAge());
            System.out.println("the is Indian of the politicion is   " + politician.getNationality());
            System.out.println(" ");
        }

    public Politician getPoliticianById(int id) {
        Politician politician= null;
        if (id != 0) {
            for (Politician politician1 : politicians) {
                if (politician.getId() == id) {
                    politician = politician1;
                }
            }
        } else System.out.println("not valid ID");
        return politician;
    }


    public Nationality getNationalityById(int id) {
        Nationality nationality = null;
        if (id != 0) {
            for (Politician politician : politicians) {
                if (politician.getId() == id) {
                    nationality = politician.getNationality();
                }
            }
        } else System.out.println("not valid ID");

        return nationality;
    }

    public String getNameById(int id) {
        String name = null;
        if (id != 0) {
            for (Politician politician : politicians) {
                if (politician.getId() == id) {
                    name = politician.getName();
                }
            }
        } else System.out.println("not valid ID");
        return name;
    }

    public int getIdByName(String name) {
        int id = 0;
        if (name != null) {
            for (Politician politician : politicians) {
                if (politician.getName().equals(name)) {
                    id = politician.getId();
                }
            }
        } else System.out.println("enter valid name");
        return id;
    }

    public String getConstitutionByName(String name) {
        String constitution = null;
        if (name != null) {
            for (Politician politician : politicians) {
                if (politician.getName().equals(name)) {
                    constitution = politician.getConstitution();
                }
            }
        } else System.out.println("enter valid name");
        if (constitution == null) System.out.println("name not found");
        return constitution;
    }

    public String getConstitutionById(int id) {
        String constitution = null;
        if (id != 0) {
            for (Politician politician : politicians) {
                if (politician.getId() == id) {
                    constitution = politician.getConstitution();
                }
            }
        } else System.out.println("enter valid ID");
        return constitution;
    }

    public int getAgeById(int id) {
        int age = 0;
        if (id != 0) {
            for (Politician politician : politicians) {
                if (politician.getId() == id) {
                    age = politician.getAge();
                }
            }
        } else System.out.println("enter valid ID");
        return age;
    }

    public int getAgeByName(String name) {
        int age = 0;
        if (name != null) {
            for (Politician politician : politicians) {
                if (politician.getName().equals(name)) {
                    age = politician.getAge();
                }
            }
        } else System.out.println("enter valid name");
        return age;
    }

    public boolean updateNameById(int id, String newName){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setName(newName);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateConstitutionById(int id, String newConstitution){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setConstitution(newConstitution);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateAgeById(int id, int newAge){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setAge(newAge);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateNationalityById(int id, Nationality newNationality){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setNationality(newNationality);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
}