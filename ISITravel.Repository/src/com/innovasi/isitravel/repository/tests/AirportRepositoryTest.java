package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Airport;
import com.innovasi.isitravel.domain.Flight;
import com.innovasi.isitravel.repository.AirportRepository;
import com.innovasi.isitravel.repository.ODataHelper;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class AirportRepositoryTest {
    private AirportRepository mTarget = new AirportRepository(new ODataHelper());
    @Test
    public void testGetAll() throws Exception {
        List<Airport> result = mTarget.getAll();
        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void testGetByFlight() throws Exception {
        Flight flight = new Flight();
        Airport toAirport = new Airport();
        Airport fromAirport = new Airport();
        toAirport.setAirportId(34);
        fromAirport.setAirportId(34);
        flight.setToAirport(toAirport);
        flight.setFromAirport(fromAirport);
        List<Airport> result = mTarget.getByFlight(flight);

        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void testGetByAirportId() throws Exception {
        Airport result = mTarget.getByAirportId(34);
        Assert.assertNotNull(result);
    }
}
