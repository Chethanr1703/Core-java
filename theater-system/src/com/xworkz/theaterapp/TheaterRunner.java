package com.xworkz.theaterapp;

import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;

public class TheaterRunner {
    public static void main(String[] args) {
        Movie movie=new Movie();
        movie.setMovieId(1);
        movie.setMovieName("A");
        movie.setHero("Uppi");
        movie.setDuration("2:15:35");
        movie.setCertification("U and A");

        Theather theather= new Theather();
        boolean isAdded=theather.isMovieAdded(movie);
        if(isAdded){
            theather.movieInfo();
        }else{
            System.out.println("the info is not valid");
        }
    }
}
