package com.innovasi.isitravel.repository.contract;


import com.innovasi.isitravel.domain.Travel;
import org.joda.time.LocalDateTime;

import java.util.List;

public interface ITravelRepository {
    public List<Travel> getAll(int limit);
    public List<Travel> getByEmployeeId(int employeeId);
    public List<Travel> getByDateRange(LocalDateTime startDate, LocalDateTime endDate);
    public List<Travel> getByDestination(String destination);
}
