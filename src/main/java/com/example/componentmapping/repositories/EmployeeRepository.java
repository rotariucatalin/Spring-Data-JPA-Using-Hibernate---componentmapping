package com.example.componentmapping.repositories;

import com.example.componentmapping.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
