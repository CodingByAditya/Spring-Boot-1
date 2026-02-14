package com.adi.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adi.entity.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
