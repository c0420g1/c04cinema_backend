package com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatTypeImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatTypeManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSeatTypeManagerImpl 
extends AbstractManager<SeatType> 
implements GeneratedSeatTypeManager {
    
    private final TableIdentifier<SeatType> tableIdentifier;
    
    protected GeneratedSeatTypeManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "seat_type");
    }
    
    @Override
    public SeatType create() {
        return new SeatTypeImpl();
    }
    
    @Override
    public TableIdentifier<SeatType> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<SeatType>> fields() {
        return SeatTypeManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<SeatType>> primaryKeyFields() {
        return Stream.of(
            SeatType.ID
        );
    }
}