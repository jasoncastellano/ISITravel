package com.innovasi.isitravel.domain;

import org.joda.time.LocalDateTime;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: castellanoj
 * Date: 11/2/12
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Travel implements IDomainObject
{
    private int mTravelId;
    private String mDestination;
    private LocalDateTime mFromDate;
    private LocalDateTime mToDate;
    private String mDepartFrom;
    private String mPurpose;
    private Employee mEmployee;
    private List<Car> mCars;
    private List<Flight> mFlights;
    private List<Hotel> mHotels;

    public int getTravelId() {
        return mTravelId;
    }

    public void setTravelId(int travelId) {
        mTravelId = travelId;
    }

    public String getDestination() {
        return mDestination;
    }

    public void setDestination(String destination) {
        mDestination = destination;
    }

    public LocalDateTime getFromDate() {
        return mFromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        mFromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return mToDate;
    }

    public void setToDate(LocalDateTime toDate) {
        mToDate = toDate;
    }

    public String getDepartFrom() {
        return mDepartFrom;
    }

    public void setDepartFrom(String departFrom) {
        mDepartFrom = departFrom;
    }

    public String getPurpose() {
        return mPurpose;
    }

    public void setPurpose(String purpose) {
        mPurpose = purpose;
    }

    public Employee getEmployee() {
        return mEmployee;
    }

    public void setEmployee(Employee employee) {
        mEmployee = employee;
    }

    public List<Car> getCars() {
        return mCars;
    }

    public void setCars(List<Car> cars) {
        mCars = cars;
    }

    public List<Flight> getFlights() {
        return mFlights;
    }

    public void setFlights(List<Flight> flights) {
        mFlights = flights;
    }

    public List<Hotel> getHotels() {
        return mHotels;
    }

    public void setHotels(List<Hotel> hotels) {
        mHotels = hotels;
    }
}
