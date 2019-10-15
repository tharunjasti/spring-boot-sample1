package com.java.davita.springbootsample.controller;

import com.java.davita.springbootsample.model.Employee;
import com.java.davita.springbootsample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeeController {

    @Autowired  private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployes() {

        return employeeService.getAllEmployees();
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id) {

        return employeeService.getEmployeById(id);
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmploye(employee);
    }

}
