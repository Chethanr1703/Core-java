package com.xworkz.lokhasaba.lokasaba.impl;

import com.xworkz.lokhasaba.constants.Nationality;
import com.xworkz.lokhasaba.exception.*;
import com.xworkz.lokhasaba.lokasaba.LokaSaba;
import com.xworkz.lokhasaba.politician.Politician;
import com.xworkz.lokhasaba.politicianvalidator.PoliticianValidator;

public class LokhaSabaImpl implements LokaSaba {
    Politician politicians[];
    int index;

    public LokhaSabaImpl(int size) {
        politicians = new Politician[size];
    }

    @Override
    public boolean isPoliticionAdded(Politician politician) {
        boolean isPoliticionAdded = false;

        PoliticianValidator politicianValidator = new PoliticianValidator();
        boolean isValid = politicianValidator.isDetailsValid(politician);
        try {
            if (isValid == true) {
//            this.politician=politician;
                politicians[index] = politician;
                index++;
                isPoliticionAdded = true;
            } else {
                throw new PoliticianNotAddedException("the details of the politicion is not valid");
            }
        } catch (PoliticianNotAddedException e) {
            e.printStackTrace();
        }
        return isPoliticionAdded;
    }

    @Override
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

    @Override
    public void getDetails(Politician politician) {

        System.out.println("the id of the politicion is   " + politician.getId());
        System.out.println("the name of the politicion is   " + politician.getName());
        System.out.println("the constitution of the politicion is   " + politician.getConstitution());
        System.out.println("the age of the politicion is   " + politician.getAge());
        System.out.println("the is Indian of the politicion is   " + politician.getNationality());
        System.out.println(" ");
    }

    @Override
    public Politician getPoliticianById(int id) {
        Politician politician = null;
        try {
            if (id != 0) {
                for (Politician politician1 : politicians) {
                    if (politician.getId() == id) {
                        politician = politician1;
                    }
                }
            }
            if (politician == null) {
                throw new PoliticianNotFoundException("enter valid ID to get politician");
            }
        } catch (PoliticianNotFoundException e) {
            e.printStackTrace();
        }
        return politician;
    }

    @Override
    public Nationality getNationalityById(int id) {
        Nationality nationality = null;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        nationality = politician.getNationality();
                    }
                }
            }
            if (nationality == null) {
                throw new NationalityNotFoundException("not valid ID to get nationality");
            }
        } catch (NationalityNotFoundException e) {
            e.printStackTrace();
        }
        return nationality;
    }

    @Override
    public String getNameById(int id) {
        String name = null;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        name = politician.getName();
                    }
                }
            }
            if (name == null) {
                throw new PoliticianNameNotFoundException("enter valid id to get name");
            }
        } catch (PoliticianNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getIdByName(String name) {
        int id = 0;
        try {
            if (name != null) {
                for (Politician politician : politicians) {
                    if (politician.getName().equals(name)) {
                        id = politician.getId();
                    }
                }
            }
            if (id <= 0) {
                throw new PoliticianIdNotFoundException("enter the valid name to get id");
            }
        } catch (PoliticianIdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getConstitutionByName(String name) {
        String constitution = null;
        try {
            if (name != null) {
                for (Politician politician : politicians) {
                    if (politician.getName().equals(name)) {
                        constitution = politician.getConstitution();
                    }
                }
            } else System.out.println("enter valid name");
            if (constitution == null) {
                throw new ConstitutionNotFoundException("name not found to get Constitution");
            }
        } catch (ConstitutionNotFoundException e) {
            e.printStackTrace();
        }
        return constitution;
    }

    @Override
    public String getConstitutionById(int id) {
        String constitution = null;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        constitution = politician.getConstitution();
                    }
                }
            }
            if (constitution == null) {
                throw new ConstitutionNotFoundException(" id not found to get constitution");
            }
        } catch (ConstitutionNotFoundException e) {
            e.printStackTrace();
        }
        return constitution;
    }

    @Override
    public int getAgeById(int id) {
        int age = 0;
        try {
            if (id > 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        age = politician.getAge();
                    }
                }
            }
            if (age <= 0) {
                throw new PoliticianAgeNotFoundException("enter valid id to get age");
            }
        } catch (PoliticianAgeNotFoundException e) {
            e.printStackTrace();
        }
        return age;
    }

    @Override
    public int getAgeByName(String name) {
        int age = 0;
        try {
            if (name != null) {
                for (Politician politician : politicians) {
                    if (politician.getName().equals(name)) {
                        age = politician.getAge();
                    }
                }
            }
            throw new PoliticianAgeNotFoundException("enter valid name to get age");
        } catch (PoliticianAgeNotFoundException e) {
            e.printStackTrace();
        }
        return age;
    }

    @Override
    public boolean updateNameById(int id, String newName) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setName(newName);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new NameNotUpdatedException("enter correct ID to update name");
            }
        } catch (NameNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateConstitutionById(int id, String newConstitution) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setConstitution(newConstitution);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new ConstitutionNotUpdatedException("enter correct ID to update constitution");
            }
        } catch (ConstitutionNotUpdatedException e) {
            e.printStackTrace();
        }
        ;
        return isUpdated;
    }

    @Override
    public boolean updateAgeById(int id, int newAge) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setAge(newAge);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new AgeNotUpdatedException("enter correct ID to update name");
            }
        } catch (AgeNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNationalityById(int id, Nationality newNationality) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setNationality(newNationality);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new NationalityNotUpdatedException("enter correct ID to update nationality");
            }
        } catch (NationalityNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}