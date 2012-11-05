package com.innovasi.isitravel.domain;

import java.util.List;

import org.pojava.datetime.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: castellanoj
 * Date: 11/2/12
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Travel
{
    private String mDestination;
    private DateTime mFromDate;
    private DateTime mToDate;
    private String mDepartFrom;
    private String mPurpose;
    private Employee mEmployee;
    private List<Car> mCars;
    private List<Flight> mFlights;
    private List<Hotel> mHotels;

    public String getDestination() {
        return mDestination;
    }

    public void setDestination(String destination) {
        mDestination = destination;
    }

    public DateTime getFromDate() {
        return mFromDate;
    }

    public void setFromDate(DateTime fromDate) {
        mFromDate = fromDate;
    }

    public DateTime getToDate() {
        return mToDate;
    }

    public void setToDate(DateTime toDate) {
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
