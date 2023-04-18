package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.dto.ResponceDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;

import java.util.List;
import java.util.Optional;

public interface EmpService {
<<<<<<< Updated upstream
    EmpData addEmployee(EmpDto empDto);
=======
    ResponceDto addEmployee(EmpDto empDto);

    EmpData UpdateEmployee(int id ,EmpDto empDto);
>>>>>>> Stashed changes
    EmpData getEmployeeById(int id);
    List<EmpData> getAllEmps();
<<<<<<< Updated upstream
=======

    List<EmpData> getEmployeeByDept(String dept);

    EmpData getEmployeeByToken(String token);
>>>>>>> Stashed changes
}
