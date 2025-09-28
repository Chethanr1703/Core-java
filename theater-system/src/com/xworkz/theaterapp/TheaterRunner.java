package com.xworkz.theaterapp;

import com.xworkz.theaterapp.constants.Certificate;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;
import com.xworkz.theaterapp.theater.impl.TheatherImpl;

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
//        theather.movieInfo();

        //get operation

        String input;
        do {
            System.out.println("press #1 to fetch Movie Name by Id");
            System.out.println("press #2 to fetch Hero Name by Id");
            System.out.println("press #3 to fetch Duration by Id");
            System.out.println("press #4 to fetch Certificate by Id");
            System.out.println("press #5 to fetch Hero Name by Movie Name");
            System.out.println("press #6 to fetch Certificate by Movie Name");
            System.out.println("press #7 to fetch Movie Details by Id");
            System.out.println("press #8 to update Movie Name by Id");
            System.out.println("press #9 to update Duration by Movie Name");
            System.out.println("press #10 to update Hero Name by Id");
            System.out.println("press #11 to update Certificate by Movie Name");
            System.out.println(" ");
            System.out.println("enter the option which you require");

            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("enter the id to get Movie Name");
                    String movieName = theather.getMovieNameById(scanner.nextInt());
                    System.out.println(movieName);
                    break;
                case 2:
                    System.out.println("enter the id to get Hero Name");
                    String heroName = theather.getHeronameById(scanner.nextInt());
                    System.out.println(heroName);
                    break;
                case 3:
                    System.out.println("enter the id to get Duration");
                    String duration = theather.getDurationById(scanner.nextInt());
                    System.out.println(duration);
                    break;
                case 4:
                    System.out.println("enter the id to get Certificate");
                    Certificate certificate = theather.getCertificateById(scanner.nextInt());
                    System.out.println(certificate);
                    break;
                case 5:
                    System.out.println("enter the Movie Name to get Hero Name");
                    heroName = theather.getHeroNameByMovieName(scanner.next());
                    System.out.println(heroName);
                    break;
                case 6:
                    System.out.println("enter the Movie Name to get Certificate");
                    certificate = theather.getCertificateByMovieName(scanner.next());
                    System.out.println(certificate);
                    break;
                case 7:
                    System.out.println("enter the id to get Movie Details");
                    Movie movie = theather.getMovieById(scanner.nextInt());
                    theather.movieInfo(movie);
                    break;
                case 8:
                    System.out.println("enter the id to update Movie Name");
                    int id = scanner.nextInt();
                    System.out.println("enter updated Movie Name");
                    movieName = scanner.next();
                    boolean isMovieNameUpdated = theather.updateMovieNAmeById(id, movieName);
                    System.out.println(isMovieNameUpdated);
                    if(isMovieNameUpdated) {
                        theather.movieInfo();
                    }
                    break;
                case 9:
                    System.out.println("enter the Movie Name to update Duration");
                    movieName = scanner.next();
                    System.out.println("enter updated Duration");
                    duration = scanner.next();
                    boolean isDurationUpdatedByMovieName = theather.updateDurationByMovieName(movieName, duration);
                    System.out.println(isDurationUpdatedByMovieName);
                    if(isDurationUpdatedByMovieName) {
                        theather.movieInfo();
                    }
                    break;
                case 10:
                    System.out.println("enter the id to update Hero Name");
                    id = scanner.nextInt();
                    System.out.println("enter updated Hero Name");
                    heroName = scanner.next();
                    boolean isHeroNameUpdated = theather.updateHeroById(id, heroName);
                    System.out.println(isHeroNameUpdated);
                    if(isHeroNameUpdated) {
                        theather.movieInfo();
                    }
                    break;
                case 11:
                    System.out.println("enter the Movie Name to update Certificate");
                    movieName = scanner.next();
                    System.out.println("enter updated Certificate");
                    Certificate cert = Certificate.valueOf(scanner.next().toUpperCase());
                    boolean isCertificateUpdatedByMovieName = theather.updateCertificationBymovieName(movieName, cert);
                    System.out.println(isCertificateUpdatedByMovieName);
                    if(isCertificateUpdatedByMovieName) {
                        theather.movieInfo();
                    }
                    break;
                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();

        } while(input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting this app ........");
    }

    }

