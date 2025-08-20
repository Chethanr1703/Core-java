package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.movievalidator.MovieValidator;

public class Theather {
    Movie movie;
    public boolean isMovieAdded (Movie movie){
       boolean isMovieAdded =false;

        MovieValidator movieValidator=new MovieValidator();
        boolean movieInfo=movieValidator.isMovieInfoValid(movie);

       if(movieInfo){
           this.movie=movie;
           isMovieAdded=true;
       }else{
           System.out.println("the details is not valid and movie is not added");
       }

       return  isMovieAdded;
    }
    public  void movieInfo(){
        System.out.println("the id of the movie is "+movie.getMovieId());
        System.out.println("the name of the movie is "+movie.getMovieName());
        System.out.println("the hero of the movie is "+movie.getHero());
        System.out.println("the duration of the movie is "+movie.getDuration());
        System.out.println("the certificate of the movie is "+movie.getCertification());

    }
}
