package com.adi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adi.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	//here we will add the finder methods
	Student findByName(String name);
	Student findByAddress(String address);
	Student findByNameAndAddress(String name,String address);
	List<Student> findByNameOrAddress(String name,String address);


}
