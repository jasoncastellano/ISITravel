package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.Airport;
import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.odata4j.core.OEntity;

public class AirportEntityConverter implements IEntityConverter {
    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Airport airport = new Airport();
        airport.setCity(entity.getProperty("City", String.class).getValue());
        airport.setCode(entity.getProperty("Code", String.class).getValue());
        airport.setCountry(entity.getProperty("Country", String.class).getValue());
        airport.setName(entity.getProperty("Name", String.class).getValue());
        airport.setState(entity.getProperty("State", String.class).getValue());
        airport.setAirportId(entity.getProperty("ID", int.class).getValue());
        return airport;
    }
}
