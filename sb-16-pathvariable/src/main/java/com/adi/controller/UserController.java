package com.adi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adi.model.User;

@RestController
public class UserController {

	@GetMapping("/users/{id}")
	public String getUserById( @PathVariable int id) {
		return "User id is :"+id;
	}
	@GetMapping("/search")
	public String searchProduct(@RequestParam String keyword,
			@RequestParam(required = false,defaultValue = "90") int limit) {
		return keyword+" "+limit;
	}
	@PostMapping("/user")
	public String createUser(@RequestBody User user) {
		return user.getUserId() + " "+user.getUserName();
	}

	
}
