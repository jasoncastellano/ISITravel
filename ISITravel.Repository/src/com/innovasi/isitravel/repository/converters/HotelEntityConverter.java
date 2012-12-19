package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.Hotel;
import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.joda.time.LocalDateTime;
import org.odata4j.core.OEntity;

import java.math.BigDecimal;

public class HotelEntityConverter implements IEntityConverter {
    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Hotel hotel = new Hotel();
        hotel.setAddress(entity.getProperty("Address", String.class).getValue());
        hotel.setCheckInDateTime(entity.getProperty("CheckInDateTime", LocalDateTime.class).getValue());
        hotel.setCheckOutDateTime(entity.getProperty("CheckOutDateTime", LocalDateTime.class).getValue());
        hotel.setCity(entity.getProperty("City", String.class).getValue());
        hotel.setComments(entity.getProperty("Comments", String.class).getValue());
        hotel.setConfirmationNumber(entity.getProperty("ConfirmNum", String.class).getValue());
        hotel.setDailyRate(entity.getProperty("DailyRate", BigDecimal.class).getValue());
        hotel.setDailyTax(entity.getProperty("DailyTax", BigDecimal.class).getValue());
        hotel.setName(entity.getProperty("HotelName", String.class).getValue());
        hotel.setPhone(entity.getProperty("Phone", String.class).getValue());
        return hotel;
    }
}
