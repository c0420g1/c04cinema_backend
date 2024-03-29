package com.example.demo.c04cinema.c04cinema.c04cinema.customer.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.generated.GeneratedCustomer.Identifier;
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

import java.sql.Date;
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
 * The default REST controller logic for Customer entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedCustomerController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired CustomerManager manager;
    protected JsonEncoder<Customer> encoder;
    
    @PostConstruct
    void createCustomerEncoder() {
        encoder = jsonComponent.<Customer>emptyEncoder()
            .put("id", Customer.ID)
            .put("name", Customer.NAME)
            .put("address", Customer.ADDRESS)
            .put("customerTypeId", Customer.CUSTOMER_TYPE_ID)
            .put("currentBonusPoint", Customer.CURRENT_BONUS_POINT)
            .put("accountId", Customer.ACCOUNT_ID)
            .put("email", Customer.EMAIL)
            .put("birthday", Customer.BIRTHDAY)
            .put("phone", Customer.PHONE)
            .put("isactive", Customer.ISACTIVE)
            .put("gender", Customer.GENDER)
            .put("cardid", Customer.CARDID)
            .put("code", Customer.CODE)
            .put("imageUrl", Customer.IMAGE_URL)
            .build();
    }
    
    @GetMapping(path = "/customer", produces = "application/json")
    public String get(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return getHelper(
            ControllerUtil.parseFilters(filters, CustomerFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, CustomerSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/customer", consumes = "application/json")
    public void create(
            @RequestBody @Validated CreateBody createBody) {
        manager.persist(manager.create()
            .setName(createBody.getName())
            .setAddress(createBody.getAddress())
            .setCustomerTypeId(createBody.getCustomerTypeId())
            .setCurrentBonusPoint(createBody.getCurrentBonusPoint())
            .setAccountId(createBody.getAccountId())
            .setEmail(createBody.getEmail())
            .setBirthday(createBody.getBirthday())
            .setPhone(createBody.getPhone())
            .setIsactive(createBody.getIsactive())
            .setGender(createBody.getGender())
            .setCardid(createBody.getCardid())
            .setCode(createBody.getCode())
            .setImageUrl(createBody.getImageUrl())
        );
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/customer/{id}", consumes = "application/json")
    public void update(
            @PathVariable(name = "id") int id,
            @RequestBody @Validated UpdateBody updateBody) {
        manager.stream()
            .filter(Customer.ID.equal(id))
            .map(customer -> {
                customer.setName(updateBody.getName());
                customer.setAddress(updateBody.getAddress());
                customer.setCustomerTypeId(updateBody.getCustomerTypeId());
                customer.setCurrentBonusPoint(updateBody.getCurrentBonusPoint());
                customer.setAccountId(updateBody.getAccountId());
                customer.setEmail(updateBody.getEmail());
                customer.setBirthday(updateBody.getBirthday());
                customer.setPhone(updateBody.getPhone());
                customer.setIsactive(updateBody.getIsactive());
                customer.setGender(updateBody.getGender());
                customer.setCardid(updateBody.getCardid());
                customer.setCode(updateBody.getCode());
                customer.setImageUrl(updateBody.getImageUrl());
                return customer;
        }).forEach(manager.updater());
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/customer/{id}")
    public void delete(
            @PathVariable(name = "id") int id) {
        manager.stream()
            .filter(Customer.ID.equal(id))
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
            final Set<GeneratedCustomer.Identifier> result = EnumSet.noneOf(GeneratedCustomer.Identifier.class);
            parsed.stream().map(this::parseColumn).forEach(result::add);
            return result;
        } catch (final ClassCastException ex) {
            throw new IllegalArgumentException("Error in parsed JSON.");
        }
    }
    
    protected final Identifier parseColumn(String jsonColumn) {
        switch (jsonColumn) {
            case "id":                return GeneratedCustomer.Identifier.ID;
            case "name":              return GeneratedCustomer.Identifier.NAME;
            case "address":           return GeneratedCustomer.Identifier.ADDRESS;
            case "customerTypeId":    return GeneratedCustomer.Identifier.CUSTOMER_TYPE_ID;
            case "currentBonusPoint": return GeneratedCustomer.Identifier.CURRENT_BONUS_POINT;
            case "accountId":         return GeneratedCustomer.Identifier.ACCOUNT_ID;
            case "email":             return GeneratedCustomer.Identifier.EMAIL;
            case "birthday":          return GeneratedCustomer.Identifier.BIRTHDAY;
            case "phone":             return GeneratedCustomer.Identifier.PHONE;
            case "isactive":          return GeneratedCustomer.Identifier.ISACTIVE;
            case "gender":            return GeneratedCustomer.Identifier.GENDER;
            case "cardid":            return GeneratedCustomer.Identifier.CARDID;
            case "code":              return GeneratedCustomer.Identifier.CODE;
            case "imageUrl":          return GeneratedCustomer.Identifier.IMAGE_URL;
            default: throw new IllegalArgumentException(
                "Unknown column '" + jsonColumn + "'."
            );
        }
    }
    
    protected final Field<Customer> fieldOf(Identifier columnId) {
        switch (columnId) {
            case ID:                  return Customer.ID;
            case NAME:                return Customer.NAME;
            case ADDRESS:             return Customer.ADDRESS;
            case CUSTOMER_TYPE_ID:    return Customer.CUSTOMER_TYPE_ID;
            case CURRENT_BONUS_POINT: return Customer.CURRENT_BONUS_POINT;
            case ACCOUNT_ID:          return Customer.ACCOUNT_ID;
            case EMAIL:               return Customer.EMAIL;
            case BIRTHDAY:            return Customer.BIRTHDAY;
            case PHONE:               return Customer.PHONE;
            case ISACTIVE:            return Customer.ISACTIVE;
            case GENDER:              return Customer.GENDER;
            case CARDID:              return Customer.CARDID;
            case CODE:                return Customer.CODE;
            case IMAGE_URL:           return Customer.IMAGE_URL;
            default: throw new IllegalArgumentException(
                "Unknown column '" + columnId + "'."
            );
        }
    }
    
    protected String getHelper(
            List<Predicate<Customer>> predicates,
            List<Comparator<Customer>> sorters,
            long start,
            long limit) {
        Stream<Customer> stream = manager.stream();
        
        for (final Predicate<Customer> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<Customer>> comparator = sorters.stream()
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
    public static final class CustomerFilter extends AbstractFilter<Customer> {
        
        public CustomerFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<Customer> toPredicate() {
            switch (property()) {
                case "id" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Customer.ID.equal(v);
                        case "ne"   : return Customer.ID.notEqual(v);
                        case "lt"   : return Customer.ID.lessThan(v);
                        case "le"   : return Customer.ID.lessOrEqual(v);
                        case "gt"   : return Customer.ID.greaterThan(v);
                        case "ge"   : return Customer.ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.id."
                        );
                    }
                }
                case "name" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.NAME.equal(v);
                        case "ne"   : return Customer.NAME.notEqual(v);
                        case "lt"   : return Customer.NAME.lessThan(v);
                        case "le"   : return Customer.NAME.lessOrEqual(v);
                        case "gt"   : return Customer.NAME.greaterThan(v);
                        case "ge"   : return Customer.NAME.greaterOrEqual(v);
                        case "like" : return Customer.NAME.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.name."
                        );
                    }
                }
                case "address" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.ADDRESS.equal(v);
                        case "ne"   : return Customer.ADDRESS.notEqual(v);
                        case "lt"   : return Customer.ADDRESS.lessThan(v);
                        case "le"   : return Customer.ADDRESS.lessOrEqual(v);
                        case "gt"   : return Customer.ADDRESS.greaterThan(v);
                        case "ge"   : return Customer.ADDRESS.greaterOrEqual(v);
                        case "like" : return Customer.ADDRESS.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.address."
                        );
                    }
                }
                case "customerTypeId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Customer.CUSTOMER_TYPE_ID.equal(v);
                        case "ne"   : return Customer.CUSTOMER_TYPE_ID.notEqual(v);
                        case "lt"   : return Customer.CUSTOMER_TYPE_ID.lessThan(v);
                        case "le"   : return Customer.CUSTOMER_TYPE_ID.lessOrEqual(v);
                        case "gt"   : return Customer.CUSTOMER_TYPE_ID.greaterThan(v);
                        case "ge"   : return Customer.CUSTOMER_TYPE_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.customerTypeId."
                        );
                    }
                }
                case "currentBonusPoint" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Customer.CURRENT_BONUS_POINT.equal(v);
                        case "ne"   : return Customer.CURRENT_BONUS_POINT.notEqual(v);
                        case "lt"   : return Customer.CURRENT_BONUS_POINT.lessThan(v);
                        case "le"   : return Customer.CURRENT_BONUS_POINT.lessOrEqual(v);
                        case "gt"   : return Customer.CURRENT_BONUS_POINT.greaterThan(v);
                        case "ge"   : return Customer.CURRENT_BONUS_POINT.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.currentBonusPoint."
                        );
                    }
                }
                case "accountId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Customer.ACCOUNT_ID.equal(v);
                        case "ne"   : return Customer.ACCOUNT_ID.notEqual(v);
                        case "lt"   : return Customer.ACCOUNT_ID.lessThan(v);
                        case "le"   : return Customer.ACCOUNT_ID.lessOrEqual(v);
                        case "gt"   : return Customer.ACCOUNT_ID.greaterThan(v);
                        case "ge"   : return Customer.ACCOUNT_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.accountId."
                        );
                    }
                }
                case "email" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.EMAIL.equal(v);
                        case "ne"   : return Customer.EMAIL.notEqual(v);
                        case "lt"   : return Customer.EMAIL.lessThan(v);
                        case "le"   : return Customer.EMAIL.lessOrEqual(v);
                        case "gt"   : return Customer.EMAIL.greaterThan(v);
                        case "ge"   : return Customer.EMAIL.greaterOrEqual(v);
                        case "like" : return Customer.EMAIL.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.email."
                        );
                    }
                }
                case "birthday" : {
                    final Date v = Date.valueOf(value());
                    switch (operator()) {
                        case "eq"   : return Customer.BIRTHDAY.equal(v);
                        case "ne"   : return Customer.BIRTHDAY.notEqual(v);
                        case "lt"   : return Customer.BIRTHDAY.lessThan(v);
                        case "le"   : return Customer.BIRTHDAY.lessOrEqual(v);
                        case "gt"   : return Customer.BIRTHDAY.greaterThan(v);
                        case "ge"   : return Customer.BIRTHDAY.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.birthday."
                        );
                    }
                }
                case "phone" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.PHONE.equal(v);
                        case "ne"   : return Customer.PHONE.notEqual(v);
                        case "lt"   : return Customer.PHONE.lessThan(v);
                        case "le"   : return Customer.PHONE.lessOrEqual(v);
                        case "gt"   : return Customer.PHONE.greaterThan(v);
                        case "ge"   : return Customer.PHONE.greaterOrEqual(v);
                        case "like" : return Customer.PHONE.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.phone."
                        );
                    }
                }
                case "isactive" : {
                    final Byte v = Byte.parseByte(value());
                    switch (operator()) {
                        case "eq"   : return Customer.ISACTIVE.equal(v);
                        case "ne"   : return Customer.ISACTIVE.notEqual(v);
                        case "lt"   : return Customer.ISACTIVE.lessThan(v);
                        case "le"   : return Customer.ISACTIVE.lessOrEqual(v);
                        case "gt"   : return Customer.ISACTIVE.greaterThan(v);
                        case "ge"   : return Customer.ISACTIVE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.isactive."
                        );
                    }
                }
                case "gender" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.GENDER.equal(v);
                        case "ne"   : return Customer.GENDER.notEqual(v);
                        case "lt"   : return Customer.GENDER.lessThan(v);
                        case "le"   : return Customer.GENDER.lessOrEqual(v);
                        case "gt"   : return Customer.GENDER.greaterThan(v);
                        case "ge"   : return Customer.GENDER.greaterOrEqual(v);
                        case "like" : return Customer.GENDER.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.gender."
                        );
                    }
                }
                case "cardid" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.CARDID.equal(v);
                        case "ne"   : return Customer.CARDID.notEqual(v);
                        case "lt"   : return Customer.CARDID.lessThan(v);
                        case "le"   : return Customer.CARDID.lessOrEqual(v);
                        case "gt"   : return Customer.CARDID.greaterThan(v);
                        case "ge"   : return Customer.CARDID.greaterOrEqual(v);
                        case "like" : return Customer.CARDID.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.cardid."
                        );
                    }
                }
                case "code" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.CODE.equal(v);
                        case "ne"   : return Customer.CODE.notEqual(v);
                        case "lt"   : return Customer.CODE.lessThan(v);
                        case "le"   : return Customer.CODE.lessOrEqual(v);
                        case "gt"   : return Customer.CODE.greaterThan(v);
                        case "ge"   : return Customer.CODE.greaterOrEqual(v);
                        case "like" : return Customer.CODE.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.code."
                        );
                    }
                }
                case "imageUrl" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Customer.IMAGE_URL.equal(v);
                        case "ne"   : return Customer.IMAGE_URL.notEqual(v);
                        case "lt"   : return Customer.IMAGE_URL.lessThan(v);
                        case "le"   : return Customer.IMAGE_URL.lessOrEqual(v);
                        case "gt"   : return Customer.IMAGE_URL.greaterThan(v);
                        case "ge"   : return Customer.IMAGE_URL.greaterOrEqual(v);
                        case "like" : return Customer.IMAGE_URL.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Customer.imageUrl."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Customer property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class CustomerSort extends AbstractSort<Customer> {
        
        public CustomerSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<Customer> toComparator() {
            final Comparator<Customer> comparator;
            switch (property()) {
                case "id"                : comparator = Customer.ID.comparator();                  break;
                case "name"              : comparator = Customer.NAME.comparator();                break;
                case "address"           : comparator = Customer.ADDRESS.comparator();             break;
                case "customerTypeId"    : comparator = Customer.CUSTOMER_TYPE_ID.comparator();    break;
                case "currentBonusPoint" : comparator = Customer.CURRENT_BONUS_POINT.comparator(); break;
                case "accountId"         : comparator = Customer.ACCOUNT_ID.comparator();          break;
                case "email"             : comparator = Customer.EMAIL.comparator();               break;
                case "birthday"          : comparator = Customer.BIRTHDAY.comparator();            break;
                case "phone"             : comparator = Customer.PHONE.comparator();               break;
                case "isactive"          : comparator = Customer.ISACTIVE.comparator();            break;
                case "gender"            : comparator = Customer.GENDER.comparator();              break;
                case "cardid"            : comparator = Customer.CARDID.comparator();              break;
                case "code"              : comparator = Customer.CODE.comparator();                break;
                case "imageUrl"          : comparator = Customer.IMAGE_URL.comparator();           break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Customer property."
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
        
        private final String name;
        private final String address;
        private final Integer customerTypeId;
        private final Integer currentBonusPoint;
        private final Integer accountId;
        private final String email;
        private final Date birthday;
        private final String phone;
        private final Byte isactive;
        private final String gender;
        private final String cardid;
        private final String code;
        private final String imageUrl;
        
        @JsonCreator
        public CreateBody(
                @JsonProperty("name") String name,
                @JsonProperty("address") String address,
                @JsonProperty("customerTypeId") Integer customerTypeId,
                @JsonProperty("currentBonusPoint") Integer currentBonusPoint,
                @JsonProperty("accountId") Integer accountId,
                @JsonProperty("email") String email,
                @JsonProperty("birthday") Date birthday,
                @JsonProperty("phone") String phone,
                @JsonProperty("isactive") Byte isactive,
                @JsonProperty("gender") String gender,
                @JsonProperty("cardid") String cardid,
                @JsonProperty("code") String code,
                @JsonProperty("imageUrl") String imageUrl) {
            this.name = Objects.requireNonNull(name, "`name` is required");
            this.address = Objects.requireNonNull(address, "`address` is required");
            this.customerTypeId = Objects.requireNonNull(customerTypeId, "`customerTypeId` is required");
            this.currentBonusPoint = Objects.requireNonNull(currentBonusPoint, "`currentBonusPoint` is required");
            this.accountId = Objects.requireNonNull(accountId, "`accountId` is required");
            this.email = Objects.requireNonNull(email, "`email` is required");
            this.birthday = Objects.requireNonNull(birthday, "`birthday` is required");
            this.phone = Objects.requireNonNull(phone, "`phone` is required");
            this.isactive = Objects.requireNonNull(isactive, "`isactive` is required");
            this.gender = Objects.requireNonNull(gender, "`gender` is required");
            this.cardid = Objects.requireNonNull(cardid, "`cardid` is required");
            this.code = Objects.requireNonNull(code, "`code` is required");
            this.imageUrl = Objects.requireNonNull(imageUrl, "`imageUrl` is required");
        }
        
        public String getName() {
            return this.name;
        }
        
        public String getAddress() {
            return this.address;
        }
        
        public Integer getCustomerTypeId() {
            return this.customerTypeId;
        }
        
        public Integer getCurrentBonusPoint() {
            return this.currentBonusPoint;
        }
        
        public Integer getAccountId() {
            return this.accountId;
        }
        
        public String getEmail() {
            return this.email;
        }
        
        public Date getBirthday() {
            return this.birthday;
        }
        
        public String getPhone() {
            return this.phone;
        }
        
        public Byte getIsactive() {
            return this.isactive;
        }
        
        public String getGender() {
            return this.gender;
        }
        
        public String getCardid() {
            return this.cardid;
        }
        
        public String getCode() {
            return this.code;
        }
        
        public String getImageUrl() {
            return this.imageUrl;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class UpdateBody {
        
        private final String name;
        private final String address;
        private final Integer customerTypeId;
        private final Integer currentBonusPoint;
        private final Integer accountId;
        private final String email;
        private final Date birthday;
        private final String phone;
        private final Byte isactive;
        private final String gender;
        private final String cardid;
        private final String code;
        private final String imageUrl;
        
        @JsonCreator
        public UpdateBody(
                @JsonProperty("name") String name,
                @JsonProperty("address") String address,
                @JsonProperty("customerTypeId") Integer customerTypeId,
                @JsonProperty("currentBonusPoint") Integer currentBonusPoint,
                @JsonProperty("accountId") Integer accountId,
                @JsonProperty("email") String email,
                @JsonProperty("birthday") Date birthday,
                @JsonProperty("phone") String phone,
                @JsonProperty("isactive") Byte isactive,
                @JsonProperty("gender") String gender,
                @JsonProperty("cardid") String cardid,
                @JsonProperty("code") String code,
                @JsonProperty("imageUrl") String imageUrl) {
            this.name = Objects.requireNonNull(name, "`name` is required");
            this.address = Objects.requireNonNull(address, "`address` is required");
            this.customerTypeId = Objects.requireNonNull(customerTypeId, "`customerTypeId` is required");
            this.currentBonusPoint = Objects.requireNonNull(currentBonusPoint, "`currentBonusPoint` is required");
            this.accountId = Objects.requireNonNull(accountId, "`accountId` is required");
            this.email = Objects.requireNonNull(email, "`email` is required");
            this.birthday = Objects.requireNonNull(birthday, "`birthday` is required");
            this.phone = Objects.requireNonNull(phone, "`phone` is required");
            this.isactive = Objects.requireNonNull(isactive, "`isactive` is required");
            this.gender = Objects.requireNonNull(gender, "`gender` is required");
            this.cardid = Objects.requireNonNull(cardid, "`cardid` is required");
            this.code = Objects.requireNonNull(code, "`code` is required");
            this.imageUrl = Objects.requireNonNull(imageUrl, "`imageUrl` is required");
        }
        
        public String getName() {
            return this.name;
        }
        
        public String getAddress() {
            return this.address;
        }
        
        public Integer getCustomerTypeId() {
            return this.customerTypeId;
        }
        
        public Integer getCurrentBonusPoint() {
            return this.currentBonusPoint;
        }
        
        public Integer getAccountId() {
            return this.accountId;
        }
        
        public String getEmail() {
            return this.email;
        }
        
        public Date getBirthday() {
            return this.birthday;
        }
        
        public String getPhone() {
            return this.phone;
        }
        
        public Byte getIsactive() {
            return this.isactive;
        }
        
        public String getGender() {
            return this.gender;
        }
        
        public String getCardid() {
            return this.cardid;
        }
        
        public String getCode() {
            return this.code;
        }
        
        public String getImageUrl() {
            return this.imageUrl;
        }
    }
}