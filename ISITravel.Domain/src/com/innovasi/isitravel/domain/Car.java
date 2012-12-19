package com.innovasi.isitravel.domain;

import org.joda.time.LocalDateTime;

import java.math.BigDecimal;

public class Car implements IDomainObject{

    private int mTravelId;
    private String mCompany;
    private String mConfirmationNumber;
    private BigDecimal mAmount;
    private String mPickupLocation;
    private LocalDateTime mPickupDateTime;
    private String mDropOffLocation;
    private LocalDateTime mDropOffDateTime;
    private String mFrequentFlierNumber;
    private String mComments;
    private String mCity;
    private String mPhone;

    public int getTravelId() {
        return mTravelId;
    }

    public void setTravelId(int travelId) {
        mTravelId = travelId;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String company) {
        mCompany = company;
    }

    public String getConfirmationNumber() {
        return mConfirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        mConfirmationNumber = confirmationNumber;
    }

    public BigDecimal getAmount() {
        return mAmount;
    }

    public void setAmount(BigDecimal amount) {
        mAmount = amount;
    }

    public String getPickupLocation() {
        return mPickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        mPickupLocation = pickupLocation;
    }

    public LocalDateTime getPickupDateTime() {
        return mPickupDateTime;
    }

    public void setPickupDateTime(LocalDateTime pickupDateTime) {
        mPickupDateTime = pickupDateTime;
    }

    public String getDropOffLocation() {
        return mDropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        mDropOffLocation = dropOffLocation;
    }

    public LocalDateTime getDropOffDateTime() {
        return mDropOffDateTime;
    }

    public void setDropOffDateTime(LocalDateTime dropOffDateTime) {
        mDropOffDateTime = dropOffDateTime;
    }

    public String getFrequentFlierNumber() {
        return mFrequentFlierNumber;
    }

    public void setFrequentFlierNumber(String frequentFlierNumber) {
        mFrequentFlierNumber = frequentFlierNumber;
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

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }
}
