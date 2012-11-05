package com.innovasi.isitravel.domain;

import org.pojava.datetime.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Jason
 * Date: 11/4/12
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Car {
    private String mCompany;
    private String mConfirmationNumber;
    private double mAmount;
    private String mPickupLocation;
    private DateTime mPickupDateTime;
    private String mDropOffLocation;
    private DateTime mDropOffDateTime;
    private String mFrequentFlierNumber;
    private String mComments;
    private String mCity;
    private String mPhone;

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

    public double getAmount() {
        return mAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
    }

    public String getPickupLocation() {
        return mPickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        mPickupLocation = pickupLocation;
    }

    public DateTime getPickupDateTime() {
        return mPickupDateTime;
    }

    public void setPickupDateTime(DateTime pickupDateTime) {
        mPickupDateTime = pickupDateTime;
    }

    public String getDropOffLocation() {
        return mDropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        mDropOffLocation = dropOffLocation;
    }

    public DateTime getDropOffDateTime() {
        return mDropOffDateTime;
    }

    public void setDropOffDateTime(DateTime dropOffDateTime) {
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
