package com.adi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfileController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To Infosicy Family....";
	}
}
