package com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatTypeManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.generated.GeneratedSeatType.Identifier;
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
 * The default REST controller logic for SeatType entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedSeatTypeController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired SeatTypeManager manager;
    protected JsonEncoder<SeatType> encoder;
    
    @PostConstruct
    void createSeatTypeEncoder() {
        encoder = jsonComponent.<SeatType>emptyEncoder()
            .put("id", SeatType.ID)
            .put("name", SeatType.NAME)
            .put("promoPointId", SeatType.PROMO_POINT_ID)
            .put("price", SeatType.PRICE)
            .put("color", SeatType.COLOR)
            .put("description", SeatType.DESCRIPTION)
            .build();
    }
    
    @GetMapping(path = "/seat_type", produces = "application/json")
    public String get(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return getHelper(
            ControllerUtil.parseFilters(filters, SeatTypeFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, SeatTypeSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/seat_type", consumes = "application/json")
    public void create(
            @RequestBody @Validated CreateBody createBody) {
        manager.persist(manager.create()
            .setName(createBody.getName())
            .setPromoPointId(createBody.getPromoPointId())
            .setPrice(createBody.getPrice())
            .setColor(createBody.getColor())
            .setDescription(createBody.getDescription())
        );
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/seat_type/{id}", consumes = "application/json")
    public void update(
            @PathVariable(name = "id") int id,
            @RequestBody @Validated UpdateBody updateBody) {
        manager.stream()
            .filter(SeatType.ID.equal(id))
            .map(seatType -> {
                seatType.setName(updateBody.getName());
                seatType.setPromoPointId(updateBody.getPromoPointId());
                seatType.setPrice(updateBody.getPrice());
                seatType.setColor(updateBody.getColor());
                seatType.setDescription(updateBody.getDescription());
                return seatType;
        }).forEach(manager.updater());
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/seat_type/{id}")
    public void delete(
            @PathVariable(name = "id") int id) {
        manager.stream()
            .filter(SeatType.ID.equal(id))
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
            final Set<GeneratedSeatType.Identifier> result = EnumSet.noneOf(GeneratedSeatType.Identifier.class);
            parsed.stream().map(this::parseColumn).forEach(result::add);
            return result;
        } catch (final ClassCastException ex) {
            throw new IllegalArgumentException("Error in parsed JSON.");
        }
    }
    
    protected final Identifier parseColumn(String jsonColumn) {
        switch (jsonColumn) {
            case "id":           return GeneratedSeatType.Identifier.ID;
            case "name":         return GeneratedSeatType.Identifier.NAME;
            case "promoPointId": return GeneratedSeatType.Identifier.PROMO_POINT_ID;
            case "price":        return GeneratedSeatType.Identifier.PRICE;
            case "color":        return GeneratedSeatType.Identifier.COLOR;
            case "description":  return GeneratedSeatType.Identifier.DESCRIPTION;
            default: throw new IllegalArgumentException(
                "Unknown column '" + jsonColumn + "'."
            );
        }
    }
    
    protected final Field<SeatType> fieldOf(Identifier columnId) {
        switch (columnId) {
            case ID:             return SeatType.ID;
            case NAME:           return SeatType.NAME;
            case PROMO_POINT_ID: return SeatType.PROMO_POINT_ID;
            case PRICE:          return SeatType.PRICE;
            case COLOR:          return SeatType.COLOR;
            case DESCRIPTION:    return SeatType.DESCRIPTION;
            default: throw new IllegalArgumentException(
                "Unknown column '" + columnId + "'."
            );
        }
    }
    
    protected String getHelper(
            List<Predicate<SeatType>> predicates,
            List<Comparator<SeatType>> sorters,
            long start,
            long limit) {
        Stream<SeatType> stream = manager.stream();
        
        for (final Predicate<SeatType> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<SeatType>> comparator = sorters.stream()
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
    public static final class SeatTypeFilter extends AbstractFilter<SeatType> {
        
        public SeatTypeFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<SeatType> toPredicate() {
            switch (property()) {
                case "id" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return SeatType.ID.equal(v);
                        case "ne"   : return SeatType.ID.notEqual(v);
                        case "lt"   : return SeatType.ID.lessThan(v);
                        case "le"   : return SeatType.ID.lessOrEqual(v);
                        case "gt"   : return SeatType.ID.greaterThan(v);
                        case "ge"   : return SeatType.ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "SeatType.id."
                        );
                    }
                }
                case "name" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return SeatType.NAME.equal(v);
                        case "ne"   : return SeatType.NAME.notEqual(v);
                        case "lt"   : return SeatType.NAME.lessThan(v);
                        case "le"   : return SeatType.NAME.lessOrEqual(v);
                        case "gt"   : return SeatType.NAME.greaterThan(v);
                        case "ge"   : return SeatType.NAME.greaterOrEqual(v);
                        case "like" : return SeatType.NAME.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "SeatType.name."
                        );
                    }
                }
                case "promoPointId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return SeatType.PROMO_POINT_ID.equal(v);
                        case "ne"   : return SeatType.PROMO_POINT_ID.notEqual(v);
                        case "lt"   : return SeatType.PROMO_POINT_ID.lessThan(v);
                        case "le"   : return SeatType.PROMO_POINT_ID.lessOrEqual(v);
                        case "gt"   : return SeatType.PROMO_POINT_ID.greaterThan(v);
                        case "ge"   : return SeatType.PROMO_POINT_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "SeatType.promoPointId."
                        );
                    }
                }
                case "price" : {
                    final Double v = Double.parseDouble(value());
                    switch (operator()) {
                        case "eq"   : return SeatType.PRICE.equal(v);
                        case "ne"   : return SeatType.PRICE.notEqual(v);
                        case "lt"   : return SeatType.PRICE.lessThan(v);
                        case "le"   : return SeatType.PRICE.lessOrEqual(v);
                        case "gt"   : return SeatType.PRICE.greaterThan(v);
                        case "ge"   : return SeatType.PRICE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "SeatType.price."
                        );
                    }
                }
                case "color" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return SeatType.COLOR.equal(v);
                        case "ne"   : return SeatType.COLOR.notEqual(v);
                        case "lt"   : return SeatType.COLOR.lessThan(v);
                        case "le"   : return SeatType.COLOR.lessOrEqual(v);
                        case "gt"   : return SeatType.COLOR.greaterThan(v);
                        case "ge"   : return SeatType.COLOR.greaterOrEqual(v);
                        case "like" : return SeatType.COLOR.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "SeatType.color."
                        );
                    }
                }
                case "description" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return SeatType.DESCRIPTION.equal(v);
                        case "ne"   : return SeatType.DESCRIPTION.notEqual(v);
                        case "lt"   : return SeatType.DESCRIPTION.lessThan(v);
                        case "le"   : return SeatType.DESCRIPTION.lessOrEqual(v);
                        case "gt"   : return SeatType.DESCRIPTION.greaterThan(v);
                        case "ge"   : return SeatType.DESCRIPTION.greaterOrEqual(v);
                        case "like" : return SeatType.DESCRIPTION.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "SeatType.description."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid SeatType property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class SeatTypeSort extends AbstractSort<SeatType> {
        
        public SeatTypeSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<SeatType> toComparator() {
            final Comparator<SeatType> comparator;
            switch (property()) {
                case "id"           : comparator = SeatType.ID.comparator();             break;
                case "name"         : comparator = SeatType.NAME.comparator();           break;
                case "promoPointId" : comparator = SeatType.PROMO_POINT_ID.comparator(); break;
                case "price"        : comparator = SeatType.PRICE.comparator();          break;
                case "color"        : comparator = SeatType.COLOR.comparator();          break;
                case "description"  : comparator = SeatType.DESCRIPTION.comparator();    break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid SeatType property."
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
        private final Integer promoPointId;
        private final Double price;
        private final String color;
        private final String description;
        
        @JsonCreator
        public CreateBody(
                @JsonProperty("name") String name,
                @JsonProperty("promoPointId") Integer promoPointId,
                @JsonProperty("price") Double price,
                @JsonProperty("color") String color,
                @JsonProperty("description") String description) {
            this.name = Objects.requireNonNull(name, "`name` is required");
            this.promoPointId = Objects.requireNonNull(promoPointId, "`promoPointId` is required");
            this.price = Objects.requireNonNull(price, "`price` is required");
            this.color = Objects.requireNonNull(color, "`color` is required");
            this.description = Objects.requireNonNull(description, "`description` is required");
        }
        
        public String getName() {
            return this.name;
        }
        
        public Integer getPromoPointId() {
            return this.promoPointId;
        }
        
        public Double getPrice() {
            return this.price;
        }
        
        public String getColor() {
            return this.color;
        }
        
        public String getDescription() {
            return this.description;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class UpdateBody {
        
        private final String name;
        private final Integer promoPointId;
        private final Double price;
        private final String color;
        private final String description;
        
        @JsonCreator
        public UpdateBody(
                @JsonProperty("name") String name,
                @JsonProperty("promoPointId") Integer promoPointId,
                @JsonProperty("price") Double price,
                @JsonProperty("color") String color,
                @JsonProperty("description") String description) {
            this.name = Objects.requireNonNull(name, "`name` is required");
            this.promoPointId = Objects.requireNonNull(promoPointId, "`promoPointId` is required");
            this.price = Objects.requireNonNull(price, "`price` is required");
            this.color = Objects.requireNonNull(color, "`color` is required");
            this.description = Objects.requireNonNull(description, "`description` is required");
        }
        
        public String getName() {
            return this.name;
        }
        
        public Integer getPromoPointId() {
            return this.promoPointId;
        }
        
        public Double getPrice() {
            return this.price;
        }
        
        public String getColor() {
            return this.color;
        }
        
        public String getDescription() {
            return this.description;
        }
    }
}