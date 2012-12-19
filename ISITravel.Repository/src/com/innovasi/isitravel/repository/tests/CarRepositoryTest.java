package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Car;
import com.innovasi.isitravel.repository.CarRepository;
import com.innovasi.isitravel.repository.ODataHelper;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class CarRepositoryTest {

    private CarRepository mTarget = new CarRepository(new ODataHelper());
    @Test
    public void testGetAll() throws Exception {
        List<Car> cars = mTarget.getAll();
        for(Car car : cars) {
            System.out.println(car.getTravelId());
        }
    }

    @Test
    public void testGetByTravelId() throws Exception {
        List<Car> cars = mTarget.getByTravelId(19987);
        Assert.assertTrue(cars.size() > 0);
    }
}
