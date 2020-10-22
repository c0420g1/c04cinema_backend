package com.example.demo.c04cinema.model_dto;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import java.time.LocalDateTime;

public class BookingTicketDTO {
    private final String bookingCode;
    private final LocalDateTime bookingDate;
    private final String codeCustomer;
    private final String nameCustomer;
    private final String cardIdCustomer;
    private final String movieName;


    public BookingTicketDTO(BookingTicket bookingTicket, Customer customer, Show show, Movie movie){
        this.bookingCode= bookingTicket.getCode().get();
        this.bookingDate=  bookingTicket.getBookingDate().get();
        this.codeCustomer= customer.getCode().get();
        this.nameCustomer= customer.getName().get();
        this.cardIdCustomer= customer.getCardid().get();
        this.movieName= movie.getName().get();
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
}
