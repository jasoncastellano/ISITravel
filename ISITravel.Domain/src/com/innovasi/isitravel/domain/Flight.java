package com.innovasi.isitravel.domain;

import org.joda.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * User: Jason
 * Date: 11/4/12
 * Time: 10:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Flight implements IDomainObject{
    private LocalDateTime mDepartureDateTime;
    private LocalDateTime mArrivalDateTime;
    private String mDepartureLocation;
    private String mArrivalLocation;
    private Airline mAirline;
    private String mFlightNumber;
    private String mSeatComment;
    private Airport FromAirport;
    private Airport ToAirport;

    public LocalDateTime getDepartureDateTime() {
        return mDepartureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        mDepartureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return mArrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
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

    public Airline getAirline() {
        return mAirline;
    }

    public void setAirline(Airline airline) {
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

    public Airport getFromAirport() {
        return FromAirport;
    }

    public void setFromAirport(Airport fromAirport) {
        FromAirport = fromAirport;
    }

    public Airport getToAirport() {
        return ToAirport;
    }

    public void setToAirport(Airport toAirport) {
        ToAirport = toAirport;
    }
}
