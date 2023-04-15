package com.bridgelabs.EmployeePayRoleApp.service;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import com.bridgelabs.EmployeePayRoleApp.model.EmpData;

import java.util.List;

public interface EmpService {
    EmpData addEmployee(EmpDto empDto);

    EmpData UpdateEmployee(int id ,EmpDto empDto);
    EmpData getEmployeeById(int id);
    void delete(int id);
    List<EmpData> getAllEmps();

    List<EmpData> getEmployeeByDept(String dept);

}
