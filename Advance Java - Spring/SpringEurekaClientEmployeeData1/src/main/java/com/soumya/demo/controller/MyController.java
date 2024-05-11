package com.soumya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/getDataWithID/{id}")
	public String getDataWithID(@PathVariable int id) {
		System.out.println("Received ID from Client is : "+ id);
		if(id == 101)
			return "Soumya";
		else if(id == 102)
			return "Charan Sir";
		else if (id == 103)
			return "Sakshi";
		else if (id == 104)
			return "Ankita";
		else if (id == 105)
			return "Trupti";
		
		return "Invalid Employee";
					
	}

}
