package com.adi.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/map")
public class MyContoller {

	@GetMapping("/name")
	public String getName() {
		return "My Name Is Aditya"; 
	}
	@GetMapping("/age")
	public String getAge() {
		return "My Age Is 20"; 
	}
	@GetMapping("/address")
	public String getAddress() {
		return "My Address Is Uttarbahini,Garadpur,Bhadrak ."; 
	}
}
