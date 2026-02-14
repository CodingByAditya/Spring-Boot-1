package com.adi;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.adi.entity.Student;
import com.adi.repository.StudentRepo;

@SpringBootApplication
public class Sb13DataJpaApplication {

	public static void main(String[] args) {
	    ApplicationContext context = SpringApplication.run(Sb13DataJpaApplication.class, args);
StudentRepo repo = context.getBean(StudentRepo.class);
		
		
		//we need to create the Student class object
		//insert...
		Student st = new Student();
     	st.setName("Gyana Ranjan Behera");
		st.setAddress("Bhadrak");
		
		repo.save(st);
		
		//read operation
		List<Student> list= (List<Student>) repo.findAll();
		list.forEach(e -> System.out.println(e));
		
		//find data by using id
		Student student = repo.findById(5).get();
		System.out.println(student);
		
		
		//update data
		student.setName("Aditya Rout");
		student.setAddress("Banglore");
		repo.save(student);
		
		//delete data
		Student student1 = repo.findById(5).get();
		repo.delete(student1);
		System.out.println("Deleted Successfully..");

	}
}