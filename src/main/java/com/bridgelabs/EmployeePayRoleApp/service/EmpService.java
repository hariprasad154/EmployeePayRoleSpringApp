package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;

public interface EmpService {

    EmpData addEmployee(EmpDto empDto);
}
