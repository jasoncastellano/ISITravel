package com.innovasi.isitravel.repository.converters;

import com.innovasi.isitravel.domain.Employee;
import com.innovasi.isitravel.domain.IDomainObject;
import com.innovasi.isitravel.repository.contract.IEntityConverter;
import org.odata4j.core.OEntity;

public class EmployeeEntityConverter implements IEntityConverter {
    public IDomainObject ConvertEntityToDomainObject(OEntity entity) {
        Employee employee = new Employee();
        employee.setEmployeeId(entity.getProperty("EmployeeID", int.class).getValue());
        employee.setDomainUsername(entity.getProperty("DomainUsername", String.class).getValue());
        employee.setFirstName(entity.getProperty("FirstName", String.class).getValue());
        employee.setLastName(entity.getProperty("LastName", String.class).getValue());
        employee.setPreferredName(entity.getProperty("PreferredName", String.class).getValue());
        return employee;
    }
}
