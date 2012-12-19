package com.innovasi.isitravel.domain;

import org.joda.time.LocalDateTime;

import java.math.BigDecimal;


public class Hotel implements IDomainObject{
    private String mName;
    private String mAddress;
    private String mPhone;
    private BigDecimal mDailyRate;
    private BigDecimal mDailyTax;
    private LocalDateTime mCheckInDateTime;
    private LocalDateTime mCheckOutDateTime;
    private String mComments;
    private String mCity;
    private String mConfirmationNumber;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public BigDecimal getDailyRate() {
        return mDailyRate;
    }

    public void setDailyRate(BigDecimal dailyRate) {
        mDailyRate = dailyRate;
    }

    public BigDecimal getDailyTax() {
        return mDailyTax;
    }

    public void setDailyTax(BigDecimal dailyTax) {
        mDailyTax = dailyTax;
    }

    public LocalDateTime getCheckInDateTime() {
        return mCheckInDateTime;
    }

    public void setCheckInDateTime(LocalDateTime checkInDateTime) {
        mCheckInDateTime = checkInDateTime;
    }

    public LocalDateTime getCheckOutDateTime() {
        return mCheckOutDateTime;
    }

    public void setCheckOutDateTime(LocalDateTime checkOutDateTime) {
        mCheckOutDateTime = checkOutDateTime;
    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getConfirmationNumber() {
        return mConfirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        mConfirmationNumber = confirmationNumber;
    }
}
