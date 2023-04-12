package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;

import java.util.Optional;

public interface EmpService {

    EmpData addEmployee(EmpDto empDto);

     Optional<EmpData> getEmployeeById(int id);

}
