package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.domain.Travel;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.joda.time.LocalDateTime;
import org.odata4j.core.OEntity;
import org.odata4j.core.ORelatedEntitiesLink;
import org.odata4j.core.ORelatedEntityLink;

import java.util.List;

public class TravelEntityConverter implements IEntityConverter {
    private IEntityConverter mHotelEntityConverter = new HotelEntityConverter();
    private IEntityConverter mFlightEntityConverter = new FlightEntityConverter();
    private IEntityConverter mCarEntityConverter = new CarEntityConverter();
    private IEntityConverter mEmployeeEntityConverter = new EmployeeEntityConverter();

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

        }
        return travel;
    }
}
