package com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.ComparableForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType}-interface
 * representing entities of the {@code seat_type}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSeatType {
    
    /**
     * This Field corresponds to the {@link SeatType} field that can be obtained
     * using the {@link SeatType#getId()} method.
     */
    IntField<SeatType, Integer> ID = IntField.create(
        Identifier.ID,
        SeatType::getId,
        SeatType::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link SeatType} field that can be obtained
     * using the {@link SeatType#getName()} method.
     */
    StringField<SeatType, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        SeatType::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SeatType} field that can be obtained
     * using the {@link SeatType#getPromoPointId()} method.
     */
    ComparableForeignKeyField<SeatType, Integer, Integer, PromoPoint> PROMO_POINT_ID = ComparableForeignKeyField.create(
        Identifier.PROMO_POINT_ID,
        o -> OptionalUtil.unwrap(o.getPromoPointId()),
        SeatType::setPromoPointId,
        PromoPoint.ID,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SeatType} field that can be obtained
     * using the {@link SeatType#getPrice()} method.
     */
    ComparableField<SeatType, Double, Double> PRICE = ComparableField.create(
        Identifier.PRICE,
        o -> OptionalUtil.unwrap(o.getPrice()),
        SeatType::setPrice,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SeatType} field that can be obtained
     * using the {@link SeatType#getColor()} method.
     */
    StringField<SeatType, String> COLOR = StringField.create(
        Identifier.COLOR,
        o -> OptionalUtil.unwrap(o.getColor()),
        SeatType::setColor,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SeatType} field that can be obtained
     * using the {@link SeatType#getDescription()} method.
     */
    StringField<SeatType, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        SeatType::setDescription,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this SeatType. The id field corresponds to the database
     * column c04cinema.c04cinema.seat_type.id.
     * 
     * @return the id of this SeatType
     */
    int getId();
    
    /**
     * Returns the name of this SeatType. The name field corresponds to the
     * database column c04cinema.c04cinema.seat_type.name.
     * 
     * @return the name of this SeatType
     */
    Optional<String> getName();
    
    /**
     * Returns the promoPointId of this SeatType. The promoPointId field
     * corresponds to the database column
     * c04cinema.c04cinema.seat_type.promo_point_id.
     * 
     * @return the promoPointId of this SeatType
     */
    OptionalInt getPromoPointId();
    
    /**
     * Returns the price of this SeatType. The price field corresponds to the
     * database column c04cinema.c04cinema.seat_type.price.
     * 
     * @return the price of this SeatType
     */
    OptionalDouble getPrice();
    
    /**
     * Returns the color of this SeatType. The color field corresponds to the
     * database column c04cinema.c04cinema.seat_type.color.
     * 
     * @return the color of this SeatType
     */
    Optional<String> getColor();
    
    /**
     * Returns the description of this SeatType. The description field
     * corresponds to the database column
     * c04cinema.c04cinema.seat_type.description.
     * 
     * @return the description of this SeatType
     */
    Optional<String> getDescription();
    
    /**
     * Sets the id of this SeatType. The id field corresponds to the database
     * column c04cinema.c04cinema.seat_type.id.
     * 
     * @param id to set of this SeatType
     * @return   this SeatType instance
     */
    SeatType setId(int id);
    
    /**
     * Sets the name of this SeatType. The name field corresponds to the
     * database column c04cinema.c04cinema.seat_type.name.
     * 
     * @param name to set of this SeatType
     * @return     this SeatType instance
     */
    SeatType setName(String name);
    
    /**
     * Sets the promoPointId of this SeatType. The promoPointId field
     * corresponds to the database column
     * c04cinema.c04cinema.seat_type.promo_point_id.
     * 
     * @param promoPointId to set of this SeatType
     * @return             this SeatType instance
     */
    SeatType setPromoPointId(Integer promoPointId);
    
    /**
     * Sets the price of this SeatType. The price field corresponds to the
     * database column c04cinema.c04cinema.seat_type.price.
     * 
     * @param price to set of this SeatType
     * @return      this SeatType instance
     */
    SeatType setPrice(Double price);
    
    /**
     * Sets the color of this SeatType. The color field corresponds to the
     * database column c04cinema.c04cinema.seat_type.color.
     * 
     * @param color to set of this SeatType
     * @return      this SeatType instance
     */
    SeatType setColor(String color);
    
    /**
     * Sets the description of this SeatType. The description field corresponds
     * to the database column c04cinema.c04cinema.seat_type.description.
     * 
     * @param description to set of this SeatType
     * @return            this SeatType instance
     */
    SeatType setDescription(String description);
    
    /**
     * Queries the specified manager for the referenced PromoPoint. If no such
     * PromoPoint exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Optional<PromoPoint> findPromoPointId(Manager<PromoPoint> foreignManager);
    
    enum Identifier implements ColumnIdentifier<SeatType> {
        
        ID             ("id"),
        NAME           ("name"),
        PROMO_POINT_ID ("promo_point_id"),
        PRICE          ("price"),
        COLOR          ("color"),
        DESCRIPTION    ("description");
        
        private final String columnId;
        private final TableIdentifier<SeatType> tableIdentifier;
        
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
            return "seat_type";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<SeatType> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}