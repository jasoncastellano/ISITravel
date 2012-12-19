package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Hotel;
import com.innovasi.isitravel.repository.HotelRepository;
import com.innovasi.isitravel.repository.ODataHelper;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class HotelRepositoryTest {
    private HotelRepository mTarget = new HotelRepository(new ODataHelper());

    @Test
    public void testGetAll() throws Exception {
        List<Hotel> result = mTarget.getAll();
        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void testGetByName() throws Exception {

    }

    @Test
    public void testGetByTravelId() throws Exception {
        List<Hotel> result = mTarget.getByTravelId(19987);
        Assert.assertTrue(result.size() > 0);
    }
}
