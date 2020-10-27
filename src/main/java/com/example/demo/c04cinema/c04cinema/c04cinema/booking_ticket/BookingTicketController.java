package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated.GeneratedBookingTicketController;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.generated.GeneratedCustomerController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.example.demo.c04cinema.model_dto.ConfirmTicketDTO;
import com.speedment.enterprise.plugins.json.JsonCollectors;
import com.speedment.enterprise.plugins.spring.runtime.ControllerUtil;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@RestController
public class BookingTicketController extends GeneratedBookingTicketController {
    @Autowired
    JoinComponent joinComponent;

    @Autowired
    BookingTicketManager bookingTicketManager;


    @GetMapping("/booking_ticket_dto/{pageNum}")
    public List<BookingTicketDTO> getBookingTicketDTO(@PathVariable int pageNum, @RequestParam(defaultValue = "") String search){
        int pageSize =10;
       Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
               .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
               .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
               .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
               .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
               .build(BookingTicketDTO::new);
        if (search.equals("")){
            return join.stream().skip((pageNum-1)*pageSize).limit(pageSize).filter(e-> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).
                    collect(Collectors.toList());
        }
       return join.stream().filter(e-> e.getNameCustomer().contains(search)
               || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                || e.getPhoneCustomer().contains(search)).skip((pageNum-1)*pageSize).limit(pageSize).
               collect(Collectors.toList());
    }  @GetMapping("/booking_ticket_dto")
    public List<BookingTicketDTO> getBookingTicketDTO(@RequestParam(defaultValue = "") String search){
        Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                .build(BookingTicketDTO::new);

        return join.stream().filter(e-> e.getNameCustomer().contains(search)
                || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                || e.getPhoneCustomer().contains(search)).collect(Collectors.toList());
    }

    @PatchMapping("/confirmTicket")
    public void confirmTicket(@RequestBody ConfirmTicketDTO confirmTicketDTO){
       BookingTicket bookingTicket = bookingTicketManager.stream().filter(BookingTicket.ID.equal(confirmTicketDTO.getId())).findFirst().get();
       bookingTicket.setStatus(confirmTicketDTO.getStatus());
       bookingTicketManager.update(bookingTicket);
    }
//    @GetMapping(path = "/booking_ticket_dto", produces = "application/json")
//    public String get(@RequestParam(name = "filter", defaultValue = "[]") String filters) {
//
//        return getHelper(ControllerUtil.parseFilters(filters, GeneratedCustomerController.CustomerFilter::new).collect(toList()));
//    }

}
