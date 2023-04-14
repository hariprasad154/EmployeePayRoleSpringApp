package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.exception.EmployeeCustomException;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public EmpData UpdateEmployee(int id ,EmpDto empDto) {
        EmpData empData=this.getEmployeeById(id);
        empData.updateEmpData(empDto);
        return  empRepo.save(empData);
//        empRepo.findById(id).get().setStartDate(empDto.getStartDate());
//        empRepo.findById(id).get().setDepartment(empDto.getDepartment());
//        empRepo.findById(id).get().setNote(empDto.getNote());
//        empRepo.findById(id).get().setGender(empDto.getGender());
//        empRepo.findById(id).get().setName(empDto.getName());
//        empRepo.findById(id).get().setPhoneNumber(empDto.getPhoneNumber());
//        empRepo.findById(id).get().setProfilePic(empDto.getProfilePic());
    }

    @Override
    public EmpData getEmployeeById(int id) {

        return empRepo.findById(id).orElseThrow(() -> new EmployeeCustomException(" Employee Not found .. wih id: "+ id));
    }

    @Override
    public void delete(int id) {
        EmpData empData=this.getEmployeeById(id);
        empRepo.delete(empData);
    }

    @Override
    public List<EmpData> getAllEmps() {
        return empRepo.findAll();
    }

}
