package com.bridgelabs.EmployeePayRoleApp.repository;

import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<EmpData,Integer> {
}
