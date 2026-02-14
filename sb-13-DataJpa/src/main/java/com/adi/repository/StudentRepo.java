package com.adi.repository;

import org.springframework.data.repository.CrudRepository;

import com.adi.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

	
}
