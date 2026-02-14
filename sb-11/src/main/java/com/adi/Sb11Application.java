package com.adi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adi.configuration.EmployeeProperties;

@SpringBootApplication
public class Sb11Application implements CommandLineRunner{

	@Autowired
	private EmployeeProperties empProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(Sb11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(empProperties.toString());
	}

}
