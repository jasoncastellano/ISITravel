package com.innovasi.isitravel.domain;

import org.pojava.datetime.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Jason
 * Date: 11/4/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Hotel {
    private String mName;
    private String mAddress;
    private String mPhone;
    private double mDailyRate;
    private double mDailyTax;
    private DateTime mCheckInDateTime;
    private DateTime mCheckOutDateTime;
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

    public double getDailyRate() {
        return mDailyRate;
    }

    public void setDailyRate(double dailyRate) {
        mDailyRate = dailyRate;
    }

    public double getDailyTax() {
        return mDailyTax;
    }

    public void setDailyTax(double dailyTax) {
        mDailyTax = dailyTax;
    }

    public DateTime getCheckInDateTime() {
        return mCheckInDateTime;
    }

    public void setCheckInDateTime(DateTime checkInDateTime) {
        mCheckInDateTime = checkInDateTime;
    }

    public DateTime getCheckOutDateTime() {
        return mCheckOutDateTime;
    }

    public void setCheckOutDateTime(DateTime checkOutDateTime) {
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
