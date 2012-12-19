package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Hotel;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.contract.IHotelRepository;
import com.innovasi.isitravel.repository.contract.IODataHelper;
import com.innovasi.isitravel.repository.converters.HotelEntityConverter;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;


public class HotelRepository implements IHotelRepository {
    private IODataHelper mODataHelper = null;
    private IEntityConverter mEntityConverter = null;

    public HotelRepository(IODataHelper odataHelper) {
        mODataHelper = odataHelper;
        mEntityConverter = new HotelEntityConverter();
    }
    public List<Hotel> getAll() {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> hotels = consumer.getEntities("TravelHotels").execute().toList();
        List<Hotel> hotelList = new ArrayList<Hotel>();
        for (OEntity hotel : hotels) {
            hotelList.add((Hotel) mEntityConverter.ConvertEntityToDomainObject(hotel));
        }
        return hotelList;
    }

    public List<Hotel> getByName(String name) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> hotels = consumer.getEntities("TravelHotels").filter("Name eq '" + name + "'").execute().toList();
        List<Hotel> hotelList = new ArrayList<Hotel>();
        for (OEntity hotel : hotels) {
            hotelList.add((Hotel) mEntityConverter.ConvertEntityToDomainObject(hotel));
        }
        return hotelList;
    }

    public List<Hotel> getByTravelId(int travelId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> hotels = consumer.getEntities("TravelHotels").filter("LeaveID eq " + travelId).execute().toList();
        List<Hotel> hotelList = new ArrayList<Hotel>();
        for (OEntity hotel : hotels) {
            hotelList.add((Hotel) mEntityConverter.ConvertEntityToDomainObject(hotel));
        }
        return hotelList;
    }
}
