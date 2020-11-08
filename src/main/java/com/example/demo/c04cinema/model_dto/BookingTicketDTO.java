package com.example.demo.c04cinema.model_dto;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import java.time.LocalDateTime;

public class BookingTicketDTO {

    private final int idBookingTicket;
    private final String bookingCode;
    private final LocalDateTime bookingDate;
    private final String codeCustomer;
    private final String nameCustomer;
    private final String cardIdCustomer;
    private final String movieName;
    private final String phoneCustomer;
    private final Byte status;
    private final String posterUrl;
    private final LocalDateTime startTime;
    private final double priceTicket;
    private final String seat;
    private final double pointCustomer;
    private final Byte isCancel;
    private final String hallName;


    public BookingTicketDTO(BookingTicket bookingTicket, Customer customer, Show show, Movie movie, Seat seat, Hall hall){
        this.idBookingTicket= bookingTicket.getId();
        this.bookingCode= bookingTicket.getCode().get();
        this.bookingDate=  bookingTicket.getBookingDate().get();
        this.codeCustomer= customer.getCode().get();
        this.nameCustomer= customer.getName().get();
        this.cardIdCustomer= customer.getCardid().get();
        this.movieName= movie.getName().get();
        this.phoneCustomer= customer.getPhone().get();
        this.status= bookingTicket.getStatus().get();
        this.posterUrl= movie.getPosterUrl().get();
        this.startTime= show.getStartTime().get();
        this.priceTicket= bookingTicket.getPrice().getAsDouble();
        this.seat= seat.getName().get();
        this.pointCustomer = customer.getCurrentBonusPoint().getAsInt();
        this.isCancel = bookingTicket.getIscancel().get();
        this.hallName = hall.getName().get();
    }



    public String getHallName() { return hallName; }

    public Byte getIsCancel() { return isCancel; }

    public double getPointCustomer() { return pointCustomer; }

    public String getSeat() {
        return seat;
    }

    public LocalDateTime getStartTime() { return startTime; }

    public double getPriceTicket() { return priceTicket; }

    public String getPosterUrl() { return posterUrl; }

    public int getIdBookingTicket() {
        return idBookingTicket;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getCardIdCustomer() {
        return cardIdCustomer;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public Byte getStatus() {
        return status;
    }
}
