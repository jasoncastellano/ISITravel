package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.Airline;
import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.odata4j.core.OEntity;

public class AirlineEntityConverter implements IEntityConverter {

    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Airline airline = new Airline();
        airline.setAirlineId(entity.getProperty("ID", int.class).getValue());
        airline.setEnabled(entity.getProperty("Enabled", boolean.class).getValue());
        airline.setName(entity.getProperty("Name", String.class).getValue());
        airline.setUrlCheckIn(entity.getProperty("URLCheckIn", String.class).getValue());

        return airline;
    }
}
