package model;

import java.util.Date;

public class Movie {

    private String movieName;
    private String movieGenre;
    private int movieTime;
    private Date moviePeriod;
    private String movieDescription;

    public Movie(String movieName, String movieGenre, int movieTime, Date moviePeriod, String movieDescription) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieTime = movieTime;
        this.moviePeriod = moviePeriod;
        this.movieDescription = movieDescription;
    }

    public Movie() {

    }
}
