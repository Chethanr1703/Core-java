package com.xworkz.theaterapp.movie;

public class Movie {
    private int movieId;
    private String movieName;
    private String hero;
    private String duration;
    private String certification;

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHero() {
        return hero;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getCertification() {
        return certification;
    }
}
