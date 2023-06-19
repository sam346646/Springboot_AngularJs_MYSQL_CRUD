package com.sam.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id); //If Employee findEmployeeById(Long id); can't return a exception if employee not found so we use optional
    
}
