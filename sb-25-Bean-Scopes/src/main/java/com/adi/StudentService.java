package com.adi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class StudentService {

	@Autowired
	private Student student;
	
	public Student getStudent() {
		return student;
		
	}
}
