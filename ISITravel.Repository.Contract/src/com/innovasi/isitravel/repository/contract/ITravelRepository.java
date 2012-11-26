package com.innovasi.isitravel.repository.contract;


import com.innovasi.isitravel.domain.Employee;
import com.innovasi.isitravel.domain.Travel;
import org.pojava.datetime.DateTime;

import java.util.List;

public interface ITravelRepository {
    public List<Travel> getAll();
    public List<Travel> getByEmployee(Employee employee);
    public List<Travel> getByDateRange(DateTime startDate, DateTime endDate);
    public List<Travel> getByDestination(String destination);
}
