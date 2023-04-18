package com.bridgelabs.EmployeePayRoleApp.controller;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.service.EmpService;
import com.bridgelabs.EmployeePayRoleApp.util.JWTToken;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmpService empService;
<<<<<<< Updated upstream
=======
    @Autowired
    private JWTToken jwtToken;
>>>>>>> Stashed changes
    @PostMapping("/add")
    public ResponceDto addEmployee(@Valid @RequestBody EmpDto empDto){
        //String token =empService.addEmployee(empDto);
        //EmpData empData =empService.addEmployee(empDto);
        //ResponceDto responceDto = new ResponceDto(token,token);
        return empService.addEmployee(empDto);
    }

    @GetMapping("/{id}")
    public ResponceDto getEmployeeById(@PathVariable int id){
        EmpData empData = empService.getEmployeeById(id);
        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }
<<<<<<< Updated upstream
=======
    @GetMapping("/token/{token}")
    public ResponseEntity<ResponceDto> getTheDcode(@RequestHeader String token){
        EmpData empData=empService.getEmployeeByToken(token);
        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return new ResponseEntity<>(responceDto, HttpStatus.CREATED);
    }

>>>>>>> Stashed changes
    @GetMapping("/")
    public  ResponceDto getAllEmps(){
        List<EmpData> empData=empService.getAllEmps();
        ResponceDto responceDto =new ResponceDto("The All Employees ",empData);
        return responceDto;
    }
<<<<<<< Updated upstream
=======
    @DeleteMapping("/delete{id}")
    public String Delete(@Valid @PathVariable int id){
        empService.delete(id);
        return "Deleted the data with id -"+ id ;
    }
    @PutMapping("/put/{id}")
    public ResponceDto update(@Valid @RequestBody EmpDto empDto, @PathVariable int id){
        EmpData empData=empService.UpdateEmployee(id ,empDto);
        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }
    @GetMapping("/getdept/{dept}")
    public ResponceDto getEmployeeByDpt(@PathVariable String dept){
        List<EmpData> empData = empService.getEmployeeByDept(dept);
        ResponceDto responceDto = new ResponceDto("Data is",empData);
        return responceDto;
    }


>>>>>>> Stashed changes

}
