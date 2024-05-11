package com.soumya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	
	@GetMapping("/login")
	public String login(String UID, String PWD) {
		if(UID.equals("Soumya")&& PWD.equals("Admin"))
			return "You are a Valid User";
		else
			return "You are a Invalid User";
	}

}
