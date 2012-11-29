package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.repository.contract.IODataHelper;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.consumer.ODataConsumers;

public class ODataHelper implements IODataHelper {
    public ODataConsumer getIsiTravelConsumer() {
        return ODataConsumers.create("http://sdhqtfsbuild100.corp.innovasi.com/ISITravel.Services/ISITravelService.svc/");
    }
}
