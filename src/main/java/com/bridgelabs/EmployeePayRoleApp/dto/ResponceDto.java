package com.bridgelabs.EmployeePayRoleApp.dto;

public class ResponceDto {
    public Object data;
    public String message;

    public ResponceDto(String message,Object data){
        this.data=data;
        this.message=message;
    }
}
