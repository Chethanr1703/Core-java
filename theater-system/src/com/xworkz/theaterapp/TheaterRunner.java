package com.xworkz.theaterapp;

import com.xworkz.theaterapp.constants.Certificate;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;
import com.xworkz.theaterapp.theater.TheatherImpl;

import java.util.Scanner;

public class TheaterRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the theather");
        int size = scanner.nextInt();
        Theather theather = new TheatherImpl(size);

        for(int index=0;index<size;index++){
            Movie movie = new Movie();

            System.out.println("enter movie id");
            movie.setMovieId(scanner.nextInt());

            System.out.println("enter the movie Name ");
            movie.setMovieName(scanner.next());

            System.out.println("enter the hero name");
            movie.setHero(scanner.next());

            System.out.println("enter the duration of the movie");
            movie.setDuration(scanner.next());

            System.out.println("enter the certification of the movie");
            movie.setCertification(Certificate.valueOf(scanner.next().toUpperCase()));

            theather.isMovieAdded(movie);
        }
        theather.movieInfo();

        //get operation

        System.out.println("enter the id to get movie name");
        String movieName = theather.getMovieNameById(scanner.nextInt());
        System.out.println(movieName);

        System.out.println("enter the id to get hero name");
        String heroName = theather.getHeronameById(scanner.nextInt());
        System.out.println(heroName);

        System.out.println("enter the id to get duartion");
        String duration = theather.getDurationById(scanner.nextInt());
        System.out.println(duration);

        System.out.println("enter the id to get Certificate");
       Certificate certificate = theather.getCertificateById(scanner.nextInt());
        System.out.println(certificate);

        System.out.println("enter the movie name to get hero name");
        heroName = theather.getHeroNameByMovieName(scanner.next());
        System.out.println(heroName);

        System.out.println("enter the movie name to get Certificate");
         certificate = theather.getCertificateByMovieName(scanner.next());
        System.out.println(certificate);

        System.out.println("enter the id to get Movie");
        Movie movie = theather.getMovieById(scanner.nextInt());
        theather.movieInfo(movie);

        //update operation
        System.out.println("enter the id to update the movie name");
        int id = scanner.nextInt();
        System.out.println("enter updated movie name");
         movieName= scanner.next();
         boolean isMovieNameUpdated= theather.updateMovieNAmeById(id ,movieName);
         if(isMovieNameUpdated){
             theather.movieInfo();
         }

        System.out.println("enter the movie name to update the duartion");
         movieName = scanner.next();
        System.out.println("enter updated movie name");
        duration= scanner.next();
        boolean isDurationUpdatedByMovieName = theather.updateDurationByMovieName(movieName,duration);
        if(isDurationUpdatedByMovieName){
            theather.movieInfo();
        }
        System.out.println("enter the id to update the hero name");
         id = scanner.nextInt();
        System.out.println("enter updated hero name");
        heroName= scanner.next();
        boolean isHeroNameUpdated= theather.updateHeroById(id ,heroName);
        if(isHeroNameUpdated){
            theather.movieInfo();
        }

        System.out.println("enter the movie name to update the certificate");
        movieName = scanner.next();
        System.out.println("enter updated movie name");
         certificate = Certificate.valueOf(scanner.next().toUpperCase());
        boolean isCerificateUpdatedByMovieName = theather.updateCertificationBymovieName(movieName,certificate);
        if(isCerificateUpdatedByMovieName){
            theather.movieInfo();
        }

    }
}
