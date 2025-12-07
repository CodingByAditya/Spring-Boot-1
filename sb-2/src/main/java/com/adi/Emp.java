package com.adi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Emp {
 
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	int id;
	@Column(name = "emp_name")
	String name;
	@Column(name = "emp_course")
	String Course;
}
