package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImp implements  EmpService{

    List<EmpData> list=new ArrayList<>();

    @Autowired
    private EmpRepo empRepo;
    @Override
    public EmpData addEmployee(EmpDto empDto) {
        EmpData empData=new EmpData(empDto);
        list.add(empData);
        return empRepo.save(empData);
    }

    @Override
    public Optional<EmpData> getEmployeeById(int id) {
        return empRepo.findById(id);
    }

}
