package com.bridgelabs.EmployeePayRoleApp.model;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor

public class EmpData {

    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private double salary;

    public EmpData(EmpDto empDto) {
        this.name=empDto.getName();
        this.salary= empDto.getSalary();

    }

    }
