package com.adi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Sb12SchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb12SchedulerApplication.class, args);
	}

}
