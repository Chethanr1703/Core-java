package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.constants.Certificate;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.movievalidator.MovieValidator;

public class TheatherImpl implements Theather {
    Movie movies[];
    int index;

    public TheatherImpl(int size) {
        movies = new Movie[size];
    }

    @Override
    public boolean isMovieAdded(Movie movie) {
        boolean isMovieAdded = false;

        MovieValidator movieValidator = new MovieValidator();
        boolean movieInfo = movieValidator.isMovieInfoValid(movie);

        if (movieInfo) {
//           this.movie=movie;
            movies[index] = movie;
            index++;
            isMovieAdded = true;
        } else {
            System.out.println("the details is not valid and movie is not added");
        }

        return isMovieAdded;
    }

    @Override
    public void movieInfo() {

        for (Movie movie : movies) {
            System.out.println("the id of the movie is " + movie.getMovieId());
            System.out.println("the name of the movie is " + movie.getMovieName());
            System.out.println("the hero of the movie is " + movie.getHero());
            System.out.println("the duration of the movie is " + movie.getDuration());
            System.out.println("the certificate of the movie is " + movie.getCertification());
            System.out.println(" ");
        }
    }

    @Override
    public void movieInfo(Movie movie) {


        System.out.println("the id of the movie is " + movie.getMovieId());
        System.out.println("the name of the movie is " + movie.getMovieName());
        System.out.println("the hero of the movie is " + movie.getHero());
        System.out.println("the duration of the movie is " + movie.getDuration());
        System.out.println("the certificate of the movie is " + movie.getCertification());
        System.out.println(" ");

    }

    @Override
    public String getMovieNameById(int id) {
        String movieName = null;
        if (id > 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == id) {
                    movieName = movie.getMovieName();
                }
            }
        } else System.out.println("the id is invalid to get movie name");
        return movieName;
    }


    @Override
    public String getHeronameById(int id) {
        String heroName = null;
        if (id > 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == id) {
                    heroName = movie.getHero();
                }
            }
        } else System.out.println("the id is invalid to get movie name");
        return heroName;
    }
    @Override
    public String getDurationById(int id) {
        String duration = null;
        if (id > 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == id) {
                    duration = movie.getDuration();
                }
            }
        } else System.out.println("the id is invalid to get duration ");
        return duration;
    }
    @Override
    public Certificate getCertificateById(int id) {
        Certificate certificate = null;
        if (id > 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == id) {
                    certificate = movie.getCertification();
                }
            }
        } else System.out.println("the id is invalid to get certificate");
        return certificate;
    }
    @Override
    public String getHeroNameByMovieName(String movieName) {
        String heroName = null;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equals(movieName)) {
                    heroName = movie.getHero();
                }
            }
        } else System.out.println("the movie name is invalid to get hero name");
        return heroName;

    }
    @Override
    public Certificate getCertificateByMovieName(String movieName) {
        Certificate certificate = null;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equals(movieName)) {
                    certificate = movie.getCertification();
                }
            }
        } else System.out.println("the id is invalid to get movie name");
        return certificate;
    }
    @Override
    public Movie getMovieById(int id) {
        Movie movie = null;
        if (id > 0) {
            for (Movie movie1 : movies) {
                if (movie1.getMovieId() == id) {
                    movie = movie1;
                }
            }

        } else System.out.println(" the id in valid to get Movie");
        return movie;
    }


    //update operation
    @Override
    public boolean updateMovieNAmeById(int id, String movieName) {
        boolean isMovieNameUpdatedById = false;
        if (id > 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == id) {
                    movie.setMovieName(movieName);
                    isMovieNameUpdatedById = true;
                }
            }
        } else System.out.println("id is invalid to update the movie name");
        return isMovieNameUpdatedById;
    }
    @Override
    public boolean updateDurationByMovieName(String movieName, String duration) {
        boolean isDurationUpdatedByMovieName = false;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equals(movieName)) {
                    movie.setDuration(duration);
                    isDurationUpdatedByMovieName = true;
                }
            }
        } else System.out.println("movie name is invalid to update the duration ");
        return isDurationUpdatedByMovieName;
    }
    @Override
    public boolean updateHeroById(int id, String hero) {
        boolean isheroeUpdatedById = false;
        if (id > 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == id) {
                    movie.setHero(hero);
                    isheroeUpdatedById = true;
                }
            }
        } else System.out.println("id is invalid to update the hero name");
        return isheroeUpdatedById;
    }
    @Override
    public boolean updateCertificationBymovieName(String movieName, Certificate certificate) {
        boolean isCertificateUpdatedByMovieName = false;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equals(movieName)) {
                    movie.setCertification(certificate);
                    isCertificateUpdatedByMovieName = true;
                }
            }
        } else System.out.println("movie name is invalid to update the certificate");
        return isCertificateUpdatedByMovieName;
    }


}

