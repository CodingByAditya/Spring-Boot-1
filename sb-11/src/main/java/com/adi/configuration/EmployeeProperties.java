package com.adi.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ConfigurationProperties(prefix = "employee")
@PropertySource(value = "classpath:application.properties")
public class EmployeeProperties {

	@Value("${employee.name}")
	private String name;
	@Value("${employee.age}")
	private int age;
	@Value("${employee.designation}")
    private String designation;
	@Value("${employee.company}")
	private String company;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "EmployeeProperties [name=" + name + ", age=" + age + ", designation=" + designation + ", company="
				+ company + "]";
	}
	
}
