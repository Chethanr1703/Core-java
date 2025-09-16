package com.xworkz.databaseapp;

import com.xworkz.databaseapp.database.DataBase;
import com.xworkz.databaseapp.database.impl.DataBaseImpl;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase db = new DataBaseImpl();
        db.insertRecord();
        db.updateRecord();
        db.deleteRecord();
    }
}
