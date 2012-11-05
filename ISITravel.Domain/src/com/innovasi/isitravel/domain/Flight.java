package com.innovasi.isitravel.domain;

import org.pojava.datetime.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Jason
 * Date: 11/4/12
 * Time: 10:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Flight {
    private DateTime mDepartureDateTime;
    private DateTime mArrivalDateTime;
    private String mDepartureLocation;
    private String mArrivalLocation;
    private String mAirline;
    private String mFlightNumber;
    private String mSeatComment;
    private String FromAirport;
    private String ToAirport;

    public DateTime getDepartureDateTime() {
        return mDepartureDateTime;
    }

    public void setDepartureDateTime(DateTime departureDateTime) {
        mDepartureDateTime = departureDateTime;
    }

    public DateTime getArrivalDateTime() {
        return mArrivalDateTime;
    }

    public void setArrivalDateTime(DateTime arrivalDateTime) {
        mArrivalDateTime = arrivalDateTime;
    }

    public String getDepartureLocation() {
        return mDepartureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        mDepartureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return mArrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        mArrivalLocation = arrivalLocation;
    }

    public String getAirline() {
        return mAirline;
    }

    public void setAirline(String airline) {
        mAirline = airline;
    }

    public String getFlightNumber() {
        return mFlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        mFlightNumber = flightNumber;
    }

    public String getSeatComment() {
        return mSeatComment;
    }

    public void setSeatComment(String seatComment) {
        mSeatComment = seatComment;
    }

    public String getFromAirport() {
        return FromAirport;
    }

    public void setFromAirport(String fromAirport) {
        FromAirport = fromAirport;
    }

    public String getToAirport() {
        return ToAirport;
    }

    public void setToAirport(String toAirport) {
        ToAirport = toAirport;
    }
}
