package com.adi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adi.entity.User;
import com.adi.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@Tag(
		name = "UserController",
		description = "This is an user controller which contains all the endpoint"
		)

public class UserController {
	
	@Autowired
	private UserService userService;

	@Operation(
			summary = "POST operation on User",
			description = "This method is used to save the user into database"
			)
	@PostMapping("/save")
	public ResponseEntity<?> saveUser(@RequestBody @Valid User user){
		User saveUser = userService.saveUser(user);
		
		if(ObjectUtils.isEmpty(saveUser)) {
			return new ResponseEntity<>("User not saved",HttpStatus.INTERNAL_SERVER_ERROR);

		}else {
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
		}
	}
	
	@Operation(
			summary = "GET operation on User",
			description = "This method is used to Get the user info from database"
			)
	@GetMapping("/getUsers")
	public ResponseEntity<?> getAllUser(){
		List<User> allUsers = userService.getAllUser();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}
	
	@Operation(
			summary = "PUT operation on User",
			description = "This method is used to update the user into database"
			)
	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody User user){
		User updateUser = userService.updateUser(user);
		if(ObjectUtils.isEmpty(updateUser)) {
			return new ResponseEntity<>("User not Updated",HttpStatus.INTERNAL_SERVER_ERROR);

		}else {
			return new ResponseEntity<>(updateUser,HttpStatus.CREATED);
		}		
	}
	
	@Operation(
			summary = "DELETE operation on User",
			description = "This method is used to delete the user from database"
			)
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id){
		userService.deleteUser(id);
		return new ResponseEntity<>("User Delete Successfully",HttpStatus.OK);
	}
	
	@Operation(
			summary = "GETBYUSERID operation on User",
			description = "This method is used to Get the user info from database based on userid"
			)
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable Integer id){
		User userById = userService.getUserById(id);
		if(ObjectUtils.isEmpty(userById)) {
			return new ResponseEntity<>("User Not found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(userById,HttpStatus.OK);
		
	}
	
}
