package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Flight;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.contract.IFlightRepository;
import com.innovasi.isitravel.repository.converters.FlightEntityConverter;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository implements IFlightRepository {
    private IEntityConverter mEntityConverter = null;
    private ODataHelper mODataHelper = null;

    public FlightRepository(ODataHelper oDataHelper) {
        mODataHelper = oDataHelper;
        mEntityConverter = new FlightEntityConverter();
    }
    public List<Flight> getByTravelId(int travelId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> flights = consumer.getEntities("TravelFlights").filter("LeaveID eq " + travelId).expand("TravelAirportFrom,TravelAirportTo,TravelAirline").execute().toList();
        List<Flight> flightList = new ArrayList<Flight>();
        for (OEntity flight : flights) {
            flightList.add((Flight) mEntityConverter.ConvertEntityToDomainObject(flight));
        }
        return flightList;
    }

    public Flight getByFlightId(int flightId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        OEntity flight = consumer.getEntities("TravelFlights").filter("FlightID eq " + flightId).expand("TravelAirportFrom,TravelAirportTo,TravelAirline").execute().firstOrNull();
        return (Flight)mEntityConverter.ConvertEntityToDomainObject(flight);
    }
}
