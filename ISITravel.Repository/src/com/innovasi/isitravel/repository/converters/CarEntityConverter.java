package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.Car;
import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.joda.time.LocalDateTime;
import org.odata4j.core.OEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarEntityConverter implements IEntityConverter {
    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Car car = new Car();
        car.setAmount(entity.getProperty("Amount", BigDecimal.class).getValue());
        car.setCity(entity.getProperty("City", String.class).getValue());
        car.setComments(entity.getProperty("Comments", String.class).getValue());
        car.setCompany(entity.getProperty("Company", String.class).getValue());
        car.setConfirmationNumber(entity.getProperty("ConfirmNum", String.class).getValue());
        car.setDropOffDateTime(entity.getProperty("DropOffDateTime", LocalDateTime.class).getValue());
        car.setDropOffLocation(entity.getProperty("DropOffLocation", String.class).getValue());
        car.setFrequentFlierNumber(entity.getProperty("FreqFlyerNum", String.class).getValue());
        car.setPhone(entity.getProperty("Phone", String.class).getValue());
        car.setPickupDateTime(entity.getProperty("PickupDateTime", LocalDateTime.class).getValue());
        car.setPickupLocation(entity.getProperty("PickupLocation", String.class).getValue());
        car.setTravelId(entity.getProperty("LeaveID", int.class).getValue());
        return car;
    }

    public List<? extends IDomainObject> ConvertEntityCollectionToDomainObjectCollection(List<OEntity> entities) {
        List<Car> cars = new ArrayList<Car>();
        if(entities != null) {
            for(OEntity entity : entities) {
                cars.add((Car)ConvertEntityToDomainObject(entity));
            }
        }
        return cars;
    }
}
