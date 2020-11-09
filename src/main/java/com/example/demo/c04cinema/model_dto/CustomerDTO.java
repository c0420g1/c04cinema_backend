package com.example.demo.c04cinema.model_dto;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;

import java.time.LocalDateTime;

public class CustomerDTO {
    private final int idAcc;
    private final String movieName;
    private final LocalDateTime dayPut;
    private final Double totalMoney;
    private final Byte status;
    private final Byte canCel;
    private final int idTicker;

    public CustomerDTO(Account account, BookingTicket bookingTicket, Show show, Movie movie){
        this.idAcc = account.getId();
        this.movieName= movie.getName().get();
        this.dayPut= bookingTicket.getBookingDate().get();
        this.totalMoney= bookingTicket.getPrice().getAsDouble();
        this.status= bookingTicket.getStatus().get();
        this.canCel= bookingTicket.getIscancel().get();
        this.idTicker = bookingTicket.getId();
    }

    public int getIdAcc() {
        return idAcc;
    }

    public int getIdTicker() {
        return idTicker;
    }

    public String getMovieName() {
        return movieName;
    }

    public LocalDateTime getDayPut() {
        return dayPut;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public Byte getStatus() {
        return status;
    }

    public Byte getCanCel() {
        return canCel;
    }
}
