package com.bridgelabs.EmployeePayRoleApp.controller;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.repository.EmpRepo;
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
        EmpData empData = empService.getEmployeeById(id);
        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }

    @GetMapping("/")
    public  ResponceDto getAllEmps(){
        List<EmpData> empData=empService.getAllEmps();
        ResponceDto responceDto =new ResponceDto("The All Employees ",empData);
        return responceDto;
    }
    @DeleteMapping("/delete{id}")
    public String Delete(@Valid @PathVariable int id){
        empService.delete(id);
        return "Deleted the data with id -"+ id ;
    }
    @PutMapping("/put/{id}")
    public ResponceDto update(@Valid @RequestBody EmpDto empDto, @PathVariable int id){
        EmpData empData=empService.UpdateEmployee(id ,empDto);

          //EmpData empData = empService.getEmployeeById(id);
//        empData.setName(empDto.getName());
//        empData.setDepartment(empDto.getDepartment());
//        empData.setNote(empDto.getNote());
//        empData.setGender(empDto.getGender());
//        empData.setSalary(empDto.getSalary());
//        empData.setPhoneNumber(empDto.getPhoneNumber());
//        empData.setProfilePic(empDto.getProfilePic());
//        empData.setStartDate(empDto.getStartDate());

        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }
    @GetMapping("/getdept/{dept}")
    public ResponceDto getEmployeeByDpt(@PathVariable String dept){
        List<EmpData> empData = empService.getEmployeeByDept(dept);

        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }



}
