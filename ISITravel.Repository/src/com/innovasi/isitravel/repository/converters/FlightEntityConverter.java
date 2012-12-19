package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.*;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.joda.time.LocalDateTime;
import org.odata4j.core.OEntity;
import org.odata4j.core.ORelatedEntityLink;


public class FlightEntityConverter implements IEntityConverter {
    IEntityConverter mAirportEntityConverter = null;
    IEntityConverter mAirlineEntityConverter = null;
    public FlightEntityConverter()
    {
        mAirportEntityConverter = new AirportEntityConverter();
        mAirlineEntityConverter = new AirlineEntityConverter();
    }

    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Flight flight = new Flight();
        flight.setArrivalDateTime(entity.getProperty("ArrivalDateTime", LocalDateTime.class).getValue());
        flight.setArrivalLocation(entity.getProperty("ArrivalLocation", String.class).getValue());
        flight.setDepartureLocation(entity.getProperty("DepartLocation", String.class).getValue());
        flight.setDepartureDateTime(entity.getProperty("DepartDateTime", LocalDateTime.class).getValue());
        flight.setFlightNumber(entity.getProperty("FlightNum", String.class).getValue());
        flight.setSeatComment(entity.getProperty("SeatComment", String.class).getValue());

        OEntity fromAirport = entity.getLink("TravelAirportFrom", ORelatedEntityLink.class).getRelatedEntity();
        OEntity toAirport = entity.getLink("TravelAirportTo", ORelatedEntityLink.class).getRelatedEntity();
        OEntity airline = entity.getLink("TravelAirline", ORelatedEntityLink.class).getRelatedEntity();
        if(fromAirport != null) {
            flight.setFromAirport((Airport)mAirportEntityConverter.ConvertEntityToDomainObject(fromAirport));
        }

        if(toAirport != null) {
            flight.setToAirport((Airport)mAirportEntityConverter.ConvertEntityToDomainObject(toAirport));
        }

        if(airline != null) {
            flight.setAirline((Airline)mAirlineEntityConverter.ConvertEntityToDomainObject(airline));
        }

        return flight;
    }
}
