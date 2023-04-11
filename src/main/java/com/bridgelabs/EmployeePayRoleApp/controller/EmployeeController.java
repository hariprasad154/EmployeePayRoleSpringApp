package com.bridgelabs.EmployeePayRoleApp.controller;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
