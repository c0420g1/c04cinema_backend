package com.example.demo.c04cinema.c04cinema.c04cinema.theatre;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.Location;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.generated.GeneratedTheatreController;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuple4;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
public class TheatreController extends GeneratedTheatreController {
    @Autowired
    TheatreManager theatreManager;

    @Autowired
    JoinComponent joinComponent;

    @Autowired
    BookingTicketManager bookingTicketManager;

    @GetMapping
    public List<BookingTicketDTO> test(@RequestParam int id){
        List<Theatre> res= theatreManager.stream().filter(Theatre.LOCATION_ID.equal(2)).collect(Collectors.toList());

        Join<BookingTicketDTO> join=    joinComponent.from(BookingTicketManager.IDENTIFIER).where(BookingTicket.ACCOUNT_ID.equal(id))
                .innerJoinOn(Customer.ID).equal(BookingTicket.ACCOUNT_ID).innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID).innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                .build(BookingTicketDTO::new);

        List<BookingTicketDTO> res1= join.stream().collect(Collectors.toList());

        return res1;
    }
}
