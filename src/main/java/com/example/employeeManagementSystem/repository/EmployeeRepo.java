package com.example.employeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeManagementSystem.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    
} 
