package com.empmgt.EmployeeManagementSystem.repository;

import com.empmgt.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> { //Jpa Repository exposes databases operations to Employee Entity


}
