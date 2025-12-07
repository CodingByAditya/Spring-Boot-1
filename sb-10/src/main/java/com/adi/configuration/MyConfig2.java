package com.adi.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig2 {

	public MyConfig2() {
		System.out.println("Config Class-2 loaded..");
	}
}