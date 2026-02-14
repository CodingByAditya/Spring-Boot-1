package com.adi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
public class StudentController {

	@Autowired
	private Student student;
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/student")
	public void getStudent() {
		System.out.println("H1:...."+student.hashCode());
		System.out.println("H2:...."+service.getStudent().hashCode());
	}
}
