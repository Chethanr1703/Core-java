package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.constants.Certificate;
import com.xworkz.theaterapp.movie.Movie;

public interface Theather {
    boolean isMovieAdded (Movie movie);
    void movieInfo();
    void movieInfo(Movie movie);
    String  getMovieNameById(int id);
    String  getHeronameById(int id);
    String getDurationById(int id);
    Certificate getCertificateById(int id);
    String  getHeroNameByMovieName(String movieName);
    Certificate   getCertificateByMovieName(String movieName);
    Movie getMovieById(int id);
    boolean  updateMovieNAmeById(int id ,String movieName);
    boolean updateDurationByMovieName(String movieName ,String duration);
    boolean  updateHeroById(int id ,String hero);
    boolean   updateCertificationBymovieName(String movieName , Certificate certificate);
}
