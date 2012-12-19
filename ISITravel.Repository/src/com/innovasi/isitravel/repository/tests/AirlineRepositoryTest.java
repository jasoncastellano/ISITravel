package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Airline;
import com.innovasi.isitravel.repository.AirlineRepository;
import com.innovasi.isitravel.repository.ODataHelper;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class AirlineRepositoryTest {

    private AirlineRepository mTarget = new AirlineRepository(new ODataHelper());
    @Test
    public void testGetByAirlineId() throws Exception {
        //TODO: Update with valid AirlineId
        Airline result = mTarget.getByAirlineId(0);
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetAll() throws Exception {
        List<Airline> result = mTarget.getAll();
        Assert.assertTrue(result.size() > 0);
    }
}
