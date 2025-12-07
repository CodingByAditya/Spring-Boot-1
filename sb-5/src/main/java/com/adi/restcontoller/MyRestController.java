package com.adi.restcontoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/post")
	public String myPage() {
		return "Hii Coming Yaar";
	}
}
