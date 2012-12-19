package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Travel;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.contract.IODataHelper;
import com.innovasi.isitravel.repository.contract.ITravelRepository;
import com.innovasi.isitravel.repository.converters.*;
import org.joda.time.LocalDateTime;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;

public class TravelRepository implements ITravelRepository {

    private IODataHelper mODataHelper = null;
    private IEntityConverter mTravelEntityConverter = null;
    private String mFullExpandPredicate = "Cars,Flights/TravelAirline,Flights/TravelAirportTo,Flights/TravelAirportFrom,Hotels,Employee";


    public TravelRepository(IODataHelper odataHelper)
    {
        mODataHelper = odataHelper;
        mTravelEntityConverter = new TravelEntityConverter(new HotelEntityConverter(), new FlightEntityConverter(), new CarEntityConverter(), new EmployeeEntityConverter(), new EntityCollectionConverter());
    }

    public List<Travel> getAll() {
        List<Travel> travelList = new ArrayList<Travel>();
        try {
            ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
            List<OEntity> travels = consumer.getEntities("Travels").expand(mFullExpandPredicate).execute().toList();

            for (OEntity travel : travels) {
                travelList.add((Travel) mTravelEntityConverter.ConvertEntityToDomainObject(travel));
            }

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return travelList;
    }

    public List<Travel> getByEmployeeId(int employeeId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> travels = consumer.getEntities("Travels").filter("EmployeeID eq " + employeeId).expand(mFullExpandPredicate).execute().toList();
        List<Travel> travelList = new ArrayList<Travel>();
        for (OEntity travel : travels) {
            travelList.add((Travel) mTravelEntityConverter.ConvertEntityToDomainObject(travel));
        }
        return travelList;
    }

    public List<Travel> getByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> travels = consumer.getEntities("Travels").filter("FromDate ge datetime'" + startDate + "' and ToDate le datetime'" + endDate + "'").expand(mFullExpandPredicate).execute().toList();
        List<Travel> travelList = new ArrayList<Travel>();
        for (OEntity travel : travels) {
            travelList.add((Travel) mTravelEntityConverter.ConvertEntityToDomainObject(travel));
        }
        return travelList;
    }

    public List<Travel> getByDestination(String destination) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> travels = consumer.getEntities("Travels").filter("Destination eq '" + destination + "'").expand(mFullExpandPredicate).execute().toList();
        List<Travel> travelList = new ArrayList<Travel>();
        for (OEntity travel : travels) {
            travelList.add((Travel) mTravelEntityConverter.ConvertEntityToDomainObject(travel));
        }
        return travelList;
    }
}
