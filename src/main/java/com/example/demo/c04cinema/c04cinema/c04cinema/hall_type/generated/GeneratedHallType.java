package com.example.demo.c04cinema.c04cinema.c04cinema.hall_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall_type.HallType;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.hall_type.HallType}-interface
 * representing entities of the {@code hall_type}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedHallType {
    
    /**
     * This Field corresponds to the {@link HallType} field that can be obtained
     * using the {@link HallType#getId()} method.
     */
    IntField<HallType, Integer> ID = IntField.create(
        Identifier.ID,
        HallType::getId,
        HallType::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link HallType} field that can be obtained
     * using the {@link HallType#getName()} method.
     */
    StringField<HallType, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        HallType::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link HallType} field that can be obtained
     * using the {@link HallType#getDescription()} method.
     */
    StringField<HallType, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        HallType::setDescription,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this HallType. The id field corresponds to the database
     * column c04cinema.c04cinema.hall_type.id.
     * 
     * @return the id of this HallType
     */
    int getId();
    
    /**
     * Returns the name of this HallType. The name field corresponds to the
     * database column c04cinema.c04cinema.hall_type.name.
     * 
     * @return the name of this HallType
     */
    Optional<String> getName();
    
    /**
     * Returns the description of this HallType. The description field
     * corresponds to the database column
     * c04cinema.c04cinema.hall_type.description.
     * 
     * @return the description of this HallType
     */
    Optional<String> getDescription();
    
    /**
     * Sets the id of this HallType. The id field corresponds to the database
     * column c04cinema.c04cinema.hall_type.id.
     * 
     * @param id to set of this HallType
     * @return   this HallType instance
     */
    HallType setId(int id);
    
    /**
     * Sets the name of this HallType. The name field corresponds to the
     * database column c04cinema.c04cinema.hall_type.name.
     * 
     * @param name to set of this HallType
     * @return     this HallType instance
     */
    HallType setName(String name);
    
    /**
     * Sets the description of this HallType. The description field corresponds
     * to the database column c04cinema.c04cinema.hall_type.description.
     * 
     * @param description to set of this HallType
     * @return            this HallType instance
     */
    HallType setDescription(String description);
    
    enum Identifier implements ColumnIdentifier<HallType> {
        
        ID          ("id"),
        NAME        ("name"),
        DESCRIPTION ("description");
        
        private final String columnId;
        private final TableIdentifier<HallType> tableIdentifier;
        
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
            return "hall_type";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<HallType> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}