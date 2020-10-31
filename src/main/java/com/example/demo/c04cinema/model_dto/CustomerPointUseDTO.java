package com.example.demo.c04cinema.model_dto;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.Promotion;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomer;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;

import java.time.LocalDateTime;
import java.util.Objects;

public class CustomerPointUseDTO {

    private final String movieName;
    private final LocalDateTime dayPut;
    private final Double point;
    private final String code;

    public CustomerPointUseDTO(Account account, BookingTicket bookingTicket, Seat seat, SeatType seatType, PromoPoint promoPoint, Show show, Movie movie, Customer customer, PromotionCustomer promotionCustomer, Promotion promotion){
        this.movieName= promotion.getName().get();
        this.dayPut= bookingTicket.getBookingDate().get();
        this.point = promotion.getPrice().getAsDouble();
        this.code = promotionCustomer.getPromotionCode().get();
    }

    public String getCode() {
        return code;
    }

    public String getMovieName() {
        return movieName;
    }

    public LocalDateTime getDayPut() {
        return dayPut;
    }

    public Double getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerPointUseDTO that = (CustomerPointUseDTO) o;
        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
