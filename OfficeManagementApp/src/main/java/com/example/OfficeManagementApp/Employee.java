package com.example.OfficeManagementApp;

public class Employee {
    private int empId;
    private String  empName;
    private int age;
    private String department;
    private int salary;
    private String gender;

    public Employee(int empId, int age, String empName, String department, int salary, String gender) {
        this.empId = empId;
        this.age = age;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
