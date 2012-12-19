package com.innovasi.isitravel.repository.contract;

import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

public interface IODataHelper {
    public ODataConsumer getIsiTravelConsumer();
    public String getEntityPropertyValue(OEntity entity, String propertyName);
}
