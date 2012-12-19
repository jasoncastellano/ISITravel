package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Travel;
import com.innovasi.isitravel.repository.ODataHelper;
import com.innovasi.isitravel.repository.TravelRepository;
import org.joda.time.LocalDateTime;
import org.junit.Test;

import java.util.List;

public class TravelRepositoryTest {

    private TravelRepository mTarget = new TravelRepository(new ODataHelper());
    @Test
    public void testGetAll() throws Exception {
        List<Travel> travels = mTarget.getAll();

        System.out.println(travels.size());
    }

    @Test
    public void testGetByEmployeeId() {
        List<Travel> travels = mTarget.getByEmployeeId(377);
        System.out.println(travels.size());
    }

    @Test
    public void testGetByDateRange() {
        List<Travel> travels = mTarget.getByDateRange(new LocalDateTime(2012, 1, 1, 0, 0), new LocalDateTime(2012, 12, 31, 0, 0));
        System.out.println(travels.size());
    }

    @Test
    public void testGetByDestination() {
        List<Travel> travels = mTarget.getByDestination("Las Vegas, NV");
        System.out.println(travels.size());
    }
}
