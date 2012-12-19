package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Flight;
import com.innovasi.isitravel.repository.FlightRepository;
import com.innovasi.isitravel.repository.ODataHelper;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class FlightRepositoryTest {
    private FlightRepository mTarget = new FlightRepository(new ODataHelper());

    @Test
    public void testGetByTravelId() throws Exception {
        List<Flight> flights = mTarget.getByTravelId(19987);
        Assert.assertTrue(flights.size() > 0);
    }

    @Test
    public void testGetByFlightId() {
        Flight flight = mTarget.getByFlightId(1120);
        Assert.assertTrue(flight != null);
    }

}
