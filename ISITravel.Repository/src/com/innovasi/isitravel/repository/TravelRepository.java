package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Employee;
import com.innovasi.isitravel.domain.Travel;
import com.innovasi.isitravel.repository.contract.IODataHelper;
import com.innovasi.isitravel.repository.contract.ITravelRepository;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;
import org.odata4j.core.OProperty;
import org.pojava.datetime.DateTime;

import java.util.List;

public class TravelRepository implements ITravelRepository {

    private IODataHelper mODataHelper = null;
    public TravelRepository(IODataHelper odataHelper)
    {
        mODataHelper = odataHelper;
    }
    public List<Travel> getAll() {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> travels = consumer.getEntities("Travels").execute().toList();
        travels.get(0).
                    List<OEntity> travels = c.getEntities("Employees").nav(myId, "Travel").execute().toList();
                    for (OEntity travel : travels) {
                      for (OProperty<?> p : travel.getProperties()) {
                        System.out.println(String.format("%s: %s", p.getName(), p.getValue()));
                      }
                     System.out.println("\n");
                    }
    }

    public List<Travel> getByEmployee(Employee employee) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Travel> getByDateRange(DateTime startDate, DateTime endDate) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<Travel> getByDestination(String destination) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
