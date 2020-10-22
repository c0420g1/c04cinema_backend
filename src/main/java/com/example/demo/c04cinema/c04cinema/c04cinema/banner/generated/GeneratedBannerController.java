package com.example.demo.c04cinema.c04cinema.c04cinema.banner.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.banner.Banner;
import com.example.demo.c04cinema.c04cinema.c04cinema.banner.BannerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.banner.generated.GeneratedBanner.Identifier;
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
 * The default REST controller logic for Banner entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedBannerController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired BannerManager manager;
    protected JsonEncoder<Banner> encoder;
    
    @PostConstruct
    void createBannerEncoder() {
        encoder = jsonComponent.<Banner>emptyEncoder()
            .put("id", Banner.ID)
            .put("title", Banner.TITLE)
            .put("url", Banner.URL)
            .put("description", Banner.DESCRIPTION)
            .build();
    }
    
    @GetMapping(path = "/banner", produces = "application/json")
    public String get(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return getHelper(
            ControllerUtil.parseFilters(filters, BannerFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, BannerSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/banner", consumes = "application/json")
    public void create(
            @RequestBody @Validated CreateBody createBody) {
        manager.persist(manager.create()
            .setTitle(createBody.getTitle())
            .setUrl(createBody.getUrl())
            .setDescription(createBody.getDescription())
        );
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/banner/{id}", consumes = "application/json")
    public void update(
            @PathVariable(name = "id") int id,
            @RequestBody @Validated UpdateBody updateBody) {
        manager.stream()
            .filter(Banner.ID.equal(id))
            .map(banner -> {
                banner.setTitle(updateBody.getTitle());
                banner.setUrl(updateBody.getUrl());
                banner.setDescription(updateBody.getDescription());
                return banner;
        }).forEach(manager.updater());
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/banner/{id}")
    public void delete(
            @PathVariable(name = "id") int id) {
        manager.stream()
            .filter(Banner.ID.equal(id))
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
            final Set<GeneratedBanner.Identifier> result = EnumSet.noneOf(GeneratedBanner.Identifier.class);
            parsed.stream().map(this::parseColumn).forEach(result::add);
            return result;
        } catch (final ClassCastException ex) {
            throw new IllegalArgumentException("Error in parsed JSON.");
        }
    }
    
    protected final Identifier parseColumn(String jsonColumn) {
        switch (jsonColumn) {
            case "id":          return GeneratedBanner.Identifier.ID;
            case "title":       return GeneratedBanner.Identifier.TITLE;
            case "url":         return GeneratedBanner.Identifier.URL;
            case "description": return GeneratedBanner.Identifier.DESCRIPTION;
            default: throw new IllegalArgumentException(
                "Unknown column '" + jsonColumn + "'."
            );
        }
    }
    
    protected final Field<Banner> fieldOf(Identifier columnId) {
        switch (columnId) {
            case ID:          return Banner.ID;
            case TITLE:       return Banner.TITLE;
            case URL:         return Banner.URL;
            case DESCRIPTION: return Banner.DESCRIPTION;
            default: throw new IllegalArgumentException(
                "Unknown column '" + columnId + "'."
            );
        }
    }
    
    protected String getHelper(
            List<Predicate<Banner>> predicates,
            List<Comparator<Banner>> sorters,
            long start,
            long limit) {
        Stream<Banner> stream = manager.stream();
        
        for (final Predicate<Banner> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<Banner>> comparator = sorters.stream()
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
    public static final class BannerFilter extends AbstractFilter<Banner> {
        
        public BannerFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<Banner> toPredicate() {
            switch (property()) {
                case "id" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Banner.ID.equal(v);
                        case "ne"   : return Banner.ID.notEqual(v);
                        case "lt"   : return Banner.ID.lessThan(v);
                        case "le"   : return Banner.ID.lessOrEqual(v);
                        case "gt"   : return Banner.ID.greaterThan(v);
                        case "ge"   : return Banner.ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Banner.id."
                        );
                    }
                }
                case "title" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Banner.TITLE.equal(v);
                        case "ne"   : return Banner.TITLE.notEqual(v);
                        case "lt"   : return Banner.TITLE.lessThan(v);
                        case "le"   : return Banner.TITLE.lessOrEqual(v);
                        case "gt"   : return Banner.TITLE.greaterThan(v);
                        case "ge"   : return Banner.TITLE.greaterOrEqual(v);
                        case "like" : return Banner.TITLE.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Banner.title."
                        );
                    }
                }
                case "url" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Banner.URL.equal(v);
                        case "ne"   : return Banner.URL.notEqual(v);
                        case "lt"   : return Banner.URL.lessThan(v);
                        case "le"   : return Banner.URL.lessOrEqual(v);
                        case "gt"   : return Banner.URL.greaterThan(v);
                        case "ge"   : return Banner.URL.greaterOrEqual(v);
                        case "like" : return Banner.URL.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Banner.url."
                        );
                    }
                }
                case "description" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Banner.DESCRIPTION.equal(v);
                        case "ne"   : return Banner.DESCRIPTION.notEqual(v);
                        case "lt"   : return Banner.DESCRIPTION.lessThan(v);
                        case "le"   : return Banner.DESCRIPTION.lessOrEqual(v);
                        case "gt"   : return Banner.DESCRIPTION.greaterThan(v);
                        case "ge"   : return Banner.DESCRIPTION.greaterOrEqual(v);
                        case "like" : return Banner.DESCRIPTION.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Banner.description."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Banner property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class BannerSort extends AbstractSort<Banner> {
        
        public BannerSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<Banner> toComparator() {
            final Comparator<Banner> comparator;
            switch (property()) {
                case "id"          : comparator = Banner.ID.comparator();          break;
                case "title"       : comparator = Banner.TITLE.comparator();       break;
                case "url"         : comparator = Banner.URL.comparator();         break;
                case "description" : comparator = Banner.DESCRIPTION.comparator(); break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Banner property."
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
        
        private final String title;
        private final String url;
        private final String description;
        
        @JsonCreator
        public CreateBody(
                @JsonProperty("title") String title,
                @JsonProperty("url") String url,
                @JsonProperty("description") String description) {
            this.title = Objects.requireNonNull(title, "`title` is required");
            this.url = Objects.requireNonNull(url, "`url` is required");
            this.description = Objects.requireNonNull(description, "`description` is required");
        }
        
        public String getTitle() {
            return this.title;
        }
        
        public String getUrl() {
            return this.url;
        }
        
        public String getDescription() {
            return this.description;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class UpdateBody {
        
        private final String title;
        private final String url;
        private final String description;
        
        @JsonCreator
        public UpdateBody(
                @JsonProperty("title") String title,
                @JsonProperty("url") String url,
                @JsonProperty("description") String description) {
            this.title = Objects.requireNonNull(title, "`title` is required");
            this.url = Objects.requireNonNull(url, "`url` is required");
            this.description = Objects.requireNonNull(description, "`description` is required");
        }
        
        public String getTitle() {
            return this.title;
        }
        
        public String getUrl() {
            return this.url;
        }
        
        public String getDescription() {
            return this.description;
        }
    }
}