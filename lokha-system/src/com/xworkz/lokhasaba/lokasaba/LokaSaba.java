package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.constants.Nationality;
import com.xworkz.lokhasaba.politician.Politician;

public interface LokaSaba {
    boolean isPoliticionAdded(Politician politician);

    void getDetails();

    void getDetails(Politician politician);

    Politician getPoliticianById(int id);

    Nationality getNationalityById(int id);

    String getNameById(int id);

    int getIdByName(String name);

    String getConstitutionByName(String name);

    String getConstitutionById(int id);

    int getAgeById(int id);

    int getAgeByName(String name);

    boolean updateNameById(int id, String newName);

    boolean updateConstitutionById(int id, String newConstitution);

    boolean updateAgeById(int id, int newAge);

    boolean updateNationalityById(int id, Nationality newNationality);
}
