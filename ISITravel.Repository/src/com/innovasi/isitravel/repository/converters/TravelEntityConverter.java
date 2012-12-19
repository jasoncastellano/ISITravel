package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.*;
import com.innovasi.isitravel.repository.contract.IEntityCollectionConverter;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.joda.time.LocalDateTime;
import org.odata4j.core.OEntity;
import org.odata4j.core.ORelatedEntitiesLink;
import org.odata4j.core.ORelatedEntityLink;

import java.util.List;

public class TravelEntityConverter implements IEntityConverter {
    private IEntityConverter mHotelEntityConverter = null;
    private IEntityConverter mFlightEntityConverter = null;
    private IEntityConverter mCarEntityConverter = null;
    private IEntityConverter mEmployeeEntityConverter = null;
    private IEntityCollectionConverter mEntityCollectionConverter = null;

    public TravelEntityConverter(IEntityConverter hotelEntityConverter, IEntityConverter flightEntityConverter, IEntityConverter carEntityConverter, IEntityConverter employeeEntityConverter, IEntityCollectionConverter entityCollectionConverter) {
        mHotelEntityConverter = hotelEntityConverter;
        mFlightEntityConverter = flightEntityConverter;
        mCarEntityConverter = carEntityConverter;
        mEmployeeEntityConverter = employeeEntityConverter;
        mEntityCollectionConverter = entityCollectionConverter;
    }

    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Travel travel = new Travel();
        travel.setDestination(entity.getProperty("Destination", String.class).getValue());
        travel.setFromDate(entity.getProperty("FromDate", LocalDateTime.class).getValue());
        travel.setToDate(entity.getProperty("ToDate", LocalDateTime.class).getValue());
        travel.setDepartFrom(entity.getProperty("DepartFrom", String.class).getValue());
        travel.setPurpose(entity.getProperty("Purpose", String.class).getValue());
        travel.setTravelId(entity.getProperty("LeaveID", int.class).getValue());

        List<OEntity> cars = entity.getLink("Cars", ORelatedEntitiesLink.class).getRelatedEntities();
        List<OEntity> flights = entity.getLink("Flights", ORelatedEntitiesLink.class).getRelatedEntities();
        List<OEntity> hotels = entity.getLink("Hotels", ORelatedEntitiesLink.class).getRelatedEntities();
        OEntity employee = entity.getLink("Employee", ORelatedEntityLink.class).getRelatedEntity();

        if(cars != null) {
            List<Car> carList = mEntityCollectionConverter.ConvertEntityCollectionToDomainObjectCollection(cars, mCarEntityConverter);
            travel.setCars(carList);
        }

        if(flights != null) {
            List<Flight> flightList = mEntityCollectionConverter.ConvertEntityCollectionToDomainObjectCollection(flights, mFlightEntityConverter);
            travel.setFlights(flightList);
        }

        if(hotels != null) {
           List<Hotel> hotelList = mEntityCollectionConverter.ConvertEntityCollectionToDomainObjectCollection(hotels, mHotelEntityConverter);
            travel.setHotels(hotelList);
        }

        if(employee != null) {
            travel.setEmployee((Employee)mEmployeeEntityConverter.ConvertEntityToDomainObject(employee));
        }

        return travel;
    }
}
