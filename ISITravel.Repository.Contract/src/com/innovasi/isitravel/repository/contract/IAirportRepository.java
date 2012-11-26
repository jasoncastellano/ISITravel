package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Airport;

import java.util.List;

public interface IAirportRepository {
    List<Airport> getAll();
    List<Airport> getByFlightId(int flightId);
}
