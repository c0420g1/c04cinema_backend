package com.example.demo.c04cinema.c04cinema.c04cinema.customer_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer_type.CustomerType;
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
 * com.example.demo.c04cinema.c04cinema.c04cinema.customer_type.CustomerType}-interface
 * representing entities of the {@code customer_type}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCustomerType {
    
    /**
     * This Field corresponds to the {@link CustomerType} field that can be
     * obtained using the {@link CustomerType#getId()} method.
     */
    IntField<CustomerType, Integer> ID = IntField.create(
        Identifier.ID,
        CustomerType::getId,
        CustomerType::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link CustomerType} field that can be
     * obtained using the {@link CustomerType#getName()} method.
     */
    StringField<CustomerType, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        CustomerType::setName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this CustomerType. The id field corresponds to the
     * database column c04cinema.c04cinema.customer_type.id.
     * 
     * @return the id of this CustomerType
     */
    int getId();
    
    /**
     * Returns the name of this CustomerType. The name field corresponds to the
     * database column c04cinema.c04cinema.customer_type.name.
     * 
     * @return the name of this CustomerType
     */
    Optional<String> getName();
    
    /**
     * Sets the id of this CustomerType. The id field corresponds to the
     * database column c04cinema.c04cinema.customer_type.id.
     * 
     * @param id to set of this CustomerType
     * @return   this CustomerType instance
     */
    CustomerType setId(int id);
    
    /**
     * Sets the name of this CustomerType. The name field corresponds to the
     * database column c04cinema.c04cinema.customer_type.name.
     * 
     * @param name to set of this CustomerType
     * @return     this CustomerType instance
     */
    CustomerType setName(String name);
    
    enum Identifier implements ColumnIdentifier<CustomerType> {
        
        ID   ("id"),
        NAME ("name");
        
        private final String columnId;
        private final TableIdentifier<CustomerType> tableIdentifier;
        
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
            return "customer_type";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<CustomerType> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}