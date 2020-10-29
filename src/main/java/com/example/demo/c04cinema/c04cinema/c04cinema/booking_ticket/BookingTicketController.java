package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.HallManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.Location;
import com.example.demo.c04cinema.common.Error;
import com.example.demo.c04cinema.model_dto.*;
import com.speedment.common.tuple.Tuple4;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated.GeneratedBookingTicketController;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.Theatre;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

@RestController
public class BookingTicketController extends GeneratedBookingTicketController {
    @Autowired
    JoinComponent joinComponent;

    @Autowired
    BookingTicketManager bookingTicketManager;


    @GetMapping("/booking_ticket_dto/{pageNum}")
    public List<BookingTicketDTO> getBookingTicketDTO(@PathVariable int pageNum, @RequestParam(defaultValue = "") String search) throws Exception {
        int pageSize = 10;
        try {
            Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .build(BookingTicketDTO::new);
            if (search.equals("")) {
                return join.stream().skip((pageNum - 1) * pageSize).limit(pageSize).filter(e -> e.getNameCustomer().contains(search)
                        || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                        || e.getPhoneCustomer().contains(search)).
                        collect(toList());
            }
            return join.stream().filter(e -> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).skip((pageNum - 1) * pageSize).limit(pageSize).
                    collect(toList());
        } catch (Exception ex) {
            throw new Exception("Error get list: " + ex.getMessage());
        }
    }

    @GetMapping("/booking_ticket_dto")
    public List<BookingTicketDTO> getBookingTicketDTO(@RequestParam(defaultValue = "") String search) throws Exception {

        try {
            Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .build(BookingTicketDTO::new);
            return join.stream().filter(e -> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).collect(toList());
        } catch (Exception ex) {
            throw new Exception("Error get List size: " + ex.getMessage());
        }

    }

    @PatchMapping("/confirmTicket")
    public void confirmTicket(@RequestBody ConfirmTicketDTO confirmTicketDTO) {
        try {
            BookingTicket bookingTicket = bookingTicketManager.stream().filter(BookingTicket.ID.equal(confirmTicketDTO.getId())).findFirst().get();
            bookingTicket.setStatus(confirmTicketDTO.getStatus());
            bookingTicketManager.update(bookingTicket);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    // qg23
    @GetMapping("/bookingTime/{locationId}")
    public List<BookingTimeDTO> getBookingTime(@PathVariable int locationId, @RequestParam String dateShow) {
        Join<Tuple4<Hall, Theatre, Location, Show>> join = joinComponent.from(HallManager.IDENTIFIER).innerJoinOn(Theatre.ID).equal(Hall.THEATRE_ID).where(Theatre.LOCATION_ID.equal(locationId))
                .innerJoinOn(Location.ID).equal(Theatre.LOCATION_ID)
                .innerJoinOn(Show.HALL_ID).equal(Hall.ID).build(Tuples::of);

        Map<Theatre, List<Show>> res = join.stream().collect(
                groupingBy(Tuple4::get1, mapping(Tuple4::get3, toList()))
        );

        List<BookingTimeDTO> bookingTimeDTOList = new ArrayList<>();
        res.forEach((th, ti) -> {
            int theatreId = th.getId();
            String theatreName = th.getName().get();
            List<ShowDTO> showDTOList= new ArrayList<>();
            ti.stream().filter(f-> f.getStartTime().get().toString().contains(dateShow)).forEach(s->{
                int id = s.getId();
                String time= s.getStartTime().get().toString();
                double price= s.getPrice().getAsDouble();
                ShowDTO showDTO= new ShowDTO(id,time,price);
                showDTOList.add(showDTO);
            });

            BookingTimeDTO bookingTimeDTO = new BookingTimeDTO(theatreId, theatreName, showDTOList);
            if(showDTOList.size()>0)
                bookingTimeDTOList.add(bookingTimeDTO);

//            System.out.format("%s -> %s %n",
//                    th.getName(),
//                    ti.stream().map(Show::getHallId).sorted().collect(toList())
//            );
        });

        return bookingTimeDTOList;
    }

//    @PostMapping("/booking")
//    public List<Error> booking(@RequestBody List<BookingDTO> bookingDTOList, @RequestBody int promotionId, @RequestBody int paymentId, @RequestBody int status, @RequestBody String contactEmail, @RequestBody String contactPhone){
//        bookingDTOList.stream().forEach(e->{
//            BookingTicket bookingTicket= new BookingTicketImpl();
//            bookingTicket.setCode(e.getCode());
//            bookingTicket.setShowId(e.getShowId());
//            bookingTicket.setTicketTypeId(e.getTicket_type_id());
//            bookingTicket.setSeatId(e.getSeat_id());
//            bookingTicket.setAccountId(e.getAccount_id());
//            bookingTicket.setPrice(e.getPrice());
//            bookingTicket.setBookingDate(LocalDateTime.parse(e.getBooking_date()));
//            bookingTicket.setPromotionId(promotionId);
//            bookingTicket.setPaymentId(paymentId);
//            bookingTicket.setStatus(Byte.parseByte(String.valueOf(status)));
//            bookingTicket.setContactEmail(contactEmail);
//            bookingTicket.setContactPhone(contactPhone);
//            bookingTicketManager.persist(bookingTicket);
//        });
//
//        return null;
//    }
}
