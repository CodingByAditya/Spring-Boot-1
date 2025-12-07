package com.adi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adi.service.EmployeeService;

@SpringBootApplication
public class Sb8Application implements CommandLineRunner{
	

	private EmployeeService employeeService;
	
	//constructor\\
    public Sb8Application(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
    //setter method\\
//	@Autowired
//	public void setEmployeeService(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(Sb8Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.printMessage("hii good evening....");
	}

}
