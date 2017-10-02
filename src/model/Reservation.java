package model;

import java.util.Date;

public class Reservation {

    private String reservationName;
    private int seatNumber;
    private int movieHall;
    private Date reservationDate;
    private int reservationSize;
    private int reservationPrice;

    public Reservation(String reservationName, int seatNumber, int movieHall, Date reservationDate, int reservationSize, int reservationPrice) {
        this.reservationName = reservationName;
        this.seatNumber = seatNumber;
        this.movieHall = movieHall;
        this.reservationDate = reservationDate;
        this.reservationSize = reservationSize;
        this.reservationPrice = reservationPrice;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getMovieHall() {
        return movieHall;
    }

    public void setMovieHall(int movieHall) {
        this.movieHall = movieHall;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
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

}
