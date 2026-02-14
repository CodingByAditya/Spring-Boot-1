package com.coolcoder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/public/welcome")
	public String welcome() {
		return "Welcome to our application...";
	}
	
	@GetMapping("/user/profile")
	public String userProfile() {
		return "Hey you can view your profile...";
	}
	
	@GetMapping("/admin/dashboard")
	public String adminDashboard() {
		return "This is admin dashboard";
	}
}
