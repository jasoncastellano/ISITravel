package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Airline;

import java.util.List;

public interface IAirlineRepository {

    public Airline getByAirlineId(int airlineId);

    public List<Airline> getAll();
}
