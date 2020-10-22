package com.example.demo.c04cinema.c04cinema.c04cinema.theatre;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.combo.Combo;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.Location;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.generated.GeneratedTheatreController;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.example.demo.c04cinema.model_dto.ComboDTO;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuple4;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/test")
public class TheatreController extends GeneratedTheatreController {
    @Autowired
    TheatreManager theatreManager;

    @Autowired
    JoinComponent joinComponent;

    @Autowired
    BookingTicketManager bookingTicketManager;

    @GetMapping("/a")
    public List<BookingTicketDTO> test(@RequestParam int id){
        List<Theatre> res= theatreManager.stream().filter(Theatre.LOCATION_ID.equal(2)).collect(toList());

        Join<BookingTicketDTO> join=    joinComponent.from(BookingTicketManager.IDENTIFIER).where(BookingTicket.ACCOUNT_ID.equal(id))
                .innerJoinOn(Customer.ID).equal(BookingTicket.ACCOUNT_ID).innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID).innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                .build(BookingTicketDTO::new);

        List<BookingTicketDTO> res1= join.stream().collect(toList());

        return res1;
    }
    @GetMapping("/b/page/{pageNum}")
    public List<BookingTicketDTO> test1(@PathVariable int pageNum){
        int pageSize= 10;
       Join<BookingTicketDTO> join= joinComponent.from(BookingTicketManager.IDENTIFIER).innerJoinOn(Customer.ID).equal(BookingTicket.ACCOUNT_ID)
                .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID).innerJoinOn(Movie.ID).equal(Show.MOVIE_ID).build(BookingTicketDTO::new);

       return join.stream().skip(pageNum*pageSize).limit(pageSize).collect(toList());
    }

    @PostMapping("/c")
    public String checkValid(@RequestBody Combo combo){
        if(combo.getName().equals(""))
            return "Name not null";

        return "Ok";
    }

    @PostMapping("/d")
    public String checkValid2(@RequestBody ComboDTO comboDTO){
        if(comboDTO.getName().equals(""))
            return "Name not null";

        return "Ok";
    }
}
