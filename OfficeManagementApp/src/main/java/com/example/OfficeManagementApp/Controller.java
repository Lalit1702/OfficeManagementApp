package com.example.OfficeManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    //HashMap as database
    Map<Integer, Employee> employeeDb = new HashMap<>();
    Map<Integer,Manager> managerDb = new HashMap<>();

    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        employeeDb.put(employee.getEmpId(),employee);
        System.out.println(employee);
        return "Employee Registered Successfully";

    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId){

            return employeeDb.get(empId);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId){
        if(employeeDb.containsKey( empId)) {
            employeeDb.remove(empId);
            return "employee deleted successfully";
        }
        return "no employee with giv en id to delete";
    }

    @PutMapping("/update-salary")
    public String updateSalary(@RequestParam("id") int empId,@RequestParam("newSalary") int newSalary){
        if(employeeDb.containsKey(empId)){
            employeeDb.get(empId).setSalary(newSalary);
            return "salary is been updated";
        }
        return "no employee available with the given employee id";
    }

    @PostMapping("/add-manager")
    public String addManager(@RequestBody Manager manager){
        managerDb.put(manager.getManagerId(),manager);
        return "manager is added successfully";
    }

    @GetMapping("/get-manager")
    public Manager getManager(@RequestParam("id") int managerId){
        return managerDb.get(managerId);
    }

    @DeleteMapping("/delete-manager/{id}")
    public String deleteManager(@PathVariable("id") int managerId){
        if(managerDb.containsKey(managerId)){
            managerDb.remove(managerId);
            return "manager removed successfully";
        }
        return "no available manager with the given id";
    }

    public String updateNumberReportees(@RequestParam("id") int managerId, @RequestParam("newReportees") int newReportees){
        managerDb.get(managerId).setNumberOfReportees(newReportees);
        return "reportees uppdated successduly";
    }
}
