package com.adi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adi.entity.Employee;
import com.adi.repo.EmployeeRepo;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;

	@PostMapping("/save")
	public ResponseEntity<Object> create(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee Insert Successfully");
	}

	@GetMapping("/get")
	public ResponseEntity<Object> getAllEmployees() {
		employeeRepo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(employeeRepo.findAll());
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> update(@PathVariable String id) {
		Optional<Employee> empId = employeeRepo.findById(id);
		if (empId.isPresent()) {
			Employee existinEmployee = empId.get();
			existinEmployee.setName("Bibhuti Ranjan Behera");
			existinEmployee.setCompany("Microsoft");
			existinEmployee.setAddress("USA");
			employeeRepo.save(existinEmployee);
			return ResponseEntity.status(HttpStatus.OK).body("Employee Update Successfully : " + id);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("EmployeeId is not available : " + id);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable String id) {
		if (employeeRepo.existsById(id)) {
			employeeRepo.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("Employee Deleted Successfully : " + id);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("EmployeeId is not available : " + id);
		}
	}
}
