package com.innovasi.isitravel.repository.contract;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.consumer.ODataConsumers;
import org.odata4j.core.OEntity;
import org.odata4j.core.OProperty;

public interface IODataHelper {
    public ODataConsumer getIsiTravelConsumer();
}
