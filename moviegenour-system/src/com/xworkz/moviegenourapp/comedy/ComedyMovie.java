package com.xworkz.moviegenourapp.comedy;

import com.xworkz.moviegenourapp.moviegenour.MovieGenour;

public class ComedyMovie extends MovieGenour {
    public ComedyMovie(){
        super();
        System.out.println("ComedyMovie cons is invoked");
    }
    @Override
    public void toEntertain(){
        System.out.println(" Comedy movie is done to entertain the people");
    }
}
