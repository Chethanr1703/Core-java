package com.xworkz.theaterapp.theater.impl;

import com.xworkz.theaterapp.constants.Certificate;
import com.xworkz.theaterapp.exception.*;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.movievalidator.MovieValidator;
import com.xworkz.theaterapp.theater.Theather;

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
        try {
            if (movieInfo) {
//           this.movie=movie;
                movies[index] = movie;
                index++;
                isMovieAdded = true;
            } else {
                throw new MovieNotAddedException("the details is not valid and movie is not added");
            }
        } catch (MovieNotAddedException e) {
            e.printStackTrace();
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

        try {
            if (movie != null) {

                System.out.println("the id of the movie is " + movie.getMovieId());
                System.out.println("the name of the movie is " + movie.getMovieName());
                System.out.println("the hero of the movie is " + movie.getHero());
                System.out.println("the duration of the movie is " + movie.getDuration());
                System.out.println("the certificate of the movie is " + movie.getCertification());
                System.out.println(" ");
            } else {
                throw new MoviesNotFoundException("enter valid id to get movie info");
            }
        } catch (MoviesNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getMovieNameById(int id) {
        String movieName = null;
        try {
            if (id > 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == id) {
                        movieName = movie.getMovieName();
                    }
                }
            }
            if (movieName == null) {
                throw new MovieNameNotFoundException(" the id is invalid to get movie name");
            }
        } catch (MovieNameNotFoundException e) {
            e.printStackTrace();
        }
        return movieName;
    }


    @Override
    public String getHeronameById(int id) {
        String heroName = null;
        try {
            if (id > 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == id) {
                        heroName = movie.getHero();
                    }
                }
            }
            if (heroName == null ){
                throw new HeroNameNotFoundException("the id is invalid to get movie name");
            }
        } catch (HeroNameNotFoundException e) {
            e.printStackTrace();
        }
        return heroName;
    }

    @Override
    public String getDurationById(int id) {
        String duration = null;
        try {
            if (id > 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == id) {
                        duration = movie.getDuration();
                    }
                }
            }
            if (duration == null) {
                throw new DurationNotFoundException("the id is invalid to get duration ");
            }
        } catch (DurationNotFoundException e) {
            e.printStackTrace();
        }
        return duration;
    }

    @Override
    public Certificate getCertificateById(int id) {
        Certificate certificate = null;
        try {
            if (id > 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == id) {
                        certificate = movie.getCertification();
                    }
                }
            }
            if (certificate == null) {
                throw new CertificateNotFundException("the id is invalid to get certificate");
            }
        } catch (CertificateNotFundException e) {
            e.printStackTrace();
        }
        return certificate;
    }

    @Override
    public String getHeroNameByMovieName(String movieName) {
        String heroName = null;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equals(movieName)) {
                        heroName = movie.getHero();
                    }
                }
            }
            if (heroName == null) {
                throw new HeroNameNotFoundException("the movie name is invalid to get hero name");
            }
        } catch (HeroNameNotFoundException e) {
            e.printStackTrace();
        }
        return heroName;

    }

    @Override
    public Certificate getCertificateByMovieName(String movieName) {
        Certificate certificate = null;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equals(movieName)) {
                        certificate = movie.getCertification();
                    }
                }
            }
            if (certificate == null) {
                throw new CertificateNotFundException("the id is invalid to get movie name");
            }
        } catch (CertificateNotFundException e) {
            e.printStackTrace();
        }
        return certificate;
    }

    @Override
    public Movie getMovieById(int id) {
        Movie movie = null;
        try {
            if (id > 0) {
                for (Movie movie1 : movies) {
                    if (movie1.getMovieId() == id) {
                        movie = movie1;
                    }
                }

            }
            if (movie == null) {
                throw new MoviesNotFoundException(" the id in valid to get Movie");
            }
        } catch (MoviesNotFoundException e) {
            e.printStackTrace();
        }
        return movie;
    }


    //update operation
    @Override
    public boolean updateMovieNAmeById(int id, String movieName) {
        boolean isMovieNameUpdatedById = false;
        try {
            if (id > 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == id) {
                        movie.setMovieName(movieName);
                        isMovieNameUpdatedById = true;
                    }
                }
            }
            if (isMovieNameUpdatedById == false) {
                throw new MovieNameNotupdatedException("id is invalid to update the movie name");
            }
        } catch (MovieNameNotupdatedException e) {
            e.printStackTrace();
        }
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
        }
        if (isDurationUpdatedByMovieName == false) {
            throw new DurationNotUpdatedException("movie name is invalid to update the duration ");
        }
        return isDurationUpdatedByMovieName;
    }

    @Override
    public boolean updateHeroById(int id, String hero) {
        boolean isheroeUpdatedById = false;
        try {
            if (id > 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == id) {
                        movie.setHero(hero);
                        isheroeUpdatedById = true;
                    }
                }
            }
            if (isheroeUpdatedById == false) {
                throw new HeroNAmeNotUpdatedException("id is invalid to update the hero name");
            }
        } catch (HeroNAmeNotUpdatedException e) {
            e.printStackTrace();
        }
        return isheroeUpdatedById;
    }

    @Override
    public boolean updateCertificationBymovieName(String movieName, Certificate certificate) {
        boolean isCertificateUpdatedByMovieName = false;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equals(movieName)) {
                        movie.setCertification(certificate);
                        isCertificateUpdatedByMovieName = true;
                    }
                }
            }
            if (isCertificateUpdatedByMovieName == false) {
                throw new CertificateNotUpdatedException("movie name is invalid to update the certificate");
            }
        } catch (CertificateNotUpdatedException e) {
            e.printStackTrace();
        }
        return isCertificateUpdatedByMovieName;
    }


}

