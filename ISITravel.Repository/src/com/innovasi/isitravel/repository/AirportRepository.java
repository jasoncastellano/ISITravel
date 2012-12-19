package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Airport;
import com.innovasi.isitravel.domain.Flight;
import com.innovasi.isitravel.repository.contract.IAirportRepository;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.converters.AirportEntityConverter;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;

public class AirportRepository implements IAirportRepository {
    private ODataHelper mODataHelper = null;
    private IEntityConverter mEntityConverter = null;

    public AirportRepository(ODataHelper oDataHelper) {
        mODataHelper = oDataHelper;
        mEntityConverter = new AirportEntityConverter();
    }
    public List<Airport> getAll() {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> airports = consumer.getEntities("TravelAirports").execute().toList();
        List<Airport> airportList = new ArrayList<Airport>();
        for (OEntity airport : airports) {
            airportList.add((Airport) mEntityConverter.ConvertEntityToDomainObject(airport));
        }
        return airportList;
    }

    public List<Airport> getByFlight(Flight flight) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> airports = consumer.getEntities("TravelAirports").filter("ID eq " + flight.getToAirport().getAirportId() + " or ID eq " + flight.getFromAirport().getAirportId()).execute().toList();
        List<Airport> airportList = new ArrayList<Airport>();
        for (OEntity airport : airports) {
            airportList.add((Airport) mEntityConverter.ConvertEntityToDomainObject(airport));
        }
        return airportList;
    }

    public Airport getByAirportId(int airportId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        OEntity airport = consumer.getEntities("TravelAirports").filter("ID eq " + airportId).execute().firstOrNull();
        return (Airport)mEntityConverter.ConvertEntityToDomainObject(airport);
    }
}
