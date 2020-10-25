package com.example.demo.c04cinema.model_dto;

import java.sql.Date;

public class PathCusDTO {

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

    public PathCusDTO(int id, String name, String address, Integer customerTypeId, Integer currentBonusPoint, Integer accountId, String email, Date birthday, String phone, Byte isactive, String gender, String cardid, String code) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.customerTypeId = customerTypeId;
        this.currentBonusPoint = currentBonusPoint;
        this.accountId = accountId;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
        this.isactive = isactive;
        this.gender = gender;
        this.cardid = cardid;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Integer getCurrentBonusPoint() {
        return currentBonusPoint;
    }

    public void setCurrentBonusPoint(Integer currentBonusPoint) {
        this.currentBonusPoint = currentBonusPoint;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getIsactive() {
        return isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
