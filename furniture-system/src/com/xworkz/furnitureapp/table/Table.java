package com.xworkz.furnitureapp.table;

import com.xworkz.furnitureapp.furniture.Furniture;

public class Table extends Furniture {
    public Table(){
        super();
        System.out.println("Table cons is invoked");
    }
    @Override
    public void  comfort(){
        System.out.println("it give comfort to sit");
    }
}
