package com.example.employeeManagementSystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagementSystem.model.Employee;
import com.example.employeeManagementSystem.service.EmployeeService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class employeeController {
   
    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee  saveEmployee(@RequestBody Employee employee ) {
        return service.saveEmployee(employee);
    }


    @GetMapping("/byId/{id}")
    public Employee getEmployeeById(@PathVariable Integer id ) {
        return service.getEmployee(id);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllData(){
        return service.getAllData();
    }

    @DeleteMapping ("/deleteEmployee/{id}")
    public boolean deleteEmployeeById(@PathVariable Integer id ) {
        System.out.println("SSSSSSSSS");
        System.out.println(id);
        return service.deleteEmployee(id);
    }
}

   
    

