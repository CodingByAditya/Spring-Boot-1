package com.adi.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MYContoller {

	@GetMapping("/get")
	public String myHome() {
		return "home";
	}
}
