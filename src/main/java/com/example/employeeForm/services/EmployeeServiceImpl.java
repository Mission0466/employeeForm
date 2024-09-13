package com.example.employeeForm.services;

import com.example.employeeForm.dtos.EmployeeDTO;
import com.example.employeeForm.models.Employee;
import com.example.employeeForm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setSecondName(employeeDTO.getSecondName());
        employee.setUserName(employeeDTO.getUserName());
        employee.setPassword(employeeDTO.getPassword());
        employee.setAddress(employeeDTO.getAddress());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
