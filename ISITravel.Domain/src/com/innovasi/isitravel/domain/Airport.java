package com.innovasi.isitravel.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Jason
 * Date: 11/4/12
 * Time: 10:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Airport implements IDomainObject {
    private String mName;
    private String mCity;
    private String mState;
    private String mCountry;
    private String mCode;
    private int mAirportId;

    public int getAirportId() {
        return mAirportId;
    }

    public void setAirportId(int airportId) {
        mAirportId = airportId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }
}
