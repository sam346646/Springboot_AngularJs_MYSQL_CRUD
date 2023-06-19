package com.sam.employee.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.employee.exception.UserNotFoundException;
import com.sam.employee.model.Employee;
import com.sam.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired  //To inject EmployeeService
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }

    //for above deleteEmployeeById() is not a default method so we have created in EmployeeRepository(Refer)

    //Exception handling 
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id)
        .orElseThrow(()-> new UserNotFoundException ("User by id "+id+" not found"));
    }
}
