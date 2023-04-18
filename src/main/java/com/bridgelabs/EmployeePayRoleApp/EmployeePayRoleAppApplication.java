package com.bridgelabs.EmployeePayRoleApp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayRoleAppApplication {
	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(EmployeePayRoleAppApplication.class, args);
		log.info("Application was started... in {}Environment ",context.getEnvironment().getProperty("environment"));
		log.info("Application was started... in DB{}User ",context.getEnvironment().getProperty("spring.datasource.username"));

	}


}
