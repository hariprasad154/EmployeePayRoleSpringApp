package com.bridgelabs.EmployeePayRoleApp.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
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
    @Pattern(regexp = "male|female|Male|Female",message = "The gender is not empty")
    private String gender;
    @NotBlank(message = "The profilepicnot empty")
    private  String profilePic;
    @NotEmpty(message = "The depaartment shoud not beempty")
    private List<String> department;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @NotBlank(message = "The note shoud be written")
    private String note;
    @NotEmpty(message = "The Phone number is not empty")
    private String phoneNumber;


}
