package com.bridgelabs.EmployeePayRoleApp.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

@Data

public class EmpDto {
    @NotEmpty(message = "The Name is notEmpty")
    private String name;
    @Min(value = 400,message = "The minumum salary shoud be >400")
    private double salary;
}
