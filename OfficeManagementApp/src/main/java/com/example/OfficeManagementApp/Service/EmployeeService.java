package com.example.OfficeManagementApp.Service;

import com.example.OfficeManagementApp.Models.Employee;
import com.example.OfficeManagementApp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(int empId) {
        return employeeRepository.getEmployee(empId);
    }

    public String deleteEmployee(int empId) {
        return employeeRepository.deleteEmployee(empId);
    }

    public String updateSalary(int empId, int newSalary) {
        return employeeRepository.updateSalary(empId,newSalary);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }
}
