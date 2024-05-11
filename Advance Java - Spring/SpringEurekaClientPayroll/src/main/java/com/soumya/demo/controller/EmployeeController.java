package com.soumya.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping ("/getEmployeeData/{id}")
	public String getEmployeeData(@PathVariable int id) {
		System.out.println("Obtained ID from the User is : " + id);
		
		String strURL = "http://EMPLOYEE/getDataWithID/"+ id;
		String str = restTemplate.getForObject(strURL, String.class);
		return str;
	}
	

}
