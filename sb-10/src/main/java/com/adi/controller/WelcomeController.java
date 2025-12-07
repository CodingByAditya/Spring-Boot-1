package com.adi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getMessage() {
		System.out.println("Dispacther Servlet Activated.....");
		return "Welcome to springboot..";
	}
}
