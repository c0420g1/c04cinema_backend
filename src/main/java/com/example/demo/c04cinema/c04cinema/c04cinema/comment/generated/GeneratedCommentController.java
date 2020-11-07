package com.example.demo.c04cinema.c04cinema.c04cinema.comment.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.comment.Comment;
import com.example.demo.c04cinema.c04cinema.c04cinema.comment.CommentManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.comment.generated.GeneratedComment.Identifier;
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

import java.sql.Timestamp;
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
 * The default REST controller logic for Comment entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedCommentController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired CommentManager manager;
    protected JsonEncoder<Comment> encoder;
    
    @PostConstruct
    void createCommentEncoder() {
        encoder = jsonComponent.<Comment>emptyEncoder()
            .put("id", Comment.ID)
            .put("customerId", Comment.CUSTOMER_ID)
            .put("movieId", Comment.MOVIE_ID)
            .put("comment", Comment.COMMENT)
            .put("createDate", Comment.CREATE_DATE)
            .put("replyOneCustomId", Comment.REPLY_ONE_CUSTOM_ID)
            .put("like", Comment.LIKE)
            .put("emotion", Comment.EMOTION)
            .put("replyTwoCustomId", Comment.REPLY_TWO_CUSTOM_ID)
            .build();
    }
    
    @GetMapping(path = "/comment", produces = "application/json")
    public String get(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return getHelper(
            ControllerUtil.parseFilters(filters, CommentFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, CommentSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/comment", consumes = "application/json")
    public void create(
            @RequestBody @Validated CreateBody createBody) {
        manager.persist(manager.create()
            .setCustomerId(createBody.getCustomerId())
            .setMovieId(createBody.getMovieId())
            .setComment(createBody.getComment())
            .setCreateDate(createBody.getCreateDate())
            .setReplyOneCustomId(createBody.getReplyOneCustomId())
            .setLike(createBody.getLike())
            .setEmotion(createBody.getEmotion())
            .setReplyTwoCustomId(createBody.getReplyTwoCustomId())
        );
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/comment/{id}", consumes = "application/json")
    public void update(
            @PathVariable(name = "id") int id,
            @RequestBody @Validated UpdateBody updateBody) {
        manager.stream()
            .filter(Comment.ID.equal(id))
            .map(comment -> {
                comment.setCustomerId(updateBody.getCustomerId());
                comment.setMovieId(updateBody.getMovieId());
                comment.setComment(updateBody.getComment());
                comment.setCreateDate(updateBody.getCreateDate());
                comment.setReplyOneCustomId(updateBody.getReplyOneCustomId());
                comment.setLike(updateBody.getLike());
                comment.setEmotion(updateBody.getEmotion());
                comment.setReplyTwoCustomId(updateBody.getReplyTwoCustomId());
                return comment;
        }).forEach(manager.updater());
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/comment/{id}")
    public void delete(
            @PathVariable(name = "id") int id) {
        manager.stream()
            .filter(Comment.ID.equal(id))
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
            final Set<GeneratedComment.Identifier> result = EnumSet.noneOf(GeneratedComment.Identifier.class);
            parsed.stream().map(this::parseColumn).forEach(result::add);
            return result;
        } catch (final ClassCastException ex) {
            throw new IllegalArgumentException("Error in parsed JSON.");
        }
    }
    
    protected final Identifier parseColumn(String jsonColumn) {
        switch (jsonColumn) {
            case "id":               return GeneratedComment.Identifier.ID;
            case "customerId":       return GeneratedComment.Identifier.CUSTOMER_ID;
            case "movieId":          return GeneratedComment.Identifier.MOVIE_ID;
            case "comment":          return GeneratedComment.Identifier.COMMENT;
            case "createDate":       return GeneratedComment.Identifier.CREATE_DATE;
            case "replyOneCustomId": return GeneratedComment.Identifier.REPLY_ONE_CUSTOM_ID;
            case "like":             return GeneratedComment.Identifier.LIKE;
            case "emotion":          return GeneratedComment.Identifier.EMOTION;
            case "replyTwoCustomId": return GeneratedComment.Identifier.REPLY_TWO_CUSTOM_ID;
            default: throw new IllegalArgumentException(
                "Unknown column '" + jsonColumn + "'."
            );
        }
    }
    
    protected final Field<Comment> fieldOf(Identifier columnId) {
        switch (columnId) {
            case ID:                  return Comment.ID;
            case CUSTOMER_ID:         return Comment.CUSTOMER_ID;
            case MOVIE_ID:            return Comment.MOVIE_ID;
            case COMMENT:             return Comment.COMMENT;
            case CREATE_DATE:         return Comment.CREATE_DATE;
            case REPLY_ONE_CUSTOM_ID: return Comment.REPLY_ONE_CUSTOM_ID;
            case LIKE:                return Comment.LIKE;
            case EMOTION:             return Comment.EMOTION;
            case REPLY_TWO_CUSTOM_ID: return Comment.REPLY_TWO_CUSTOM_ID;
            default: throw new IllegalArgumentException(
                "Unknown column '" + columnId + "'."
            );
        }
    }
    
    protected String getHelper(
            List<Predicate<Comment>> predicates,
            List<Comparator<Comment>> sorters,
            long start,
            long limit) {
        Stream<Comment> stream = manager.stream();
        
        for (final Predicate<Comment> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<Comment>> comparator = sorters.stream()
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
    public static final class CommentFilter extends AbstractFilter<Comment> {
        
        public CommentFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<Comment> toPredicate() {
            switch (property()) {
                case "id" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Comment.ID.equal(v);
                        case "ne"   : return Comment.ID.notEqual(v);
                        case "lt"   : return Comment.ID.lessThan(v);
                        case "le"   : return Comment.ID.lessOrEqual(v);
                        case "gt"   : return Comment.ID.greaterThan(v);
                        case "ge"   : return Comment.ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.id."
                        );
                    }
                }
                case "customerId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Comment.CUSTOMER_ID.equal(v);
                        case "ne"   : return Comment.CUSTOMER_ID.notEqual(v);
                        case "lt"   : return Comment.CUSTOMER_ID.lessThan(v);
                        case "le"   : return Comment.CUSTOMER_ID.lessOrEqual(v);
                        case "gt"   : return Comment.CUSTOMER_ID.greaterThan(v);
                        case "ge"   : return Comment.CUSTOMER_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.customerId."
                        );
                    }
                }
                case "movieId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Comment.MOVIE_ID.equal(v);
                        case "ne"   : return Comment.MOVIE_ID.notEqual(v);
                        case "lt"   : return Comment.MOVIE_ID.lessThan(v);
                        case "le"   : return Comment.MOVIE_ID.lessOrEqual(v);
                        case "gt"   : return Comment.MOVIE_ID.greaterThan(v);
                        case "ge"   : return Comment.MOVIE_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.movieId."
                        );
                    }
                }
                case "comment" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Comment.COMMENT.equal(v);
                        case "ne"   : return Comment.COMMENT.notEqual(v);
                        case "lt"   : return Comment.COMMENT.lessThan(v);
                        case "le"   : return Comment.COMMENT.lessOrEqual(v);
                        case "gt"   : return Comment.COMMENT.greaterThan(v);
                        case "ge"   : return Comment.COMMENT.greaterOrEqual(v);
                        case "like" : return Comment.COMMENT.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.comment."
                        );
                    }
                }
                case "createDate" : {
                    final Timestamp v = Timestamp.valueOf(value());
                    switch (operator()) {
                        case "eq"   : return Comment.CREATE_DATE.equal(v);
                        case "ne"   : return Comment.CREATE_DATE.notEqual(v);
                        case "lt"   : return Comment.CREATE_DATE.lessThan(v);
                        case "le"   : return Comment.CREATE_DATE.lessOrEqual(v);
                        case "gt"   : return Comment.CREATE_DATE.greaterThan(v);
                        case "ge"   : return Comment.CREATE_DATE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.createDate."
                        );
                    }
                }
                case "replyOneCustomId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Comment.REPLY_ONE_CUSTOM_ID.equal(v);
                        case "ne"   : return Comment.REPLY_ONE_CUSTOM_ID.notEqual(v);
                        case "lt"   : return Comment.REPLY_ONE_CUSTOM_ID.lessThan(v);
                        case "le"   : return Comment.REPLY_ONE_CUSTOM_ID.lessOrEqual(v);
                        case "gt"   : return Comment.REPLY_ONE_CUSTOM_ID.greaterThan(v);
                        case "ge"   : return Comment.REPLY_ONE_CUSTOM_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.replyOneCustomId."
                        );
                    }
                }
                case "like" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Comment.LIKE.equal(v);
                        case "ne"   : return Comment.LIKE.notEqual(v);
                        case "lt"   : return Comment.LIKE.lessThan(v);
                        case "le"   : return Comment.LIKE.lessOrEqual(v);
                        case "gt"   : return Comment.LIKE.greaterThan(v);
                        case "ge"   : return Comment.LIKE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.like."
                        );
                    }
                }
                case "emotion" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Comment.EMOTION.equal(v);
                        case "ne"   : return Comment.EMOTION.notEqual(v);
                        case "lt"   : return Comment.EMOTION.lessThan(v);
                        case "le"   : return Comment.EMOTION.lessOrEqual(v);
                        case "gt"   : return Comment.EMOTION.greaterThan(v);
                        case "ge"   : return Comment.EMOTION.greaterOrEqual(v);
                        case "like" : return Comment.EMOTION.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.emotion."
                        );
                    }
                }
                case "replyTwoCustomId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Comment.REPLY_TWO_CUSTOM_ID.equal(v);
                        case "ne"   : return Comment.REPLY_TWO_CUSTOM_ID.notEqual(v);
                        case "lt"   : return Comment.REPLY_TWO_CUSTOM_ID.lessThan(v);
                        case "le"   : return Comment.REPLY_TWO_CUSTOM_ID.lessOrEqual(v);
                        case "gt"   : return Comment.REPLY_TWO_CUSTOM_ID.greaterThan(v);
                        case "ge"   : return Comment.REPLY_TWO_CUSTOM_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Comment.replyTwoCustomId."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Comment property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class CommentSort extends AbstractSort<Comment> {
        
        public CommentSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<Comment> toComparator() {
            final Comparator<Comment> comparator;
            switch (property()) {
                case "id"               : comparator = Comment.ID.comparator();                  break;
                case "customerId"       : comparator = Comment.CUSTOMER_ID.comparator();         break;
                case "movieId"          : comparator = Comment.MOVIE_ID.comparator();            break;
                case "comment"          : comparator = Comment.COMMENT.comparator();             break;
                case "createDate"       : comparator = Comment.CREATE_DATE.comparator();         break;
                case "replyOneCustomId" : comparator = Comment.REPLY_ONE_CUSTOM_ID.comparator(); break;
                case "like"             : comparator = Comment.LIKE.comparator();                break;
                case "emotion"          : comparator = Comment.EMOTION.comparator();             break;
                case "replyTwoCustomId" : comparator = Comment.REPLY_TWO_CUSTOM_ID.comparator(); break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Comment property."
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
        
        private final Integer customerId;
        private final Integer movieId;
        private final String comment;
        private final Timestamp createDate;
        private final Integer replyOneCustomId;
        private final Integer like;
        private final String emotion;
        private final Integer replyTwoCustomId;
        
        @JsonCreator
        public CreateBody(
                @JsonProperty("customerId") Integer customerId,
                @JsonProperty("movieId") Integer movieId,
                @JsonProperty("comment") String comment,
                @JsonProperty("createDate") Timestamp createDate,
                @JsonProperty("replyOneCustomId") Integer replyOneCustomId,
                @JsonProperty("like") Integer like,
                @JsonProperty("emotion") String emotion,
                @JsonProperty("replyTwoCustomId") Integer replyTwoCustomId) {
            this.customerId = Objects.requireNonNull(customerId, "`customerId` is required");
            this.movieId = Objects.requireNonNull(movieId, "`movieId` is required");
            this.comment = Objects.requireNonNull(comment, "`comment` is required");
            this.createDate = Objects.requireNonNull(createDate, "`createDate` is required");
            this.replyOneCustomId = replyOneCustomId;
            this.like = like;
            this.emotion = emotion;
            this.replyTwoCustomId = replyTwoCustomId;
        }
        
        public Integer getCustomerId() {
            return this.customerId;
        }
        
        public Integer getMovieId() {
            return this.movieId;
        }
        
        public String getComment() {
            return this.comment;
        }
        
        public Timestamp getCreateDate() {
            return this.createDate;
        }
        
        public Integer getReplyOneCustomId() {
            return this.replyOneCustomId;
        }
        
        public Integer getLike() {
            return this.like;
        }
        
        public String getEmotion() {
            return this.emotion;
        }
        
        public Integer getReplyTwoCustomId() {
            return this.replyTwoCustomId;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class UpdateBody {
        
        private final Integer customerId;
        private final Integer movieId;
        private final String comment;
        private final Timestamp createDate;
        private final Integer replyOneCustomId;
        private final Integer like;
        private final String emotion;
        private final Integer replyTwoCustomId;
        
        @JsonCreator
        public UpdateBody(
                @JsonProperty("customerId") Integer customerId,
                @JsonProperty("movieId") Integer movieId,
                @JsonProperty("comment") String comment,
                @JsonProperty("createDate") Timestamp createDate,
                @JsonProperty("replyOneCustomId") Integer replyOneCustomId,
                @JsonProperty("like") Integer like,
                @JsonProperty("emotion") String emotion,
                @JsonProperty("replyTwoCustomId") Integer replyTwoCustomId) {
            this.customerId = Objects.requireNonNull(customerId, "`customerId` is required");
            this.movieId = Objects.requireNonNull(movieId, "`movieId` is required");
            this.comment = Objects.requireNonNull(comment, "`comment` is required");
            this.createDate = Objects.requireNonNull(createDate, "`createDate` is required");
            this.replyOneCustomId = Objects.requireNonNull(replyOneCustomId, "`replyOneCustomId` is required");
            this.like = Objects.requireNonNull(like, "`like` is required");
            this.emotion = Objects.requireNonNull(emotion, "`emotion` is required");
            this.replyTwoCustomId = Objects.requireNonNull(replyTwoCustomId, "`replyTwoCustomId` is required");
        }
        
        public Integer getCustomerId() {
            return this.customerId;
        }
        
        public Integer getMovieId() {
            return this.movieId;
        }
        
        public String getComment() {
            return this.comment;
        }
        
        public Timestamp getCreateDate() {
            return this.createDate;
        }
        
        public Integer getReplyOneCustomId() {
            return this.replyOneCustomId;
        }
        
        public Integer getLike() {
            return this.like;
        }
        
        public String getEmotion() {
            return this.emotion;
        }
        
        public Integer getReplyTwoCustomId() {
            return this.replyTwoCustomId;
        }
    }
}
