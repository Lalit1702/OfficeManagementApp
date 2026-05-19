package com.example.OfficeManagementApp.controller;

import com.example.OfficeManagementApp.Models.Employee;
import com.example.OfficeManagementApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    //HashMap as database


    @Autowired
    EmployeeService employeeService;


    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        //employeeDb.put(employee.getEmpId(),employee);
        employeeService.addEmployee(employee);
        System.out.println(employee);
        return "Employee Registered Successfully";

    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId){
            return employeeService.getEmployee(empId);
            //return employeeDb.get(empId);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId){
        return employeeService.deleteEmployee(empId);

    }

    @PutMapping("/update-salary")
    public String updateSalary(@RequestParam("id") int empId,@RequestParam("newSalary") int newSalary){
        return employeeService.updateSalary(empId,newSalary);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

}
