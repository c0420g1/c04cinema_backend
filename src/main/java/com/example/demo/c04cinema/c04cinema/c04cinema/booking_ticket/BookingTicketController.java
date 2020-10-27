package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket;

import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated.GeneratedBookingTicketController;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.Theatre;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.TheatreManager;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.example.demo.c04cinema.model_dto.BookingTimeDTO;
import com.example.demo.c04cinema.model_dto.ConfirmTicketDTO;



@RestController
public class BookingTicketController extends GeneratedBookingTicketController {
    @Autowired
    JoinComponent joinComponent;

    @Autowired
    BookingTicketManager bookingTicketManager;


    @GetMapping("/booking_ticket_dto/{pageNum}")
    public List<BookingTicketDTO> getBookingTicketDTO(@PathVariable int pageNum, @RequestParam(defaultValue = "") String search) throws Exception {
        int pageSize =10;
        try{
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
        } catch (Exception ex){
            throw new Exception("Error get list: "+ex.getMessage());
        }
    }
    @GetMapping("/booking_ticket_dto")
    public List<BookingTicketDTO> getBookingTicketDTO(@RequestParam(defaultValue = "") String search) throws Exception {

        try{
            Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .build(BookingTicketDTO::new);
            return join.stream().filter(e-> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).collect(Collectors.toList());
        } catch (Exception ex){
            throw new Exception("Error get List size: "+ex.getMessage());
        }


    }

    @PatchMapping("/confirmTicket")
    public void confirmTicket(@RequestBody ConfirmTicketDTO confirmTicketDTO){
        try{
            BookingTicket bookingTicket = bookingTicketManager.stream().filter(BookingTicket.ID.equal(confirmTicketDTO.getId())).findFirst().get();
            bookingTicket.setStatus(confirmTicketDTO.getStatus());
            bookingTicketManager.update(bookingTicket);
        } catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }

    }


}
