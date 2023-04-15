package com.bridgelabs.EmployeePayRoleApp.repository;

import com.bridgelabs.EmployeePayRoleApp.model.EmpData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<EmpData,Integer> {
    @Query(value = "select * from emp_data,emp_dept where department = :dept",nativeQuery = true)
    List<EmpData> findByDept(String dept);
}
