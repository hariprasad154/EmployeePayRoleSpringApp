package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.exception.EmployeeCustomException;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import com.bridgelabs.EmployeePayRoleApp.repository.EmpRepo;
import com.bridgelabs.EmployeePayRoleApp.util.JWTToken;
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
    @Autowired
    private JWTToken jwtToken;
    @Override
    public ResponceDto addEmployee(EmpDto empDto) {
        EmpData empData=new EmpData(empDto);
        empRepo.save(empData);
        String token=jwtToken.createToken(empData.getEmpId());
        list.add(empData);
        ResponceDto responceDto=new ResponceDto(token,empData);
        return responceDto;
    }


    @Override
    public EmpData getEmployeeById(int id) {

        return empRepo.findById(id).orElseThrow(() -> new EmployeeCustomException(" Employee Not found .. wih id: "+ id));
    }
    @Override
    public List<EmpData> getAllEmps() {
        return empRepo.findAll();
    }
<<<<<<< Updated upstream

=======
    @Override
    public List<EmpData> getEmployeeByDept(String dept) {
        return empRepo.findByDept(dept);
    }
    @Override
    public EmpData getEmployeeByToken(String token) {
        int id=jwtToken.decodeToken(token);
        return empRepo.findById(id).orElseThrow(() -> new EmployeeCustomException(" Employee Not found .. wih id: "+ id));
    }
>>>>>>> Stashed changes
}
