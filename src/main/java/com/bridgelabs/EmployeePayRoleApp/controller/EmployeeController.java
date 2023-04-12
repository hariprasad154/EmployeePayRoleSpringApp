package com.bridgelabs.EmployeePayRoleApp.controller;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @PostMapping("/add")
    public ResponceDto addEmployee(@RequestBody EmpDto empDto){
        EmpData empData =empService.addEmployee(empDto);
        ResponceDto responceDto = new ResponceDto("Data added ",empData);
        return responceDto;
    }
    @GetMapping("/{id}")
    public ResponceDto getEmployeeById(@PathVariable int id){
        Optional<EmpData> empData = empService.getEmployeeById(id);
        ResponceDto responceDto = new ResponceDto("Data added ",empData);
        return responceDto;
    }

}
