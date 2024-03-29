package com.example.demo.c04cinema.c04cinema.c04cinema.account.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
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
 * com.example.demo.c04cinema.c04cinema.c04cinema.account.Account}-interface
 * representing entities of the {@code account}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccount {
    
    /**
     * This Field corresponds to the {@link Account} field that can be obtained
     * using the {@link Account#getId()} method.
     */
    IntField<Account, Integer> ID = IntField.create(
        Identifier.ID,
        Account::getId,
        Account::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Account} field that can be obtained
     * using the {@link Account#getUsername()} method.
     */
    StringField<Account, String> USERNAME = StringField.create(
        Identifier.USERNAME,
        o -> OptionalUtil.unwrap(o.getUsername()),
        Account::setUsername,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Account} field that can be obtained
     * using the {@link Account#getPassword()} method.
     */
    StringField<Account, String> PASSWORD = StringField.create(
        Identifier.PASSWORD,
        o -> OptionalUtil.unwrap(o.getPassword()),
        Account::setPassword,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this Account. The id field corresponds to the database
     * column c04cinema.c04cinema.account.id.
     * 
     * @return the id of this Account
     */
    int getId();
    
    /**
     * Returns the username of this Account. The username field corresponds to
     * the database column c04cinema.c04cinema.account.username.
     * 
     * @return the username of this Account
     */
    Optional<String> getUsername();
    
    /**
     * Returns the password of this Account. The password field corresponds to
     * the database column c04cinema.c04cinema.account.password.
     * 
     * @return the password of this Account
     */
    Optional<String> getPassword();
    
    /**
     * Sets the id of this Account. The id field corresponds to the database
     * column c04cinema.c04cinema.account.id.
     * 
     * @param id to set of this Account
     * @return   this Account instance
     */
    Account setId(int id);
    
    /**
     * Sets the username of this Account. The username field corresponds to the
     * database column c04cinema.c04cinema.account.username.
     * 
     * @param username to set of this Account
     * @return         this Account instance
     */
    Account setUsername(String username);
    
    /**
     * Sets the password of this Account. The password field corresponds to the
     * database column c04cinema.c04cinema.account.password.
     * 
     * @param password to set of this Account
     * @return         this Account instance
     */
    Account setPassword(String password);
    
    enum Identifier implements ColumnIdentifier<Account> {
        
        ID       ("id"),
        USERNAME ("username"),
        PASSWORD ("password");
        
        private final String columnId;
        private final TableIdentifier<Account> tableIdentifier;
        
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
            return "account";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Account> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}