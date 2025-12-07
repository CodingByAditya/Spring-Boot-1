package com.adi.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean1 {

	public MyBean1() {
		System.out.println("Bean-1 scanned by IOC..");
	}
}
