package com.example.employeeForm.controllers;


import com.example.employeeForm.dtos.EmployeeDTO;
import com.example.employeeForm.models.Employee;
import com.example.employeeForm.repositories.EmployeeRepository;
import com.example.employeeForm.services.EmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class EmployeesController {


    private EmployeeService employeeService;


    public EmployeesController(@Qualifier("EmployeeServiceImpl") EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employeeForm")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employeeDTO", new EmployeeDTO());
        return "employeeForm";
    }

    @PostMapping("/submitEmployee")
    public String submitEmployeeForm(@ModelAttribute EmployeeDTO employeeDTO) {
        employeeService.saveEmployee(employeeDTO);
        return "redirect:/employeeForm";
    }
}
