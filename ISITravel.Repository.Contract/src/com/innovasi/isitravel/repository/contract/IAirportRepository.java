package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Airport;
import com.innovasi.isitravel.domain.Flight;

import java.util.List;

public interface IAirportRepository {
    List<Airport> getAll();
    List<Airport> getByFlight(Flight flight);
    Airport getByAirportId(int airportId);
}
