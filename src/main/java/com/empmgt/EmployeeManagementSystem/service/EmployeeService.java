package com.empmgt.EmployeeManagementSystem.service;

import com.empmgt.EmployeeManagementSystem.model.Employee;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee); //to add employees

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
