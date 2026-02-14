package com.adi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

	@Autowired
	@Qualifier("fourWheelerBean")
	//@Qualifier("twoWheelerBean")
	private Vehicle vehicle;
	
	@Autowired
	//@Qualifier("FirstEmployee")
	private Employee employee;
	
    @GetMapping("/noOfWheels")
	public int getVehicleWheels() {
		return vehicle.noOfWheels();
		
	}
    
    @GetMapping("/getEmployee")
	public String getEmpData() {
		return employee.getId()+""+employee.getName();
		
	}
}
