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

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public Date getMoviePeriod() {
        return moviePeriod;
    }

    public void setMoviePeriod(Date moviePeriod) {
        this.moviePeriod = moviePeriod;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

}
