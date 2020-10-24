package com.example.demo.c04cinema.c04cinema.c04cinema.customer;


import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.AccountManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.generated.GeneratedCustomerController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.example.demo.c04cinema.model_dto.CustomerDTO;
import com.example.demo.c04cinema.model_dto.CustomerPointDTO;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController extends GeneratedCustomerController {
    @Autowired
    JoinComponent joinComponent;


    @GetMapping("/showTickerList/{id}/{pageNum}")
    public List<CustomerDTO> getDTO(@PathVariable int id, @PathVariable int pageNum) {
        int pageSize = 5;
        Join<CustomerDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                .where(Account.ID.equal(id))
                .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID)
                .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID).build(CustomerDTO::new);

        return join.stream().skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
    }

    @GetMapping("/showPointList/page/{pageNum}")
    public List<CustomerPointDTO> getPoint(
            @RequestParam("star_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime star_date,
            @RequestParam("end_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end_date
            , @PathVariable int pageNum
            , @RequestParam int id) {
        int pageSize = 5;
        Join<CustomerPointDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                .where(Account.ID.equal(id))
                .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID).where(BookingTicket.BOOKING_DATE.between(star_date, end_date))
                .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                .innerJoinOn(SeatType.ID).equal(Seat.SEAT_TYPE_ID)
                .innerJoinOn(PromoPoint.ID).equal(SeatType.PROMO_POINT_ID)
                .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                .build(CustomerPointDTO::new);

        return join.stream().skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
    }

}
