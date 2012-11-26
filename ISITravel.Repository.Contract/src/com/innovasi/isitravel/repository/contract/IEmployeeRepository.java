package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Employee;

import java.util.List;

public interface IEmployeeRepository {
    public List<Employee> getAll();
    public Employee getByEmployeeId(int employeeId);
}
