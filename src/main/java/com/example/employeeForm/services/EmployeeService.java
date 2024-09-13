package com.example.employeeForm.services;

import com.example.employeeForm.dtos.EmployeeDTO;
import com.example.employeeForm.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDTO employeeDTO);
    List<Employee> getAllEmployees();

}
