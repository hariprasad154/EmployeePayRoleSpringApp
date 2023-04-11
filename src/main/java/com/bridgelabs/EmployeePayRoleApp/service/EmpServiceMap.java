package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceMap implements  EmpService{
    @Autowired
    private EmpRepo empRepo;
    @Override
    public EmpData addEmployee(EmpDto empDto) {
        EmpData empData=new EmpData(empDto);
        return empRepo.save(empData);
    }
}
