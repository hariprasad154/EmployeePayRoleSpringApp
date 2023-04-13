package com.bridgelabs.EmployeePayRoleApp.controller;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.service.EmpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @PostMapping("/add")
    public ResponceDto addEmployee(@Valid @RequestBody EmpDto empDto){
        EmpData empData =empService.addEmployee(empDto);
        ResponceDto responceDto = new ResponceDto("Data added ",empData);
        return responceDto;
    }
    @GetMapping("/{id}")
    public ResponceDto getEmployeeById(@PathVariable int id){
        Optional<EmpData> empData = empService.getEmployeeById(id);
        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }
    @GetMapping("/")
    public  ResponceDto getAllEmps(){
        List<EmpData> empData=empService.getAllEmps();
        ResponceDto responceDto =new ResponceDto("The All Employees ",empData);
        return responceDto;
    }

}
