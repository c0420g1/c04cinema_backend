package com.example.demo.c04cinema.c04cinema.c04cinema.seat.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.seat.Seat} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSeatManager extends Manager<Seat> {
    
    TableIdentifier<Seat> IDENTIFIER = TableIdentifier.of("c04cinema", "c04cinema", "seat");
    List<Field<Seat>> FIELDS = unmodifiableList(asList(
        Seat.ID,
        Seat.NAME,
        Seat.HALL_ID,
        Seat.SEAT_TYPE_ID
    ));
    
    @Override
    default Class<Seat> getEntityClass() {
        return Seat.class;
    }
}