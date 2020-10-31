package com.example.demo.c04cinema.c04cinema.c04cinema.customer;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomer;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.AccountManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.generated.GeneratedCustomerController;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.Promotion;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.common.Error;
import com.example.demo.c04cinema.common.Regex;
import com.example.demo.c04cinema.model_dto.*;
import com.example.demo.c04cinema.model_dto.CustomerDTO;
import com.example.demo.c04cinema.model_dto.CustomerPointDTO;


@RestController
public class CustomerController extends GeneratedCustomerController {
    @Autowired
    private JoinComponent joinComponent;

    @Autowired
    private CustomerManager customerManager;

    @Autowired
    private AccountManager accountManager;

    Regex regex = new Regex();

    //HUỳnh văn Thịnh
    // lấy danh sách thông tin vé theo page
    @GetMapping("/showTickerList/{id}/{pageNum}/{cancel}")
    public List<CustomerDTO> getDTO(@PathVariable int id, @PathVariable int pageNum, @PathVariable byte cancel) {
        try {
            int pageSize = 10;
            Join<CustomerDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                    .where(Account.ID.equal(id))
                    .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID).where((BookingTicket.ISCANCEL).equal(cancel))
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID).build(CustomerDTO::new);
            return join.stream().skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    //HUỳnh văn Thịnh
    // lấy danh sách vé
    @GetMapping("/showTickerListPage/{id}/{cancel}")
    public List<CustomerDTO> getListDTO(@PathVariable int id, @PathVariable byte cancel) {
        try {
            Join<CustomerDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                    .where(Account.ID.equal(id))
                    .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID).where((BookingTicket.ISCANCEL).equal(cancel))
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID).build(CustomerDTO::new);
            return join.stream().collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    //HUỳnh văn Thịnh
    //lấy danh sách điểm đã cộng theo page
    @GetMapping("/showPointPlusList/page/{pageNum}")
    public List<CustomerPointDTO> getPlusPoint(
            @RequestParam("star_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime star_date,
            @RequestParam("end_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end_date
            , @PathVariable int pageNum
            , @RequestParam int id) {
        try {
            int pageSize = 10;
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
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    //HUỳnh văn Thịnh
    // lấy danh sách điểm đã được cộng
    @GetMapping("/showPointPlusList/page")
    public List<CustomerPointDTO> getListPoint(
            @RequestParam("star_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime star_date,
            @RequestParam("end_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end_date
            , @RequestParam int id) {
        try {
            Join<CustomerPointDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                    .where(Account.ID.equal(id))
                    .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID).where(BookingTicket.BOOKING_DATE.between(star_date, end_date)
                            .and(BookingTicket.ACCOUNT_ID.equal(id)))
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .innerJoinOn(SeatType.ID).equal(Seat.SEAT_TYPE_ID)
                    .innerJoinOn(PromoPoint.ID).equal(SeatType.PROMO_POINT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .build(CustomerPointDTO::new);

            return join.stream().collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    //HUỳnh văn Thịnh
    // lấy danh sách điểm đã được sử dụng theo page
    @GetMapping("/showPointUseList/page/{pageNum}")
    public List<CustomerPointUseDTO> getUsePoint(
            @RequestParam("star_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime star_date,
            @RequestParam("end_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end_date
            , @PathVariable int pageNum
            , @RequestParam int id) {
        try {
            int pageSize = 10;
            Join<CustomerPointUseDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                    .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID).where(BookingTicket.BOOKING_DATE.between(star_date, end_date)
                            .and(BookingTicket.ACCOUNT_ID.equal(id)))
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .innerJoinOn(SeatType.ID).equal(Seat.SEAT_TYPE_ID)
                    .innerJoinOn(PromoPoint.ID).equal(SeatType.PROMO_POINT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(Account.ID)
                    .innerJoinOn(PromotionCustomer.CUSTOMER_ID).equal(Customer.ID).where(PromotionCustomer.CUSTOMER_ID.equal(id))
                    .innerJoinOn(Promotion.ID).equal(PromotionCustomer.PROMOTION_ID)
                    .build(CustomerPointUseDTO::new);

            return join.stream().skip((pageNum - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    //HUỳnh văn Thịnh
    // lấy danh sách điểm đã được sử dụng
    @GetMapping("/showPointUseList/page")
    public List<CustomerPointUseDTO> getUsePoint(
            @RequestParam("star_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime star_date,
            @RequestParam("end_date")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end_date
            , @RequestParam int id) {
        try {
            Join<CustomerPointUseDTO> join = joinComponent.from(AccountManager.IDENTIFIER)
                    .innerJoinOn(BookingTicket.ACCOUNT_ID).equal(Account.ID).where(BookingTicket.BOOKING_DATE.between(star_date, end_date))
                    .innerJoinOn(Seat.ID).equal(BookingTicket.SEAT_ID)
                    .innerJoinOn(SeatType.ID).equal(Seat.SEAT_TYPE_ID)
                    .innerJoinOn(PromoPoint.ID).equal(SeatType.PROMO_POINT_ID)
                    .innerJoinOn(Show.ID).equal(BookingTicket.SHOW_ID)
                    .innerJoinOn(Movie.ID).equal(Show.MOVIE_ID)
                    .innerJoinOn(Customer.ACCOUNT_ID).equal(Account.ID)
                    .innerJoinOn(PromotionCustomer.CUSTOMER_ID).equal(Customer.ID).where(PromotionCustomer.CUSTOMER_ID.equal(id))
                    .innerJoinOn(Promotion.ID).equal(PromotionCustomer.PROMOTION_ID)
                    .build(CustomerPointUseDTO::new);
            List<CustomerPointUseDTO> res = new ArrayList<>();
            join.stream().forEach(e -> {
                if (!res.contains(e))
                    res.add(e);
            });
            return res;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    //Huỳnh văn Thịnh
    // update thông tin customer
    @PatchMapping("/editCustomer/{id}")
    public List<Error> postCombo(@RequestBody PathCusDTO customer, @PathVariable int id) {
        try {
            List<Error> errors = new ArrayList<>();
            Customer cus = customerManager.stream().filter(Customer.ID.equal(id)).findFirst().get();

            if (!regex.regexEmail(customer.getEmail())) {
                errors.add(new Error("email", "email invalid format"));
            }
            if (!regex.regexName(customer.getName())) {
                errors.add(new Error("name", "name invalid format"));
            }
            if (!regex.regexGender(customer.getGender())) {
                errors.add(new Error("gender", "gender invalid format"));
            }
            if (!regex.regexCard(customer.getCardid())) {
                errors.add(new Error("card", "card invalid format"));
            }
            if (!regex.regexPhone(customer.getPhone())) {
                errors.add(new Error("phone", "phone invalid format"));
            }
            if (customer.getAddress().length() > 200) {
                errors.add(new Error("add", "add invalid format"));
            }
            if (!(customer.getCode().equals(customer.getCode()))) {
                errors.add(new Error("carDid", "carDid invalid format"));
            }

            cus.setAddress(customer.getAddress());
            cus.setBirthday(customer.getBirthday());
            cus.setCardid(customer.getCardid());
            cus.setEmail(customer.getEmail());
            cus.setGender(customer.getGender());
            cus.setName(customer.getName());
            if (errors.isEmpty()) {
                customerManager.update(cus);
            }
            return errors;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @PatchMapping("/editPassWord/{id}")
    public List<Error> postCombo(@RequestParam(value = "passOld") String passOld, @RequestParam(value = "newPass") String newPass, @PathVariable int id) {
        try {
            List<Error> errors = new ArrayList<>();
//            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//            String newPassEnd = passwordEncoder.encode(newPass);
            Account account = accountManager.stream().filter(Account.ID.equal(id)).findFirst().get();
            if (!(regex.regexPass(newPass))) {
                errors.add(new Error("error", "new Pass not format Abcd1234 !"));
                return errors;
            } else if (account.getPassword().get().equals(passOld)) {
                account.setPassword(newPass);
                accountManager.update(account);
                errors.add(new Error("success", "PassWord update success !"));
            } else {
                errors.add(new Error("error", "password error"));
            }
            return errors;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
