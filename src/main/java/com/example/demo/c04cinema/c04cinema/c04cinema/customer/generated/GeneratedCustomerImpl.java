package com.example.demo.c04cinema.c04cinema.c04cinema.customer.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.Account;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer_type.CustomerType;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

import static java.util.Optional.ofNullable;

/**
 * The generated base implementation of the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerImpl implements Customer {
    
    private int id;
    private String name;
    private String address;
    private Integer customerTypeId;
    private Integer currentBonusPoint;
    private Integer accountId;
    private String email;
    private Date birthday;
    private String phone;
    private Byte isactive;
    private String gender;
    private String cardid;
    private String code;
    private String imageUrl;
    
    protected GeneratedCustomerImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getName() {
        return ofNullable(name);
    }
    
    @Override
    public Optional<String> getAddress() {
        return ofNullable(address);
    }
    
    @Override
    public OptionalInt getCustomerTypeId() {
        return OptionalUtil.ofNullable(customerTypeId);
    }
    
    @Override
    public OptionalInt getCurrentBonusPoint() {
        return OptionalUtil.ofNullable(currentBonusPoint);
    }
    
    @Override
    public OptionalInt getAccountId() {
        return OptionalUtil.ofNullable(accountId);
    }
    
    @Override
    public Optional<String> getEmail() {
        return ofNullable(email);
    }
    
    @Override
    public Optional<Date> getBirthday() {
        return ofNullable(birthday);
    }
    
    @Override
    public Optional<String> getPhone() {
        return ofNullable(phone);
    }
    
    @Override
    public Optional<Byte> getIsactive() {
        return ofNullable(isactive);
    }
    
    @Override
    public Optional<String> getGender() {
        return ofNullable(gender);
    }
    
    @Override
    public Optional<String> getCardid() {
        return ofNullable(cardid);
    }
    
    @Override
    public Optional<String> getCode() {
        return ofNullable(code);
    }
    
    @Override
    public Optional<String> getImageUrl() {
        return ofNullable(imageUrl);
    }
    
    @Override
    public Customer setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Customer setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public Customer setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
        return this;
    }
    
    @Override
    public Customer setCurrentBonusPoint(Integer currentBonusPoint) {
        this.currentBonusPoint = currentBonusPoint;
        return this;
    }
    
    @Override
    public Customer setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }
    
    @Override
    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }
    
    @Override
    public Customer setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }
    
    @Override
    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    @Override
    public Customer setIsactive(Byte isactive) {
        this.isactive = isactive;
        return this;
    }
    
    @Override
    public Customer setGender(String gender) {
        this.gender = gender;
        return this;
    }
    
    @Override
    public Customer setCardid(String cardid) {
        this.cardid = cardid;
        return this;
    }
    
    @Override
    public Customer setCode(String code) {
        this.code = code;
        return this;
    }
    
    @Override
    public Customer setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    @Override
    public Optional<CustomerType> findCustomerTypeId(Manager<CustomerType> foreignManager) {
        if (getCustomerTypeId().isPresent()) {
            return foreignManager.stream().filter(CustomerType.ID.equal(getCustomerTypeId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public Optional<Account> findAccountId(Manager<Account> foreignManager) {
        if (getAccountId().isPresent()) {
            return foreignManager.stream().filter(Account.ID.equal(getAccountId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "                + Objects.toString(getId()));
        sj.add("name = "              + Objects.toString(OptionalUtil.unwrap(getName())));
        sj.add("address = "           + Objects.toString(OptionalUtil.unwrap(getAddress())));
        sj.add("customerTypeId = "    + Objects.toString(OptionalUtil.unwrap(getCustomerTypeId())));
        sj.add("currentBonusPoint = " + Objects.toString(OptionalUtil.unwrap(getCurrentBonusPoint())));
        sj.add("accountId = "         + Objects.toString(OptionalUtil.unwrap(getAccountId())));
        sj.add("email = "             + Objects.toString(OptionalUtil.unwrap(getEmail())));
        sj.add("birthday = "          + Objects.toString(OptionalUtil.unwrap(getBirthday())));
        sj.add("phone = "             + Objects.toString(OptionalUtil.unwrap(getPhone())));
        sj.add("isactive = "          + Objects.toString(OptionalUtil.unwrap(getIsactive())));
        sj.add("gender = "            + Objects.toString(OptionalUtil.unwrap(getGender())));
        sj.add("cardid = "            + Objects.toString(OptionalUtil.unwrap(getCardid())));
        sj.add("code = "              + Objects.toString(OptionalUtil.unwrap(getCode())));
        sj.add("imageUrl = "          + Objects.toString(OptionalUtil.unwrap(getImageUrl())));
        return "CustomerImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Customer)) { return false; }
        final Customer thatCustomer = (Customer)that;
        if (this.getId() != thatCustomer.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatCustomer.getName())) { return false; }
        if (!Objects.equals(this.getAddress(), thatCustomer.getAddress())) { return false; }
        if (!Objects.equals(this.getCustomerTypeId(), thatCustomer.getCustomerTypeId())) { return false; }
        if (!Objects.equals(this.getCurrentBonusPoint(), thatCustomer.getCurrentBonusPoint())) { return false; }
        if (!Objects.equals(this.getAccountId(), thatCustomer.getAccountId())) { return false; }
        if (!Objects.equals(this.getEmail(), thatCustomer.getEmail())) { return false; }
        if (!Objects.equals(this.getBirthday(), thatCustomer.getBirthday())) { return false; }
        if (!Objects.equals(this.getPhone(), thatCustomer.getPhone())) { return false; }
        if (!Objects.equals(this.getIsactive(), thatCustomer.getIsactive())) { return false; }
        if (!Objects.equals(this.getGender(), thatCustomer.getGender())) { return false; }
        if (!Objects.equals(this.getCardid(), thatCustomer.getCardid())) { return false; }
        if (!Objects.equals(this.getCode(), thatCustomer.getCode())) { return false; }
        if (!Objects.equals(this.getImageUrl(), thatCustomer.getImageUrl())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAddress()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCustomerTypeId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCurrentBonusPoint()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAccountId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getEmail()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getBirthday()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPhone()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getIsactive()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getGender()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCardid()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCode()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getImageUrl()));
        return hash;
    }
}