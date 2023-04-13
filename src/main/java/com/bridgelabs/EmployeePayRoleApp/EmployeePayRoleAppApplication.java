package com.bridgelabs.EmployeePayRoleApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayRoleAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeePayRoleAppApplication.class, args);
		log.info("Application was started...");

	}

}
