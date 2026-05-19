package com.example.OfficeManagementApp.Models;

public class Manager {
    private int managerId;
    private String name;
    private int age;
    private int numberOfReportees;
    private String department;

    public Manager(int managerId, int age, String name, String department, int numberOfReportees) {
        this.managerId = managerId;
        this.age = age;
        this.name = name;
        this.department = department;
        this.numberOfReportees = numberOfReportees;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
