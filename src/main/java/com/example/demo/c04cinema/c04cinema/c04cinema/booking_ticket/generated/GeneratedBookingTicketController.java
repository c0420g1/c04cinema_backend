package com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicket;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.BookingTicketManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.booking_ticket.generated.GeneratedBookingTicket.Identifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.json.Json;
import com.speedment.enterprise.plugins.json.JsonCollectors;
import com.speedment.enterprise.plugins.json.JsonComponent;
import com.speedment.enterprise.plugins.json.JsonEncoder;
import com.speedment.enterprise.plugins.spring.runtime.AbstractFilter;
import com.speedment.enterprise.plugins.spring.runtime.AbstractSort;
import com.speedment.enterprise.plugins.spring.runtime.ControllerUtil;
import com.speedment.runtime.field.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;

import static java.util.stream.Collectors.toList;

/**
 * The default REST controller logic for BookingTicket entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedBookingTicketController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired BookingTicketManager manager;
    protected JsonEncoder<BookingTicket> encoder;
    
    @PostConstruct
    void createBookingTicketEncoder() {
        encoder = jsonComponent.<BookingTicket>emptyEncoder()
            .put("id", BookingTicket.ID)
            .put("code", BookingTicket.CODE)
            .put("showId", BookingTicket.SHOW_ID)
            .put("ticketTypeId", BookingTicket.TICKET_TYPE_ID)
            .put("seatId", BookingTicket.SEAT_ID)
            .put("promotionId", BookingTicket.PROMOTION_ID)
            .put("accountId", BookingTicket.ACCOUNT_ID)
            .put("paymentId", BookingTicket.PAYMENT_ID)
            .put("contactEmail", BookingTicket.CONTACT_EMAIL)
            .put("contactPhone", BookingTicket.CONTACT_PHONE)
            .put("status", BookingTicket.STATUS)
            .put("price", BookingTicket.PRICE)
            .put("iscancel", BookingTicket.ISCANCEL)
            .put("bookingDate", BookingTicket.BOOKING_DATE)
            .build();
    }
    
    @GetMapping(path = "/booking_ticket", produces = "application/json")
    public String get(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return getHelper(
            ControllerUtil.parseFilters(filters, BookingTicketFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, BookingTicketSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/booking_ticket", consumes = "application/json")
    public void create(
            @RequestBody @Validated CreateBody createBody) {
        manager.persist(manager.create()
            .setCode(createBody.getCode())
            .setShowId(createBody.getShowId())
            .setTicketTypeId(createBody.getTicketTypeId())
            .setSeatId(createBody.getSeatId())
            .setPromotionId(createBody.getPromotionId())
            .setAccountId(createBody.getAccountId())
            .setPaymentId(createBody.getPaymentId())
            .setContactEmail(createBody.getContactEmail())
            .setContactPhone(createBody.getContactPhone())
            .setStatus(createBody.getStatus())
            .setPrice(createBody.getPrice())
            .setIscancel(createBody.getIscancel())
            .setBookingDate(createBody.getBookingDate())
        );
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/booking_ticket/{id}", consumes = "application/json")
    public void update(
            @PathVariable(name = "id") int id,
            @RequestBody @Validated UpdateBody updateBody) {
        manager.stream()
            .filter(BookingTicket.ID.equal(id))
            .map(bookingTicket -> {
                bookingTicket.setCode(updateBody.getCode());
                bookingTicket.setShowId(updateBody.getShowId());
                bookingTicket.setTicketTypeId(updateBody.getTicketTypeId());
                bookingTicket.setSeatId(updateBody.getSeatId());
                bookingTicket.setPromotionId(updateBody.getPromotionId());
                bookingTicket.setAccountId(updateBody.getAccountId());
                bookingTicket.setPaymentId(updateBody.getPaymentId());
                bookingTicket.setContactEmail(updateBody.getContactEmail());
                bookingTicket.setContactPhone(updateBody.getContactPhone());
                bookingTicket.setStatus(updateBody.getStatus());
                bookingTicket.setPrice(updateBody.getPrice());
                bookingTicket.setIscancel(updateBody.getIscancel());
                bookingTicket.setBookingDate(updateBody.getBookingDate());
                return bookingTicket;
        }).forEach(manager.updater());
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/booking_ticket/{id}")
    public void delete(
            @PathVariable(name = "id") int id) {
        manager.stream()
            .filter(BookingTicket.ID.equal(id))
            .forEach(manager.remover());
    }
    
    @ExceptionHandler(JsonMappingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMissingValueError() {
        Map<String, Object> error = new HashMap<>();
        error.put("error", "Bad Request");
        error.put("status", 400);
        error.put("message", "Invalid request body: missing required fields");
        
        return Json.toJson(error, true);
    }
    
    @ExceptionHandler(JsonParseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidJsonError() {
        Map<String, Object> error = new HashMap<>();
        error.put("error", "Bad Request");
        error.put("status", 400);
        error.put("message", "Invalid request body: invalid JSON syntax");
        
        return Json.toJson(error, true);
    }
    
    protected final Set<Identifier> parseColumns(String jsonColumnList) {
        try {
            @SuppressWarnings("unchecked")
            final List<String> parsed = (List<String>) Json.fromJson(jsonColumnList);
            final Set<GeneratedBookingTicket.Identifier> result = EnumSet.noneOf(GeneratedBookingTicket.Identifier.class);
            parsed.stream().map(this::parseColumn).forEach(result::add);
            return result;
        } catch (final ClassCastException ex) {
            throw new IllegalArgumentException("Error in parsed JSON.");
        }
    }
    
    protected final Identifier parseColumn(String jsonColumn) {
        switch (jsonColumn) {
            case "id":           return GeneratedBookingTicket.Identifier.ID;
            case "code":         return GeneratedBookingTicket.Identifier.CODE;
            case "showId":       return GeneratedBookingTicket.Identifier.SHOW_ID;
            case "ticketTypeId": return GeneratedBookingTicket.Identifier.TICKET_TYPE_ID;
            case "seatId":       return GeneratedBookingTicket.Identifier.SEAT_ID;
            case "promotionId":  return GeneratedBookingTicket.Identifier.PROMOTION_ID;
            case "accountId":    return GeneratedBookingTicket.Identifier.ACCOUNT_ID;
            case "paymentId":    return GeneratedBookingTicket.Identifier.PAYMENT_ID;
            case "contactEmail": return GeneratedBookingTicket.Identifier.CONTACT_EMAIL;
            case "contactPhone": return GeneratedBookingTicket.Identifier.CONTACT_PHONE;
            case "status":       return GeneratedBookingTicket.Identifier.STATUS;
            case "price":        return GeneratedBookingTicket.Identifier.PRICE;
            case "iscancel":     return GeneratedBookingTicket.Identifier.ISCANCEL;
            case "bookingDate":  return GeneratedBookingTicket.Identifier.BOOKING_DATE;
            default: throw new IllegalArgumentException(
                "Unknown column '" + jsonColumn + "'."
            );
        }
    }
    
    protected final Field<BookingTicket> fieldOf(Identifier columnId) {
        switch (columnId) {
            case ID:             return BookingTicket.ID;
            case CODE:           return BookingTicket.CODE;
            case SHOW_ID:        return BookingTicket.SHOW_ID;
            case TICKET_TYPE_ID: return BookingTicket.TICKET_TYPE_ID;
            case SEAT_ID:        return BookingTicket.SEAT_ID;
            case PROMOTION_ID:   return BookingTicket.PROMOTION_ID;
            case ACCOUNT_ID:     return BookingTicket.ACCOUNT_ID;
            case PAYMENT_ID:     return BookingTicket.PAYMENT_ID;
            case CONTACT_EMAIL:  return BookingTicket.CONTACT_EMAIL;
            case CONTACT_PHONE:  return BookingTicket.CONTACT_PHONE;
            case STATUS:         return BookingTicket.STATUS;
            case PRICE:          return BookingTicket.PRICE;
            case ISCANCEL:       return BookingTicket.ISCANCEL;
            case BOOKING_DATE:   return BookingTicket.BOOKING_DATE;
            default: throw new IllegalArgumentException(
                "Unknown column '" + columnId + "'."
            );
        }
    }
    
    protected String getHelper(
            List<Predicate<BookingTicket>> predicates,
            List<Comparator<BookingTicket>> sorters,
            long start,
            long limit) {
        Stream<BookingTicket> stream = manager.stream();
        
        for (final Predicate<BookingTicket> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<BookingTicket>> comparator = sorters.stream()
                .reduce(Comparator::thenComparing);
            
            stream = stream.sorted(comparator.get());
        }
        
        return stream
            .skip(start)
            .limit(limit)
            .collect(JsonCollectors.toList(encoder));
    }
    
    /**
     * How to filter the results from the controller. This class is designed to
     * be deserialized automatically from JSON.
     */
    public static final class BookingTicketFilter extends AbstractFilter<BookingTicket> {
        
        public BookingTicketFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<BookingTicket> toPredicate() {
            switch (property()) {
                case "id" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.ID.equal(v);
                        case "ne"   : return BookingTicket.ID.notEqual(v);
                        case "lt"   : return BookingTicket.ID.lessThan(v);
                        case "le"   : return BookingTicket.ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.ID.greaterThan(v);
                        case "ge"   : return BookingTicket.ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.id."
                        );
                    }
                }
                case "code" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return BookingTicket.CODE.equal(v);
                        case "ne"   : return BookingTicket.CODE.notEqual(v);
                        case "lt"   : return BookingTicket.CODE.lessThan(v);
                        case "le"   : return BookingTicket.CODE.lessOrEqual(v);
                        case "gt"   : return BookingTicket.CODE.greaterThan(v);
                        case "ge"   : return BookingTicket.CODE.greaterOrEqual(v);
                        case "like" : return BookingTicket.CODE.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.code."
                        );
                    }
                }
                case "showId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.SHOW_ID.equal(v);
                        case "ne"   : return BookingTicket.SHOW_ID.notEqual(v);
                        case "lt"   : return BookingTicket.SHOW_ID.lessThan(v);
                        case "le"   : return BookingTicket.SHOW_ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.SHOW_ID.greaterThan(v);
                        case "ge"   : return BookingTicket.SHOW_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.showId."
                        );
                    }
                }
                case "ticketTypeId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.TICKET_TYPE_ID.equal(v);
                        case "ne"   : return BookingTicket.TICKET_TYPE_ID.notEqual(v);
                        case "lt"   : return BookingTicket.TICKET_TYPE_ID.lessThan(v);
                        case "le"   : return BookingTicket.TICKET_TYPE_ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.TICKET_TYPE_ID.greaterThan(v);
                        case "ge"   : return BookingTicket.TICKET_TYPE_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.ticketTypeId."
                        );
                    }
                }
                case "seatId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.SEAT_ID.equal(v);
                        case "ne"   : return BookingTicket.SEAT_ID.notEqual(v);
                        case "lt"   : return BookingTicket.SEAT_ID.lessThan(v);
                        case "le"   : return BookingTicket.SEAT_ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.SEAT_ID.greaterThan(v);
                        case "ge"   : return BookingTicket.SEAT_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.seatId."
                        );
                    }
                }
                case "promotionId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.PROMOTION_ID.equal(v);
                        case "ne"   : return BookingTicket.PROMOTION_ID.notEqual(v);
                        case "lt"   : return BookingTicket.PROMOTION_ID.lessThan(v);
                        case "le"   : return BookingTicket.PROMOTION_ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.PROMOTION_ID.greaterThan(v);
                        case "ge"   : return BookingTicket.PROMOTION_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.promotionId."
                        );
                    }
                }
                case "accountId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.ACCOUNT_ID.equal(v);
                        case "ne"   : return BookingTicket.ACCOUNT_ID.notEqual(v);
                        case "lt"   : return BookingTicket.ACCOUNT_ID.lessThan(v);
                        case "le"   : return BookingTicket.ACCOUNT_ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.ACCOUNT_ID.greaterThan(v);
                        case "ge"   : return BookingTicket.ACCOUNT_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.accountId."
                        );
                    }
                }
                case "paymentId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.PAYMENT_ID.equal(v);
                        case "ne"   : return BookingTicket.PAYMENT_ID.notEqual(v);
                        case "lt"   : return BookingTicket.PAYMENT_ID.lessThan(v);
                        case "le"   : return BookingTicket.PAYMENT_ID.lessOrEqual(v);
                        case "gt"   : return BookingTicket.PAYMENT_ID.greaterThan(v);
                        case "ge"   : return BookingTicket.PAYMENT_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.paymentId."
                        );
                    }
                }
                case "contactEmail" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return BookingTicket.CONTACT_EMAIL.equal(v);
                        case "ne"   : return BookingTicket.CONTACT_EMAIL.notEqual(v);
                        case "lt"   : return BookingTicket.CONTACT_EMAIL.lessThan(v);
                        case "le"   : return BookingTicket.CONTACT_EMAIL.lessOrEqual(v);
                        case "gt"   : return BookingTicket.CONTACT_EMAIL.greaterThan(v);
                        case "ge"   : return BookingTicket.CONTACT_EMAIL.greaterOrEqual(v);
                        case "like" : return BookingTicket.CONTACT_EMAIL.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.contactEmail."
                        );
                    }
                }
                case "contactPhone" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return BookingTicket.CONTACT_PHONE.equal(v);
                        case "ne"   : return BookingTicket.CONTACT_PHONE.notEqual(v);
                        case "lt"   : return BookingTicket.CONTACT_PHONE.lessThan(v);
                        case "le"   : return BookingTicket.CONTACT_PHONE.lessOrEqual(v);
                        case "gt"   : return BookingTicket.CONTACT_PHONE.greaterThan(v);
                        case "ge"   : return BookingTicket.CONTACT_PHONE.greaterOrEqual(v);
                        case "like" : return BookingTicket.CONTACT_PHONE.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.contactPhone."
                        );
                    }
                }
                case "status" : {
                    final Byte v = Byte.parseByte(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.STATUS.equal(v);
                        case "ne"   : return BookingTicket.STATUS.notEqual(v);
                        case "lt"   : return BookingTicket.STATUS.lessThan(v);
                        case "le"   : return BookingTicket.STATUS.lessOrEqual(v);
                        case "gt"   : return BookingTicket.STATUS.greaterThan(v);
                        case "ge"   : return BookingTicket.STATUS.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.status."
                        );
                    }
                }
                case "price" : {
                    final Double v = Double.parseDouble(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.PRICE.equal(v);
                        case "ne"   : return BookingTicket.PRICE.notEqual(v);
                        case "lt"   : return BookingTicket.PRICE.lessThan(v);
                        case "le"   : return BookingTicket.PRICE.lessOrEqual(v);
                        case "gt"   : return BookingTicket.PRICE.greaterThan(v);
                        case "ge"   : return BookingTicket.PRICE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.price."
                        );
                    }
                }
                case "iscancel" : {
                    final Byte v = Byte.parseByte(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.ISCANCEL.equal(v);
                        case "ne"   : return BookingTicket.ISCANCEL.notEqual(v);
                        case "lt"   : return BookingTicket.ISCANCEL.lessThan(v);
                        case "le"   : return BookingTicket.ISCANCEL.lessOrEqual(v);
                        case "gt"   : return BookingTicket.ISCANCEL.greaterThan(v);
                        case "ge"   : return BookingTicket.ISCANCEL.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.iscancel."
                        );
                    }
                }
                case "bookingDate" : {
                    final LocalDateTime v = LocalDateTime.parse(value());
                    switch (operator()) {
                        case "eq"   : return BookingTicket.BOOKING_DATE.equal(v);
                        case "ne"   : return BookingTicket.BOOKING_DATE.notEqual(v);
                        case "lt"   : return BookingTicket.BOOKING_DATE.lessThan(v);
                        case "le"   : return BookingTicket.BOOKING_DATE.lessOrEqual(v);
                        case "gt"   : return BookingTicket.BOOKING_DATE.greaterThan(v);
                        case "ge"   : return BookingTicket.BOOKING_DATE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "BookingTicket.bookingDate."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid BookingTicket property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class BookingTicketSort extends AbstractSort<BookingTicket> {
        
        public BookingTicketSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<BookingTicket> toComparator() {
            final Comparator<BookingTicket> comparator;
            switch (property()) {
                case "id"           : comparator = BookingTicket.ID.comparator();             break;
                case "code"         : comparator = BookingTicket.CODE.comparator();           break;
                case "showId"       : comparator = BookingTicket.SHOW_ID.comparator();        break;
                case "ticketTypeId" : comparator = BookingTicket.TICKET_TYPE_ID.comparator(); break;
                case "seatId"       : comparator = BookingTicket.SEAT_ID.comparator();        break;
                case "promotionId"  : comparator = BookingTicket.PROMOTION_ID.comparator();   break;
                case "accountId"    : comparator = BookingTicket.ACCOUNT_ID.comparator();     break;
                case "paymentId"    : comparator = BookingTicket.PAYMENT_ID.comparator();     break;
                case "contactEmail" : comparator = BookingTicket.CONTACT_EMAIL.comparator();  break;
                case "contactPhone" : comparator = BookingTicket.CONTACT_PHONE.comparator();  break;
                case "status"       : comparator = BookingTicket.STATUS.comparator();         break;
                case "price"        : comparator = BookingTicket.PRICE.comparator();          break;
                case "iscancel"     : comparator = BookingTicket.ISCANCEL.comparator();       break;
                case "bookingDate"  : comparator = BookingTicket.BOOKING_DATE.comparator();   break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid BookingTicket property."
                );
            }
            
            switch (direction()) {
                case "ASC"  : return comparator;
                case "DESC" : return comparator.reversed();
                default : throw new IllegalArgumentException(
                    "'" + direction() + "' is not a valid sort direction. " +
                    "Use either 'ASC' or 'DESC', or leave out."
                );
            }
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class CreateBody {
        
        private final String code;
        private final Integer showId;
        private final Integer ticketTypeId;
        private final Integer seatId;
        private final Integer promotionId;
        private final Integer accountId;
        private final Integer paymentId;
        private final String contactEmail;
        private final String contactPhone;
        private final Byte status;
        private final Double price;
        private final Byte iscancel;
        private final LocalDateTime bookingDate;
        
        @JsonCreator
        public CreateBody(
                @JsonProperty("code") String code,
                @JsonProperty("showId") Integer showId,
                @JsonProperty("ticketTypeId") Integer ticketTypeId,
                @JsonProperty("seatId") Integer seatId,
                @JsonProperty("promotionId") Integer promotionId,
                @JsonProperty("accountId") Integer accountId,
                @JsonProperty("paymentId") Integer paymentId,
                @JsonProperty("contactEmail") String contactEmail,
                @JsonProperty("contactPhone") String contactPhone,
                @JsonProperty("status") Byte status,
                @JsonProperty("price") Double price,
                @JsonProperty("iscancel") Byte iscancel,
                @JsonProperty("bookingDate") LocalDateTime bookingDate) {
            this.code = Objects.requireNonNull(code, "`code` is required");
            this.showId = Objects.requireNonNull(showId, "`showId` is required");
            this.ticketTypeId = Objects.requireNonNull(ticketTypeId, "`ticketTypeId` is required");
            this.seatId = Objects.requireNonNull(seatId, "`seatId` is required");
            this.promotionId = Objects.requireNonNull(promotionId, "`promotionId` is required");
            this.accountId = Objects.requireNonNull(accountId, "`accountId` is required");
            this.paymentId = Objects.requireNonNull(paymentId, "`paymentId` is required");
            this.contactEmail = Objects.requireNonNull(contactEmail, "`contactEmail` is required");
            this.contactPhone = Objects.requireNonNull(contactPhone, "`contactPhone` is required");
            this.status = Objects.requireNonNull(status, "`status` is required");
            this.price = Objects.requireNonNull(price, "`price` is required");
            this.iscancel = Objects.requireNonNull(iscancel, "`iscancel` is required");
            this.bookingDate = Objects.requireNonNull(bookingDate, "`bookingDate` is required");
        }
        
        public String getCode() {
            return this.code;
        }
        
        public Integer getShowId() {
            return this.showId;
        }
        
        public Integer getTicketTypeId() {
            return this.ticketTypeId;
        }
        
        public Integer getSeatId() {
            return this.seatId;
        }
        
        public Integer getPromotionId() {
            return this.promotionId;
        }
        
        public Integer getAccountId() {
            return this.accountId;
        }
        
        public Integer getPaymentId() {
            return this.paymentId;
        }
        
        public String getContactEmail() {
            return this.contactEmail;
        }
        
        public String getContactPhone() {
            return this.contactPhone;
        }
        
        public Byte getStatus() {
            return this.status;
        }
        
        public Double getPrice() {
            return this.price;
        }
        
        public Byte getIscancel() {
            return this.iscancel;
        }
        
        public LocalDateTime getBookingDate() {
            return this.bookingDate;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class UpdateBody {
        
        private final String code;
        private final Integer showId;
        private final Integer ticketTypeId;
        private final Integer seatId;
        private final Integer promotionId;
        private final Integer accountId;
        private final Integer paymentId;
        private final String contactEmail;
        private final String contactPhone;
        private final Byte status;
        private final Double price;
        private final Byte iscancel;
        private final LocalDateTime bookingDate;
        
        @JsonCreator
        public UpdateBody(
                @JsonProperty("code") String code,
                @JsonProperty("showId") Integer showId,
                @JsonProperty("ticketTypeId") Integer ticketTypeId,
                @JsonProperty("seatId") Integer seatId,
                @JsonProperty("promotionId") Integer promotionId,
                @JsonProperty("accountId") Integer accountId,
                @JsonProperty("paymentId") Integer paymentId,
                @JsonProperty("contactEmail") String contactEmail,
                @JsonProperty("contactPhone") String contactPhone,
                @JsonProperty("status") Byte status,
                @JsonProperty("price") Double price,
                @JsonProperty("iscancel") Byte iscancel,
                @JsonProperty("bookingDate") LocalDateTime bookingDate) {
            this.code = code;
            this.showId = showId;
            this.ticketTypeId = ticketTypeId;
            this.seatId = seatId;
            this.promotionId = promotionId;
            this.accountId = accountId;
            this.paymentId = paymentId;
            this.contactEmail = contactEmail;
            this.contactPhone = contactPhone;
            this.status = status;
            this.price = price;
            this.iscancel = iscancel;
            this.bookingDate = bookingDate;
        }
        
        public String getCode() {
            return this.code;
        }
        
        public Integer getShowId() {
            return this.showId;
        }
        
        public Integer getTicketTypeId() {
            return this.ticketTypeId;
        }
        
        public Integer getSeatId() {
            return this.seatId;
        }
        
        public Integer getPromotionId() {
            return this.promotionId;
        }
        
        public Integer getAccountId() {
            return this.accountId;
        }
        
        public Integer getPaymentId() {
            return this.paymentId;
        }
        
        public String getContactEmail() {
            return this.contactEmail;
        }
        
        public String getContactPhone() {
            return this.contactPhone;
        }
        
        public Byte getStatus() {
            return this.status;
        }
        
        public Double getPrice() {
            return this.price;
        }
        
        public Byte getIscancel() {
            return this.iscancel;
        }
        
        public LocalDateTime getBookingDate() {
            return this.bookingDate;
        }
    }
}