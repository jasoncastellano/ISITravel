package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Flight;

import java.util.List;

public interface IFlightRepository {
    public List<Flight> getByTravelId(int travelId);
}
