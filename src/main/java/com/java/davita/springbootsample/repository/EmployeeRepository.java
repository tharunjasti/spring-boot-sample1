package com.java.davita.springbootsample.repository;

import com.java.davita.springbootsample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
