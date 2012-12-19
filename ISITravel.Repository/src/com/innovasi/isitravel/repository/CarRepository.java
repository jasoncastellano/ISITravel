package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Car;
import com.innovasi.isitravel.repository.contract.ICarRepository;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.contract.IODataHelper;
import com.innovasi.isitravel.repository.converters.CarEntityConverter;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;


public class CarRepository implements ICarRepository {

    private IODataHelper mODataHelper = null;
        private IEntityConverter mEntityConverter = null;
        public CarRepository(IODataHelper odataHelper) {
            mODataHelper = odataHelper;
            mEntityConverter = new CarEntityConverter();
        }

    public List<Car> getAll() {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> cars = consumer.getEntities("TravelCars").execute().toList();
        List<Car> carList = new ArrayList<Car>();
        for (OEntity car : cars) {
            carList.add((Car) mEntityConverter.ConvertEntityToDomainObject(car));
        }
        return carList;
    }

    public List<Car> getByTravelId(int travelId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> cars = consumer.getEntities("TravelCars").filter("LeaveID eq " + travelId).execute().toList();
        List<Car> carList = new ArrayList<Car>();
        for (OEntity car : cars) {
            carList.add((Car) mEntityConverter.ConvertEntityToDomainObject(car));
        }
        return carList;
    }
}
