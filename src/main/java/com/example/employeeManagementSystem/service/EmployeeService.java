package com.example.employeeManagementSystem.service;
import java.util.List;
// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.employeeManagementSystem.model.Employee;
import com.example.employeeManagementSystem.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    };
 
    public Employee getEmployee(Integer Id){
        return employeeRepository.findById(Id).orElse(null);

    };

    public List<Employee> getAllData(){
                return  employeeRepository.findAll();
    }

    public boolean deleteEmployee(Integer id) {
        boolean isDeleteTrue = false;
       employeeRepository.deleteById(id);
       isDeleteTrue = true;

       return isDeleteTrue;

       
    }; 

   
         


     }




    
        

