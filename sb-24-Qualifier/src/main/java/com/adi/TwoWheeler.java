package com.adi;

import org.springframework.stereotype.Component;

@Component("twoWheelerBean")
public class TwoWheeler implements Vehicle {

	@Override
	public int noOfWheels() {
		
		return 2;
	}

}
