package com.adi;

import org.springframework.stereotype.Component;

@Component("fourWheelerBean")
public class FourWheeler implements Vehicle {

	@Override
	public int noOfWheels() {
		
		return 4;
	}

}
