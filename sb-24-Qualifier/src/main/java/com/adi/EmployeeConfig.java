package com.adi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfig {

	@Bean("FirstEmployee")
	public Employee getEmployee() {
		return new Employee(10L,"Aditya");
	}
	
	@Bean("SecondEmployee")
	@Primary
	public Employee getEmployee2() {
		return new Employee(20L,"Gudu");
	}
}
