package com.example.componentmapping;

import com.example.componentmapping.models.Address;
import com.example.componentmapping.models.Employee;
import com.example.componentmapping.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentmappingApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testCreate() {

        Employee employee = new Employee();
        employee.setId(12312);
        employee.setName("Catalin");

        Address address = new Address();

        address.setCity("Galati");
        address.setCountry("RO");
        address.setState("State");
        address.setStreetaddress("Street");
        address.setZipcode("zipcode");

        employee.setAddress(address);

        employeeRepository.save(employee);

    }

}
