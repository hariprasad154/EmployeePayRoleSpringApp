package com.bridgelabs.EmployeePayRoleApp.model;

import com.bridgelabs.EmployeePayRoleApp.dto.EmpDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class EmpData {

    @Id
    @GeneratedValue
    private int empId;
    private String name;
    private double salary;
    private String gender;
    private  String profilePic;

    private LocalDate startDate;

    private String note;

    private String phoneNumber;
    @ElementCollection
    @CollectionTable(name = "emp_Dept",joinColumns = @JoinColumn(name = "empId"))
    private List<String> department;
    public EmpData(EmpDto empDto) {
        this.updateEmpData(empDto);
    }
    public void updateEmpData(EmpDto empData){
        this.name=empData.getName();
        this.salary= empData.getSalary();
        this.gender=empData.getGender();
        this.note= empData.getNote();
        this.phoneNumber=empData.getPhoneNumber();
        this.department=empData.getDepartment();
        this.profilePic= empData.getProfilePic();
        this.startDate=empData.getStartDate();
    }


    }
