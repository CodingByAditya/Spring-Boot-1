package com.adi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Student {

	public Student() {
		System.out.println("Student Bean Created.."+this.hashCode());
	}
}
