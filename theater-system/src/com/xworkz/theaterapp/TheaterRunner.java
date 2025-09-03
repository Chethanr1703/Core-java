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

        Movie movie1  = new Movie(1, "Kantara", "Rishab Shetty", "2:15:45", "U/A");
        Movie movie2  = new Movie(2, "KGF Chapter 2", "Prashanth Neel", "2:48:30", "U/A");
        Movie movie3  = new Movie(3, "RRR", "S. S. Rajamouli", "3:07:00", "U/A");
        Movie movie4  = new Movie(4, "Pushpa", "Sukumar", "2:59:00", "U/A");
        Movie movie5  = new Movie(5, "Vikram", "Lokesh Kanagaraj", "2:53:00", "A");
        Movie movie6  = new Movie(6, "Leo", "Lokesh Kanagaraj", "2:44:00", "A");
        Movie movie7  = new Movie(7, "Baahubali: The Beginning", "S. S. Rajamouli", "2:39:00", "U/A");
        Movie movie8  = new Movie(8, "Baahubali: The Conclusion", "S. S. Rajamouli", "2:47:00", "U/A");
        Movie movie9  = new Movie(9, "Kirik Party", "Rishab Shetty", "2:36:00", "U");

        Theather theather= new Theather();
        boolean isAdded=theather.isMovieAdded(movie);
        isAdded = theather.isMovieAdded(movie1);
        isAdded = theather.isMovieAdded(movie2);
        isAdded = theather.isMovieAdded(movie3);
        isAdded = theather.isMovieAdded(movie4);
        isAdded = theather.isMovieAdded(movie5);
        isAdded = theather.isMovieAdded(movie6);
        isAdded = theather.isMovieAdded(movie7);
        isAdded = theather.isMovieAdded(movie8);
        isAdded = theather.isMovieAdded(movie9);

        if(isAdded){
            theather.movieInfo();
        }else{
            System.out.println("the info is not valid");
        }
    }
}
