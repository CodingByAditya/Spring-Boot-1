package com.adi.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

	public MyBean2() {
		System.out.println("Bean-2 scanned by IOC..");
	}
}