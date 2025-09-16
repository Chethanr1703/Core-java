package com.xworkz.databaseapp.database.impl;

import com.xworkz.databaseapp.database.DataBase;

public class DataBaseImpl implements DataBase {
    @Override
    public void insertRecord() {
        System.out.println("Record inserted into database");
    }

    @Override
    public void updateRecord() {
        System.out.println("Record updated in database");
    }

    @Override
    public void deleteRecord() {
        System.out.println("Record deleted from database");
    }
}
