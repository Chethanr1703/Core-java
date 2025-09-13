package com.xworkz.theaterapp.movievalidator;

import com.xworkz.theaterapp.movie.Movie;

public class MovieValidator {
    public boolean isMovieInfoValid(Movie movie){
        boolean isMovieInfoValid=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isHeroValid=false;
        boolean isDurationValid=false;
        boolean iscertificateValid=false;

        if(movie.getMovieId()>0){
            isIdValid=true;
        }else{
            System.out.println("the id of the movie is not valid ");
        }
        if(movie.getMovieName()!=null && !movie.getMovieName().isEmpty()){
            isNameValid=true;
        }else{
            System.out.println("the name of the movie is not valid ");
        }
        if(movie.getHero()!=null && !movie.getHero().isEmpty()){
            isHeroValid=true;
        }else{
            System.out.println("the hero of the movie is not valid ");
        }
        if(movie.getDuration()!=null && !movie.getDuration().isEmpty()){
            isDurationValid=true;
        }else{
            System.out.println("the duration of the movie is not valid ");
        }
        if(movie.getCertification()!=null ){
            iscertificateValid=true;
        }else{
            System.out.println("the certification of the movie is not valid ");
        }
        if(isIdValid&&isNameValid&&isHeroValid&&isDurationValid&&iscertificateValid){
            isMovieInfoValid=true;
        }else{
            System.out.println("the info of the movie is not valid ");
        }
        return isMovieInfoValid;
    }
}
