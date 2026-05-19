package com.example.OfficeManagementApp.controller;

import com.example.OfficeManagementApp.Models.Manager;
import com.example.OfficeManagementApp.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/manager")
@RestController
public class ManagerController {


    @Autowired
    ManagerService managerService;

    @PostMapping("/add-manager")
    public String addManager(@RequestBody Manager manager){
        managerService.addManager(manager);

        return "manager is added successfully";
    }

    @GetMapping("/get-manager")
    public Manager getManager(@RequestParam("id") int managerId){

        return managerService.getManager(managerId);
    }

    @DeleteMapping("/delete-manager/{id}")
    public String deleteManager(@PathVariable("id") int managerId){
        return managerService.deleteManager(managerId);
    }

    @PutMapping("/update-reportee")
    public String updateNumberReportees(@RequestParam("id") int managerId, @RequestParam("newReportees") int newReportees){
        managerService.updateNumberReportees(managerId,newReportees);
        return "reportees uppdated successduly";
    }

    @GetMapping
    public List<Manager> getAllManagers(){
        return managerService.getAllManagers();
    }
}
