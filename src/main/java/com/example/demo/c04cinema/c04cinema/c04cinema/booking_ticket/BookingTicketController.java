package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
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
import com.example.demo.c04cinema.model_dto.BookingTicketDTO;
import com.example.demo.c04cinema.model_dto.ConfirmTicketDTO;



@RestController
public class BookingTicketController extends GeneratedBookingTicketController {
    @Autowired
    private JoinComponent joinComponent;

    @Autowired
    private BookingTicketManager bookingTicketManager;

    @Autowired
    private CustomerManager customerManager;

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
                        .collect(Collectors.toList());
            }
            return join.stream().filter(e-> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).skip((pageNum-1)*pageSize).limit(pageSize).
                    collect(Collectors.toList());
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
            return join.stream().filter(e-> e.getNameCustomer().contains(search)
                    || e.getBookingCode().contains(search) || e.getCardIdCustomer().contains(search)
                    || e.getPhoneCustomer().contains(search)).collect(Collectors.toList());
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
                    .collect(Collectors.toList());
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
        return join.stream().collect(Collectors.toList());

    }
}
