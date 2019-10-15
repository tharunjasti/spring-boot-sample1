package com.java.davita.springbootsample.service;

import com.java.davita.springbootsample.model.Employee;
import com.java.davita.springbootsample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired private EmployeeRepository employeeRepository;

   public List<Employee> getAllEmployees(){
   return   employeeRepository.findAll();
    }

    public Employee getEmployeById(int id){
       return employeeRepository.findById(id).get();
    }

    public Employee saveEmploye(Employee employee){
        return employeeRepository.save(employee);
    }
}
