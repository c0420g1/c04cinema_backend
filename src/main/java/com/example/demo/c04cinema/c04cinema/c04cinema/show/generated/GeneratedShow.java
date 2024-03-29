package com.example.demo.c04cinema.c04cinema.c04cinema.show.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie.Movie;
import com.example.demo.c04cinema.c04cinema.c04cinema.show.Show;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.ComparableForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.time.TimestampToLocalDateTimeMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.show.Show}-interface
 * representing entities of the {@code show}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedShow {
    
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getId()} method.
     */
    IntField<Show, Integer> ID = IntField.create(
        Identifier.ID,
        Show::getId,
        Show::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getStartTime()} method.
     */
    ComparableField<Show, Timestamp, LocalDateTime> START_TIME = ComparableField.create(
        Identifier.START_TIME,
        o -> OptionalUtil.unwrap(o.getStartTime()),
        Show::setStartTime,
        new TimestampToLocalDateTimeMapper(),
        false
    );
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getHallId()} method.
     */
    IntForeignKeyField<Show, Integer, Hall> HALL_ID = IntForeignKeyField.create(
        Identifier.HALL_ID,
        Show::getHallId,
        Show::setHallId,
        Hall.ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getMovieId()} method.
     */
    ComparableForeignKeyField<Show, Integer, Integer, Movie> MOVIE_ID = ComparableForeignKeyField.create(
        Identifier.MOVIE_ID,
        o -> OptionalUtil.unwrap(o.getMovieId()),
        Show::setMovieId,
        Movie.ID,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getPrice()} method.
     */
    ComparableField<Show, Double, Double> PRICE = ComparableField.create(
        Identifier.PRICE,
        o -> OptionalUtil.unwrap(o.getPrice()),
        Show::setPrice,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getDescription()} method.
     */
    StringField<Show, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        Show::setDescription,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Show} field that can be obtained
     * using the {@link Show#getIsearly()} method.
     */
    ComparableField<Show, Byte, Byte> ISEARLY = ComparableField.create(
        Identifier.ISEARLY,
        o -> OptionalUtil.unwrap(o.getIsearly()),
        Show::setIsearly,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this Show. The id field corresponds to the database
     * column c04cinema.c04cinema.show.id.
     * 
     * @return the id of this Show
     */
    int getId();
    
    /**
     * Returns the startTime of this Show. The startTime field corresponds to
     * the database column c04cinema.c04cinema.show.start_time.
     * 
     * @return the startTime of this Show
     */
    Optional<LocalDateTime> getStartTime();
    
    /**
     * Returns the hallId of this Show. The hallId field corresponds to the
     * database column c04cinema.c04cinema.show.hall_id.
     * 
     * @return the hallId of this Show
     */
    int getHallId();
    
    /**
     * Returns the movieId of this Show. The movieId field corresponds to the
     * database column c04cinema.c04cinema.show.movie_id.
     * 
     * @return the movieId of this Show
     */
    OptionalInt getMovieId();
    
    /**
     * Returns the price of this Show. The price field corresponds to the
     * database column c04cinema.c04cinema.show.price.
     * 
     * @return the price of this Show
     */
    OptionalDouble getPrice();
    
    /**
     * Returns the description of this Show. The description field corresponds
     * to the database column c04cinema.c04cinema.show.description.
     * 
     * @return the description of this Show
     */
    Optional<String> getDescription();
    
    /**
     * Returns the isearly of this Show. The isearly field corresponds to the
     * database column c04cinema.c04cinema.show.isearly.
     * 
     * @return the isearly of this Show
     */
    Optional<Byte> getIsearly();
    
    /**
     * Sets the id of this Show. The id field corresponds to the database column
     * c04cinema.c04cinema.show.id.
     * 
     * @param id to set of this Show
     * @return   this Show instance
     */
    Show setId(int id);
    
    /**
     * Sets the startTime of this Show. The startTime field corresponds to the
     * database column c04cinema.c04cinema.show.start_time.
     * 
     * @param startTime to set of this Show
     * @return          this Show instance
     */
    Show setStartTime(LocalDateTime startTime);
    
    /**
     * Sets the hallId of this Show. The hallId field corresponds to the
     * database column c04cinema.c04cinema.show.hall_id.
     * 
     * @param hallId to set of this Show
     * @return       this Show instance
     */
    Show setHallId(int hallId);
    
    /**
     * Sets the movieId of this Show. The movieId field corresponds to the
     * database column c04cinema.c04cinema.show.movie_id.
     * 
     * @param movieId to set of this Show
     * @return        this Show instance
     */
    Show setMovieId(Integer movieId);
    
    /**
     * Sets the price of this Show. The price field corresponds to the database
     * column c04cinema.c04cinema.show.price.
     * 
     * @param price to set of this Show
     * @return      this Show instance
     */
    Show setPrice(Double price);
    
    /**
     * Sets the description of this Show. The description field corresponds to
     * the database column c04cinema.c04cinema.show.description.
     * 
     * @param description to set of this Show
     * @return            this Show instance
     */
    Show setDescription(String description);
    
    /**
     * Sets the isearly of this Show. The isearly field corresponds to the
     * database column c04cinema.c04cinema.show.isearly.
     * 
     * @param isearly to set of this Show
     * @return        this Show instance
     */
    Show setIsearly(Byte isearly);
    
    /**
     * Queries the specified manager for the referenced Hall. If no such Hall
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Hall findHallId(Manager<Hall> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Movie. If no such Movie
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Optional<Movie> findMovieId(Manager<Movie> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Show> {
        
        ID          ("id"),
        START_TIME  ("start_time"),
        HALL_ID     ("hall_id"),
        MOVIE_ID    ("movie_id"),
        PRICE       ("price"),
        DESCRIPTION ("description"),
        ISEARLY     ("isearly");
        
        private final String columnId;
        private final TableIdentifier<Show> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "c04cinema";
        }
        
        @Override
        public String getSchemaId() {
            return "c04cinema";
        }
        
        @Override
        public String getTableId() {
            return "show";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Show> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}