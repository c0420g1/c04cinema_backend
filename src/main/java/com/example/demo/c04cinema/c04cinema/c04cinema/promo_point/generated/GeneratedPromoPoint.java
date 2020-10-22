package com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint}-interface
 * representing entities of the {@code promo_point}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedPromoPoint {
    
    /**
     * This Field corresponds to the {@link PromoPoint} field that can be
     * obtained using the {@link PromoPoint#getId()} method.
     */
    IntField<PromoPoint, Integer> ID = IntField.create(
        Identifier.ID,
        PromoPoint::getId,
        PromoPoint::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link PromoPoint} field that can be
     * obtained using the {@link PromoPoint#getName()} method.
     */
    StringField<PromoPoint, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        PromoPoint::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link PromoPoint} field that can be
     * obtained using the {@link PromoPoint#getBonusPoint()} method.
     */
    ComparableField<PromoPoint, Integer, Integer> BONUS_POINT = ComparableField.create(
        Identifier.BONUS_POINT,
        o -> OptionalUtil.unwrap(o.getBonusPoint()),
        PromoPoint::setBonusPoint,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link PromoPoint} field that can be
     * obtained using the {@link PromoPoint#getDescription()} method.
     */
    StringField<PromoPoint, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        PromoPoint::setDescription,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this PromoPoint. The id field corresponds to the
     * database column c04cinema.c04cinema.promo_point.id.
     * 
     * @return the id of this PromoPoint
     */
    int getId();
    
    /**
     * Returns the name of this PromoPoint. The name field corresponds to the
     * database column c04cinema.c04cinema.promo_point.name.
     * 
     * @return the name of this PromoPoint
     */
    Optional<String> getName();
    
    /**
     * Returns the bonusPoint of this PromoPoint. The bonusPoint field
     * corresponds to the database column
     * c04cinema.c04cinema.promo_point.bonus_point.
     * 
     * @return the bonusPoint of this PromoPoint
     */
    OptionalInt getBonusPoint();
    
    /**
     * Returns the description of this PromoPoint. The description field
     * corresponds to the database column
     * c04cinema.c04cinema.promo_point.description.
     * 
     * @return the description of this PromoPoint
     */
    Optional<String> getDescription();
    
    /**
     * Sets the id of this PromoPoint. The id field corresponds to the database
     * column c04cinema.c04cinema.promo_point.id.
     * 
     * @param id to set of this PromoPoint
     * @return   this PromoPoint instance
     */
    PromoPoint setId(int id);
    
    /**
     * Sets the name of this PromoPoint. The name field corresponds to the
     * database column c04cinema.c04cinema.promo_point.name.
     * 
     * @param name to set of this PromoPoint
     * @return     this PromoPoint instance
     */
    PromoPoint setName(String name);
    
    /**
     * Sets the bonusPoint of this PromoPoint. The bonusPoint field corresponds
     * to the database column c04cinema.c04cinema.promo_point.bonus_point.
     * 
     * @param bonusPoint to set of this PromoPoint
     * @return           this PromoPoint instance
     */
    PromoPoint setBonusPoint(Integer bonusPoint);
    
    /**
     * Sets the description of this PromoPoint. The description field
     * corresponds to the database column
     * c04cinema.c04cinema.promo_point.description.
     * 
     * @param description to set of this PromoPoint
     * @return            this PromoPoint instance
     */
    PromoPoint setDescription(String description);
    
    enum Identifier implements ColumnIdentifier<PromoPoint> {
        
        ID          ("id"),
        NAME        ("name"),
        BONUS_POINT ("bonus_point"),
        DESCRIPTION ("description");
        
        private final String columnId;
        private final TableIdentifier<PromoPoint> tableIdentifier;
        
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
            return "promo_point";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<PromoPoint> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}