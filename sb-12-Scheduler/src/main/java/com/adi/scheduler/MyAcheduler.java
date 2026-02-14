package com.adi.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyAcheduler {

//	@Scheduled(cron = "1 * * * * ? ")
//	public void runInEveryOneMinute() {
//		System.out.println("****Every One Minute.......");
//	}
//	@Scheduled(fixedRate = 5000)
//	public void runInEveryOneSecond() {
//		System.out.println("Every One Second.......");
//    }
	@Scheduled(fixedRate = 1000, initialDelay = 6000)
	public void runWithDelay() {
		System.out.println("---Delay Every One Second.......");
    }
}
