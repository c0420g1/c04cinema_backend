package com.example.demo.c04cinema.c04cinema.c04cinema.account.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.AccountManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.generated.GeneratedAccount.Identifier;
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
 * The default REST controller logic for Account entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedAccountController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired AccountManager manager;
    protected JsonEncoder<Account> encoder;
    
    @PostConstruct
    void createAccountEncoder() {
        encoder = jsonComponent.<Account>emptyEncoder()
            .put("id", Account.ID)
            .put("username", Account.USERNAME)
            .put("password", Account.PASSWORD)
            .build();
    }
    
    @GetMapping(path = "/account", produces = "application/json")
    public String get(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return getHelper(
            ControllerUtil.parseFilters(filters, AccountFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, AccountSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/account", consumes = "application/json")
    public void create(
            @RequestBody @Validated CreateBody createBody) {
        manager.persist(manager.create()
            .setUsername(createBody.getUsername())
            .setPassword(createBody.getPassword())
        );
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/account/{id}", consumes = "application/json")
    public void update(
            @PathVariable(name = "id") int id,
            @RequestBody @Validated UpdateBody updateBody) {
        manager.stream()
            .filter(Account.ID.equal(id))
            .map(account -> {
                account.setUsername(updateBody.getUsername());
                account.setPassword(updateBody.getPassword());
                return account;
        }).forEach(manager.updater());
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/account/{id}")
    public void delete(
            @PathVariable(name = "id") int id) {
        manager.stream()
            .filter(Account.ID.equal(id))
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
            final Set<GeneratedAccount.Identifier> result = EnumSet.noneOf(GeneratedAccount.Identifier.class);
            parsed.stream().map(this::parseColumn).forEach(result::add);
            return result;
        } catch (final ClassCastException ex) {
            throw new IllegalArgumentException("Error in parsed JSON.");
        }
    }
    
    protected final Identifier parseColumn(String jsonColumn) {
        switch (jsonColumn) {
            case "id":       return GeneratedAccount.Identifier.ID;
            case "username": return GeneratedAccount.Identifier.USERNAME;
            case "password": return GeneratedAccount.Identifier.PASSWORD;
            default: throw new IllegalArgumentException(
                "Unknown column '" + jsonColumn + "'."
            );
        }
    }
    
    protected final Field<Account> fieldOf(Identifier columnId) {
        switch (columnId) {
            case ID:       return Account.ID;
            case USERNAME: return Account.USERNAME;
            case PASSWORD: return Account.PASSWORD;
            default: throw new IllegalArgumentException(
                "Unknown column '" + columnId + "'."
            );
        }
    }
    
    protected String getHelper(
            List<Predicate<Account>> predicates,
            List<Comparator<Account>> sorters,
            long start,
            long limit) {
        Stream<Account> stream = manager.stream();
        
        for (final Predicate<Account> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<Account>> comparator = sorters.stream()
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
    public static final class AccountFilter extends AbstractFilter<Account> {
        
        public AccountFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<Account> toPredicate() {
            switch (property()) {
                case "id" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Account.ID.equal(v);
                        case "ne"   : return Account.ID.notEqual(v);
                        case "lt"   : return Account.ID.lessThan(v);
                        case "le"   : return Account.ID.lessOrEqual(v);
                        case "gt"   : return Account.ID.greaterThan(v);
                        case "ge"   : return Account.ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Account.id."
                        );
                    }
                }
                case "username" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Account.USERNAME.equal(v);
                        case "ne"   : return Account.USERNAME.notEqual(v);
                        case "lt"   : return Account.USERNAME.lessThan(v);
                        case "le"   : return Account.USERNAME.lessOrEqual(v);
                        case "gt"   : return Account.USERNAME.greaterThan(v);
                        case "ge"   : return Account.USERNAME.greaterOrEqual(v);
                        case "like" : return Account.USERNAME.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Account.username."
                        );
                    }
                }
                case "password" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Account.PASSWORD.equal(v);
                        case "ne"   : return Account.PASSWORD.notEqual(v);
                        case "lt"   : return Account.PASSWORD.lessThan(v);
                        case "le"   : return Account.PASSWORD.lessOrEqual(v);
                        case "gt"   : return Account.PASSWORD.greaterThan(v);
                        case "ge"   : return Account.PASSWORD.greaterOrEqual(v);
                        case "like" : return Account.PASSWORD.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Account.password."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Account property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class AccountSort extends AbstractSort<Account> {
        
        public AccountSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<Account> toComparator() {
            final Comparator<Account> comparator;
            switch (property()) {
                case "id"       : comparator = Account.ID.comparator();       break;
                case "username" : comparator = Account.USERNAME.comparator(); break;
                case "password" : comparator = Account.PASSWORD.comparator(); break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Account property."
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
        
        private final String username;
        private final String password;
        
        @JsonCreator
        public CreateBody(
                @JsonProperty("username") String username,
                @JsonProperty("password") String password) {
            this.username = Objects.requireNonNull(username, "`username` is required");
            this.password = Objects.requireNonNull(password, "`password` is required");
        }
        
        public String getUsername() {
            return this.username;
        }
        
        public String getPassword() {
            return this.password;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class UpdateBody {
        
        private final String username;
        private final String password;
        
        @JsonCreator
        public UpdateBody(
                @JsonProperty("username") String username,
                @JsonProperty("password") String password) {
            this.username = Objects.requireNonNull(username, "`username` is required");
            this.password = Objects.requireNonNull(password, "`password` is required");
        }
        
        public String getUsername() {
            return this.username;
        }
        
        public String getPassword() {
            return this.password;
        }
    }
}