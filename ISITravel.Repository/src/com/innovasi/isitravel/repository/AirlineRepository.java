package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Airline;
import com.innovasi.isitravel.repository.contract.IAirlineRepository;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.converters.AirlineEntityConverter;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;

public class AirlineRepository implements IAirlineRepository {
    private ODataHelper mODataHelper = null;
    private IEntityConverter mEntityConverter = null;

    public AirlineRepository(ODataHelper oDataHelper) {
        mODataHelper = oDataHelper;
        mEntityConverter = new AirlineEntityConverter();
    }
    public Airline getByAirlineId(int airlineId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        OEntity airline = consumer.getEntities("TravelAirlines").filter("ID eq " + airlineId).execute().firstOrNull();
        return (Airline)mEntityConverter.ConvertEntityToDomainObject(airline);
    }

    public List<Airline> getAll() {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> airlines = consumer.getEntities("TravelAirlines").execute().toList();
        List<Airline> airlineList = new ArrayList<Airline>();
        for (OEntity airline : airlines) {
            airlineList.add((Airline) mEntityConverter.ConvertEntityToDomainObject(airline));
        }
        return airlineList;
    }
}
