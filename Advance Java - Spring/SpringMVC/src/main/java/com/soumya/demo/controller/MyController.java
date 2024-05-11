package com.soumya.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
		
    // when the user gives in url as http://localhost:8089/
	// inside the controller , it will be looked for "/" and the function 
	// which below it is executed automatically
	@GetMapping ("/")
	public String displayGreeting() {
		return "welcome";
	}
	
	//http://localhost:8089/login
	@GetMapping("/login")
	public String displayLogin() {
		return "login";   //WEB-INF\jsp\login.jsp
	}
	
	@PostMapping ("/login")
	public String loginValidation(ModelMap model , @RequestParam String userID,
			@RequestParam String password) {
	System.out.println("Received data : User ID:"+ userID + "password :" + password);
	String str = "Invalid User";
	
	if(userID.equals("Soumya")&& password.equals("Admin"))
		str = "Valid User";
	
	model.put("message", str);
	return "results";
}
}
