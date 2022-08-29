/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learning.employeerestfulapi.service;

import com.learning.employeerestfulapi.model.Employee;
import com.learning.employeerestfulapi.repository.EmployeeRepository;
import com.learning.employeerestfulapi.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Fiqih Leonhart
 */
@Service
public class EmployeeService 
{
    
     @Autowired
     EmployeeRepository empRepository;

    @Autowired
    PhotoRepository jabatanRepository;

    // CREATE
    public Employee createEmployee(Employee emp) {
        return empRepository.save(emp);
    }

    // READ
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

    // DELETE
    public void deleteEmployee(Long empId) {
        empRepository.deleteById(empId);
    }
    
    // UPDATE
    public Employee updateEmployee(Long empId, Employee employeeDetails)
    {
            Employee emp = empRepository.findById(empId).get();
            emp.setFirstName(employeeDetails.getFirstName());
            emp.setLastName(employeeDetails.getLastName());
            emp.setEmailId(employeeDetails.getEmailId());



            return empRepository.save(emp);                                
    }
     
     
    
}
