package com.example.OfficeManagementApp.Repository;

import com.example.OfficeManagementApp.Models.Manager;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ManagerRepository {

    Map<Integer, Manager> managerDb = new HashMap<>();

    public void addManager(Manager manager) {
        managerDb.put(manager.getManagerId(),manager);
    }

    public Manager getManager(int managerId) {
        return managerDb.get(managerId);
    }

    public String deleteManager(int managerId){
        if(managerDb.containsKey(managerId)){
            managerDb.remove(managerId);
            return "manager removed successfully";
        }
        return "no available manager with the given id";
    }

    public void updateNumberReportees(int managerId, int newReportees) {
        managerDb.get(managerId).setNumberOfReportees(newReportees);
    }

    public List<Manager> getAllManagers() {
        List<Manager> managerList = new ArrayList<>();
        for(int id:managerDb.keySet()){
            managerList.add(managerDb.get(id));
        }
        return managerList;
    }
}
