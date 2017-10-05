package model;

import java.util.Date;

public class Reservation {

    private String reservationName;
    private Movie movie;
    private String seatNumber;
    private String movieHall;
    private String genre;
    private String reservationDate;
    private String reservationTime;
    private int reservationSize;
    private int reservationPrice;

    public Reservation(String reservationName, Movie movie, String seatNumber, String movieHall, String reservationDate, int reservationSize, int reservationPrice) {
        this.reservationName = reservationName;
        this.movie = movie;
        this.seatNumber = seatNumber;
        this.movieHall = movieHall;
        this.reservationDate = reservationDate;
        this.reservationSize = reservationSize;
        this.reservationPrice = reservationPrice;
    }

    public Reservation(String reservationName, String seatNumber, String movieHall, int reservationSize, int reservationPrice) {
        this.reservationName = reservationName;
        this.seatNumber = seatNumber;
        this.movieHall = movieHall;
        this.reservationSize = reservationSize;
        this.reservationPrice = reservationPrice;
    }

    public Reservation(String reservationName, String genre, String seatNumber, String movieHall, String reservationTime) {
        this.reservationName = reservationName;
        this.genre = genre;
        this.seatNumber = seatNumber;
        this.movieHall = movieHall;
        this.reservationTime = reservationTime;
    }


    public Reservation () {

    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMovieHall() {
        return movieHall;
    }

    public void setMovieHall(String movieHall) {
        this.movieHall = movieHall;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getReservationSize() {
        return reservationSize;
    }

    public void setReservationSize(int reservationSize) {
        this.reservationSize = reservationSize;
    }

    public int getReservationPrice() {
        return reservationPrice;
    }

    public void setReservationPrice(int reservationPrice) {
        this.reservationPrice = reservationPrice;
    }
    public String getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
