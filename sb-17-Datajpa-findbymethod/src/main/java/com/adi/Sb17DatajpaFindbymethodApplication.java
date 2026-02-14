package com.adi;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.adi.entity.Student;
import com.adi.repo.StudentRepo;

@SpringBootApplication
public class Sb17DatajpaFindbymethodApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Sb17DatajpaFindbymethodApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student findByName = repo.findByName("Priya Sahoo");
		System.out.println(findByName);
		
		Student findByAddress = repo.findByAddress("Bengaluru");
		System.out.println(findByAddress);
		
		Student findByNameAndAddress = repo.findByNameAndAddress("Ananya Das", "Kolkata");
		System.out.println(findByNameAndAddress);
		
		List<Student> findByNameOrAddress = repo.findByNameOrAddress("Ravi Mishra", "Kolkata");
        findByNameOrAddress.forEach(e->System.out.println(e));
        
        //pageable creation and sort
        Sort sort = Sort .by("id").descending();
        Pageable pageable = PageRequest.of(0, 9,sort);
        Page<Student> page = repo.findAll(pageable);
        page.get().forEach(e->System.out.println(e));
        System.out.println("Size: "+page.getSize());
        System.out.println("Elements: "+page.getTotalElements());
        System.out.println("Pages: "+page.getTotalPages());
	}
}
