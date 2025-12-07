package com.adi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adi.service.Address;

@RestController
public class Student {

	@Autowired
	private Address address;
	
	//Constructor\\
//    public Student(Address address) {
//    	    super();
//		this.address = address;
//	}

    //Setter Method\\
//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	
	
	@GetMapping("/address")
	public String getStudentAddress() {
		return address.studentAddress();
	}
}
