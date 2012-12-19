package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.repository.contract.IODataHelper;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.consumer.ODataConsumers;
import org.odata4j.core.OEntity;
import org.odata4j.core.OProperty;

public class ODataHelper implements IODataHelper {
    public ODataConsumer getIsiTravelConsumer() {
        return ODataConsumers.create("http://sdhqtfsbuild100.corp.innovasi.com/ISITravel.Services/ISITravelService.svc/");
    }

    public String getEntityPropertyValue(OEntity entity, String propertyName) {
        String value = "";
        OProperty property = entity.getProperty(propertyName);

        if(property != null && property.getValue() != null) {
            value = property.getValue().toString();
        }
        return value;
    }
}
