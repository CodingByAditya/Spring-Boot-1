package com.adi.component;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	public void getStudent() {
		System.out.println("The student name is aditya");
	}
	
	Address address;
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.getStudent();
		
	}
}
