package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.HallManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.location.Location;
import com.example.demo.c04cinema.c04cinema.c04cinema.theatre.Theatre;
import com.example.demo.c04cinema.model_dto.BookingTimeDTO;
import com.example.demo.c04cinema.model_dto.ShowDTO;
import com.speedment.common.tuple.Tuple4;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated.GeneratedBookingTicketController;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.example.demo.c04cinema.model_dto.ConfirmTicketDTO;

import static java.util.stream.Collectors.*;


@RestController
public class BookingTicketController extends GeneratedBookingTicketController {
    @Autowired
    private JoinComponent joinComponent;

    @Autowired
    private BookingTicketManager bookingTicketManager;

    @Autowired
    private CustomerManager customerManager;

    @Autowired
    private HallManager hallManager;

    // Get List has Pagination
    @GetMapping("/booking_ticket_dto/{pageNum}")
    public List<BookingTicketDTO> getBookingTicketDTO(@PathVariable int pageNum,
                                                      @RequestParam(defaultValue = "") String search) throws Exception {
        int pageSize =10;
        String tempTest ="";
        try{
            Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .innerJoinOn(Hall.ID).equal(Show.HALL_ID)
                    .build(BookingTicketDTO::new);
            if (tempTest.equals(search)){
                return join.stream().skip((pageNum-1)*pageSize).limit(pageSize)
                        .filter(e-> e.getNameCustomer().contains(search)
                        || e.getBookingCode().contains(search)
                        || e.getCardIdCustomer().contains(search)
                        || e.getPhoneCustomer().contains(search))
                        .collect(toList());
            }
            return join.stream().filter(e-> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).skip((pageNum-1)*pageSize).limit(pageSize).
                    collect(toList());
        }catch (NullPointerException e){
            throw new Exception(e.getMessage());
        } catch (Exception ex){
            throw new Exception("Error get list: "+ex.getMessage());
        }
    }
    // Get List size
    @GetMapping("/booking_ticket_dto")
    public List<BookingTicketDTO> getBookingTicketDTO(@RequestParam(defaultValue = "") String search) throws Exception {

        try{
            Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .innerJoinOn(Hall.ID).equal(Show.HALL_ID)
                    .build(BookingTicketDTO::new);

            List<BookingTicketDTO> res= new ArrayList<>();
            join.stream().filter(e-> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).forEach(e->{
                        if(!res.contains(e))
                            res.add(e);
                    }
            );
            return res;
        } catch (NullPointerException e){
            throw new Exception(e.getMessage());
        } catch (Exception ex){
            throw new Exception("Error get List size: "+ex.getMessage());
        }


    }

    // Confirm Ticket
    @PatchMapping("/confirmTicket/{point}")
    public void confirmTicket(@RequestBody ConfirmTicketDTO confirmTicketDTO,
                              @PathVariable int point){
        try{
            //Tim ra BookingTicket tu ID
            BookingTicket bookingTicket = bookingTicketManager.stream().filter(BookingTicket.ID.equal(confirmTicketDTO
                    .getId())).findFirst().get();
            int showId = bookingTicket.getShowId().getAsInt();
            int accountId = bookingTicket.getAccountId().getAsInt();

            // Tìm ra tất cả các vé có cùng accountId và showId (xem cung 1 xuat chieu)
            // Update lại trạng thái nhận vé
            List<BookingTicket> bookingTicketList = bookingTicketManager.stream()
                    .filter(e-> e.getAccountId().getAsInt() == accountId && e.getShowId().getAsInt() == showId)
                    .collect(toList());
            for (BookingTicket bk: bookingTicketList){
                bk.setStatus((byte) 1);
                bookingTicketManager.update(bk);
            }

            //Update lại điểm thành viên
            Customer customer = customerManager.stream().filter(e-> e.getAccountId().getAsInt() == accountId).findFirst().get();
            customer.setCurrentBonusPoint(customer.getCurrentBonusPoint().getAsInt() - point);
            customerManager.update(customer);

        } catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }

    }

    // qg23
    @GetMapping("/bookingTime/{locationId}")
    public List<BookingTimeDTO> getBookingTime(@PathVariable int locationId, @RequestParam int movieId, @RequestParam String dateShow) {
        Join<Tuple4<Hall, Theatre, Location, Show>> join = joinComponent.from(HallManager.IDENTIFIER).innerJoinOn(Theatre.ID).equal(Hall.THEATRE_ID).where(Theatre.LOCATION_ID.equal(locationId))
                .innerJoinOn(Location.ID).equal(Theatre.LOCATION_ID)
                .innerJoinOn(Show.HALL_ID).equal(Hall.ID).where(Show.MOVIE_ID.equal(movieId)).build(Tuples::of);

        Map<Theatre, List<Show>> res = join.stream().collect(
                groupingBy(Tuple4::get1, mapping(Tuple4::get3, toList()))
        );

        List<BookingTimeDTO> bookingTimeDTOList = new ArrayList<>();
        res.forEach((th, ti) -> {
            int theatreId = th.getId();
            String theatreName = th.getName().get();
            int hallId= ti.stream().findFirst().get().getHallId();
            String hallName= hallManager.stream().filter(Hall.ID.equal(hallId)).findFirst().get().getName().get();
            List<ShowDTO> showDTOList= new ArrayList<>();
            ti.stream().filter(f-> f.getStartTime().get().toString().contains(dateShow)).forEach(s->{
                int id = s.getId();
                String time= s.getStartTime().get().toString();
                double price= s.getPrice().getAsDouble();
                ShowDTO showDTO= new ShowDTO(id,time,price);
                showDTOList.add(showDTO);
            });

            BookingTimeDTO bookingTimeDTO = new BookingTimeDTO(theatreId, theatreName,hallName, showDTOList);
            if(showDTOList.size()>0)
                bookingTimeDTOList.add(bookingTimeDTO);

//            System.out.format("%s -> %s %n",
//                    th.getName(),
//                    ti.stream().map(Show::getHallId).sorted().collect(toList())
//            );
        });

        return bookingTimeDTOList;
    }

    @GetMapping("/bookingUpdateBonus")
    public void bookingUpdateBonus(@RequestParam int cusId, @RequestParam int bonusPoint){
        Customer customer= customerManager.stream().filter(Customer.ID.equal(cusId)).findFirst().get();
        customer.setCurrentBonusPoint(customer.getCurrentBonusPoint().getAsInt()+ bonusPoint);
        customerManager.update(customer);
    }

    // Lấy về số lượng vé, dựa vào accountId và ShowId
    @GetMapping("/getQuantity")
    public List<BookingTicketDTO> getQuantity(@RequestParam int showId,
                                              @RequestParam int accountId){

        Join<BookingTicketDTO> join = joinComponent.from(BookingTicketManager.IDENTIFIER)
                .where(BookingTicket.ACCOUNT_ID.equal(accountId).and(BookingTicket.SHOW_ID.equal(showId)))
                .innerJoinOn(Customer.ACCOUNT_ID).equal(BookingTicket.ACCOUNT_ID)
                .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                .innerJoinOn(Hall.ID).equal(Show.HALL_ID)
                .build(BookingTicketDTO::new);
        return join.stream().collect(toList());
    }
}
