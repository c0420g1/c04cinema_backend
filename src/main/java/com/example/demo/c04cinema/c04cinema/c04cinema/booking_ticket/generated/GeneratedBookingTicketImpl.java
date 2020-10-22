package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.payment.Payment;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.Promotion;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.example.demo.c04cinema.c04cinema.c04cinema.ticket_type.TicketType;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBookingTicketImpl implements BookingTicket {
    
    private int id;
    private String code;
    private Integer showId;
    private Integer ticketTypeId;
    private Integer seatId;
    private Integer promotionId;
    private Integer accountId;
    private Integer paymentId;
    private String contactEmail;
    private String contactPhone;
    private Byte status;
    private Double price;
    private Byte iscancel;
    private Timestamp bookingDate;
    
    protected GeneratedBookingTicketImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getCode() {
        return Optional.ofNullable(code);
    }
    
    @Override
    public OptionalInt getShowId() {
        return OptionalUtil.ofNullable(showId);
    }
    
    @Override
    public OptionalInt getTicketTypeId() {
        return OptionalUtil.ofNullable(ticketTypeId);
    }
    
    @Override
    public OptionalInt getSeatId() {
        return OptionalUtil.ofNullable(seatId);
    }
    
    @Override
    public OptionalInt getPromotionId() {
        return OptionalUtil.ofNullable(promotionId);
    }
    
    @Override
    public OptionalInt getAccountId() {
        return OptionalUtil.ofNullable(accountId);
    }
    
    @Override
    public OptionalInt getPaymentId() {
        return OptionalUtil.ofNullable(paymentId);
    }
    
    @Override
    public Optional<String> getContactEmail() {
        return Optional.ofNullable(contactEmail);
    }
    
    @Override
    public Optional<String> getContactPhone() {
        return Optional.ofNullable(contactPhone);
    }
    
    @Override
    public Optional<Byte> getStatus() {
        return Optional.ofNullable(status);
    }
    
    @Override
    public OptionalDouble getPrice() {
        return OptionalUtil.ofNullable(price);
    }
    
    @Override
    public Optional<Byte> getIscancel() {
        return Optional.ofNullable(iscancel);
    }
    
    @Override
    public Optional<Timestamp> getBookingDate() {
        return Optional.ofNullable(bookingDate);
    }
    
    @Override
    public BookingTicket setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public BookingTicket setCode(String code) {
        this.code = code;
        return this;
    }
    
    @Override
    public BookingTicket setShowId(Integer showId) {
        this.showId = showId;
        return this;
    }
    
    @Override
    public BookingTicket setTicketTypeId(Integer ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
        return this;
    }
    
    @Override
    public BookingTicket setSeatId(Integer seatId) {
        this.seatId = seatId;
        return this;
    }
    
    @Override
    public BookingTicket setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    
    @Override
    public BookingTicket setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @Override
    public BookingTicket setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    @Override
    public BookingTicket setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    
    @Override
    public BookingTicket setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    
    @Override
    public BookingTicket setStatus(Byte status) {
        this.status = status;
        return this;
    }
    
    @Override
    public BookingTicket setPrice(Double price) {
        this.price = price;
        return this;
    }
    
    @Override
    public BookingTicket setIscancel(Byte iscancel) {
        this.iscancel = iscancel;
        return this;
    }
    
    @Override
    public BookingTicket setBookingDate(Timestamp bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }
    
    @Override
    public Optional<Show> findShowId(Manager<Show> foreignManager) {
        if (getShowId().isPresent()) {
            return foreignManager.stream().filter(Show.ID.equal(getShowId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public Optional<TicketType> findTicketTypeId(Manager<TicketType> foreignManager) {
        if (getTicketTypeId().isPresent()) {
            return foreignManager.stream().filter(TicketType.ID.equal(getTicketTypeId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public Optional<Seat> findSeatId(Manager<Seat> foreignManager) {
        if (getSeatId().isPresent()) {
            return foreignManager.stream().filter(Seat.ID.equal(getSeatId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public Optional<Promotion> findPromotionId(Manager<Promotion> foreignManager) {
        if (getPromotionId().isPresent()) {
            return foreignManager.stream().filter(Promotion.ID.equal(getPromotionId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public Optional<Account> findAccountId(Manager<Account> foreignManager) {
        if (getAccountId().isPresent()) {
            return foreignManager.stream().filter(Account.ID.equal(getAccountId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public Optional<Payment> findPaymentId(Manager<Payment> foreignManager) {
        if (getPaymentId().isPresent()) {
            return foreignManager.stream().filter(Payment.ID.equal(getPaymentId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "           + Objects.toString(getId()));
        sj.add("code = "         + Objects.toString(OptionalUtil.unwrap(getCode())));
        sj.add("showId = "       + Objects.toString(OptionalUtil.unwrap(getShowId())));
        sj.add("ticketTypeId = " + Objects.toString(OptionalUtil.unwrap(getTicketTypeId())));
        sj.add("seatId = "       + Objects.toString(OptionalUtil.unwrap(getSeatId())));
        sj.add("promotionId = "  + Objects.toString(OptionalUtil.unwrap(getPromotionId())));
        sj.add("accountId = "    + Objects.toString(OptionalUtil.unwrap(getAccountId())));
        sj.add("paymentId = "    + Objects.toString(OptionalUtil.unwrap(getPaymentId())));
        sj.add("contactEmail = " + Objects.toString(OptionalUtil.unwrap(getContactEmail())));
        sj.add("contactPhone = " + Objects.toString(OptionalUtil.unwrap(getContactPhone())));
        sj.add("status = "       + Objects.toString(OptionalUtil.unwrap(getStatus())));
        sj.add("price = "        + Objects.toString(OptionalUtil.unwrap(getPrice())));
        sj.add("iscancel = "     + Objects.toString(OptionalUtil.unwrap(getIscancel())));
        sj.add("bookingDate = "  + Objects.toString(OptionalUtil.unwrap(getBookingDate())));
        return "BookingTicketImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof BookingTicket)) { return false; }
        final BookingTicket thatBookingTicket = (BookingTicket)that;
        if (this.getId() != thatBookingTicket.getId()) { return false; }
        if (!Objects.equals(this.getCode(), thatBookingTicket.getCode())) { return false; }
        if (!Objects.equals(this.getShowId(), thatBookingTicket.getShowId())) { return false; }
        if (!Objects.equals(this.getTicketTypeId(), thatBookingTicket.getTicketTypeId())) { return false; }
        if (!Objects.equals(this.getSeatId(), thatBookingTicket.getSeatId())) { return false; }
        if (!Objects.equals(this.getPromotionId(), thatBookingTicket.getPromotionId())) { return false; }
        if (!Objects.equals(this.getAccountId(), thatBookingTicket.getAccountId())) { return false; }
        if (!Objects.equals(this.getPaymentId(), thatBookingTicket.getPaymentId())) { return false; }
        if (!Objects.equals(this.getContactEmail(), thatBookingTicket.getContactEmail())) { return false; }
        if (!Objects.equals(this.getContactPhone(), thatBookingTicket.getContactPhone())) { return false; }
        if (!Objects.equals(this.getStatus(), thatBookingTicket.getStatus())) { return false; }
        if (!Objects.equals(this.getPrice(), thatBookingTicket.getPrice())) { return false; }
        if (!Objects.equals(this.getIscancel(), thatBookingTicket.getIscancel())) { return false; }
        if (!Objects.equals(this.getBookingDate(), thatBookingTicket.getBookingDate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCode()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getShowId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTicketTypeId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSeatId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPromotionId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAccountId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPaymentId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getContactEmail()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getContactPhone()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getStatus()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPrice()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getIscancel()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getBookingDate()));
        return hash;
    }
}