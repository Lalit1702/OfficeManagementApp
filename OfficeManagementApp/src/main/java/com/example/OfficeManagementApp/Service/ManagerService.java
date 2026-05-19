package com.example.OfficeManagementApp.Service;

import com.example.OfficeManagementApp.Models.Manager;
import com.example.OfficeManagementApp.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;

    public void addManager(Manager manager) {
        managerRepository.addManager(manager);
    }

    public Manager getManager(int managerId) {
        return managerRepository.getManager(managerId);
    }

    public String deleteManager(int managerId) {
        return managerRepository.deleteManager(managerId);
    }

    public void updateNumberReportees(int managerId, int newReportees) {
        managerRepository.updateNumberReportees(managerId,newReportees);
    }

    public List<Manager> getAllManagers() {
        return managerRepository.getAllManagers();
    }
}
