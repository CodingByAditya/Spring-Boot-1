package com.adi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To Our Home..";
	}
	
	@GetMapping("/lunch")
	public String lunch() {
		return "you can enjoy the lunch..";
	}
	
	@GetMapping("/bye")
	public String bye() {
		return "Bye see you soon..";
	}
}
