package com.adi.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig1 {

	public MyConfig1() {
		System.out.println("Config Class-1 loaded..");
	}
}
