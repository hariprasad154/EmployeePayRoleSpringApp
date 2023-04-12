package com.bridgelabs.EmployeePayRoleApp.model;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmpData {

    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private double salary;

    public EmpData(EmpDto empDto) {
        this.name=empDto.name;
        this.salary= empDto.salary;

    }

    public EmpData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
