package com.innovasi.isitravel.repository;

import com.innovasi.isitravel.domain.Employee;
import com.innovasi.isitravel.repository.contract.IEmployeeRepository;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import com.innovasi.isitravel.repository.converters.EmployeeEntityConverter;
import org.odata4j.consumer.ODataConsumer;
import org.odata4j.core.OEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private IEntityConverter mEntityConverter = null;
    private ODataHelper mODataHelper = null;

    public EmployeeRepository(ODataHelper oDataHelper)
    {
        mEntityConverter = new EmployeeEntityConverter();
        mODataHelper = oDataHelper;
    }

    public List<Employee> getAll() {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        List<OEntity> employees = consumer.getEntities("Employees").execute().toList();
        List<Employee> employeeList = new ArrayList<Employee>();
        for (OEntity employee : employees) {
            employeeList.add((Employee)mEntityConverter.ConvertEntityToDomainObject(employee));
        }
        return employeeList;
    }

    public Employee getByEmployeeId(int employeeId) {
        ODataConsumer consumer = mODataHelper.getIsiTravelConsumer();
        OEntity employee = consumer.getEntities("Employees").filter("EmployeeID eq " + employeeId).execute().firstOrNull();
        return (Employee)mEntityConverter.ConvertEntityToDomainObject(employee);
    }
}
