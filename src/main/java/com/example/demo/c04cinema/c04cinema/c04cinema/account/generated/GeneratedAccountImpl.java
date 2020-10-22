package com.example.demo.c04cinema.c04cinema.c04cinema.account.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.account.Account}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountImpl implements Account {
    
    private int id;
    private String username;
    private String password;
    
    protected GeneratedAccountImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getUsername() {
        return Optional.ofNullable(username);
    }
    
    @Override
    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }
    
    @Override
    public Account setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Account setUsername(String username) {
        this.username = username;
        return this;
    }
    
    @Override
    public Account setPassword(String password) {
        this.password = password;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "       + Objects.toString(getId()));
        sj.add("username = " + Objects.toString(OptionalUtil.unwrap(getUsername())));
        sj.add("password = " + Objects.toString(OptionalUtil.unwrap(getPassword())));
        return "AccountImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Account)) { return false; }
        final Account thatAccount = (Account)that;
        if (this.getId() != thatAccount.getId()) { return false; }
        if (!Objects.equals(this.getUsername(), thatAccount.getUsername())) { return false; }
        if (!Objects.equals(this.getPassword(), thatAccount.getPassword())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getUsername()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPassword()));
        return hash;
    }
}