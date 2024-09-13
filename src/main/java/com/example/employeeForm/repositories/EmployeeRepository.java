package com.example.employeeForm.repositories;

import com.example.employeeForm.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
