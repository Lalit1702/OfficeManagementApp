package com.example.OfficeManagementApp.Repository;

import com.example.OfficeManagementApp.Models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {

    Map<Integer, Employee> employeeDb = new HashMap<>();

    public void addEmployee(Employee employee) {
        employeeDb.put(employee.getEmpId(),employee);
    }

    public Employee getEmployee(int empId) {
        return employeeDb.get(empId);
    }

    public String  deleteEmployee(int empId) {
        if(employeeDb.containsKey( empId)) {
            employeeDb.remove(empId);
            return "employee deleted successfully";
        }
        return "no employee with giv en id to delete";
    }

    public String updateSalary(int empId, int newSalary) {
        if(employeeDb.containsKey(empId)){
            employeeDb.get(empId).setSalary(newSalary);
            return "salary is been updated";
        }
        return "no employee available with the given employee id";
    }


    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        for(int id : employeeDb.keySet()){
            employees.add(employeeDb.get(id));
        }
        return  employees;
    }
}
