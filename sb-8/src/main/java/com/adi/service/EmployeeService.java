package com.adi.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void printMessage(String message) {
		System.out.println("The message is : "+message);;
	}
}
