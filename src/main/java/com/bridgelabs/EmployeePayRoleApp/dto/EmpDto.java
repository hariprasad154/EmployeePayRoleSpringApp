package com.bridgelabs.EmployeePayRoleApp.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Data

public class EmpDto {
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$",message = "The Name is notEmpty")
    private String name;
    @Min(value = 400,message = "The minumum salary shoud be >400")
    private double salary;
    @NotEmpty(message = "The gender is not empty")
    private String gender;
    @NotEmpty(message = "The profilepicnot empty")
    private  String profilePic;

    private List<String> department;

    private LocalDate startDate;
    @NotEmpty(message = "The note shoud be written")
    private String note;
    private List<String> phoneNumber;


}
