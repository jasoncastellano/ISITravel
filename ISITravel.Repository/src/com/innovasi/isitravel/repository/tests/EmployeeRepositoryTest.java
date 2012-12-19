package com.innovasi.isitravel.repository.tests;

import com.innovasi.isitravel.domain.Employee;
import com.innovasi.isitravel.repository.EmployeeRepository;
import com.innovasi.isitravel.repository.ODataHelper;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class EmployeeRepositoryTest {

    private EmployeeRepository mTarget = new EmployeeRepository(new ODataHelper());
    @Test
    public void testGetAll() throws Exception {
        List<Employee> employees = mTarget.getAll();
        System.out.println(employees.size());
    }

    @Test
    public void testGetByEmployeeId() throws Exception {
        Employee employee = mTarget.getByEmployeeId(377);
        Assert.assertEquals("Castellano", employee.getLastName());
        Assert.assertEquals("Jason", employee.getFirstName());
    }
}
