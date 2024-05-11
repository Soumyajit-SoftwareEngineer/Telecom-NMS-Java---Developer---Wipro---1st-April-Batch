package com.soumya.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.demo.data.Employee;

@RestController
public class MyController {

	@GetMapping ("/welcome")
	public String welcomeMessage() {
		String str = "Welcome to Spring REST from Soumya...";
		return str;
	}
	
	//Read the parameter from the client.
	@GetMapping ("/login")
	public String loginValidation(@RequestParam String UID, @RequestParam String pwd) {
		System.out.println("Given credentials are : Login" + UID+ "Password:" +pwd);
		if (UID.equals("Soumya")&& pwd.equals("Admin"))
			return "You are a valid user";
		else
			return "Invalid user !! Check your credentials";
	}
	
	@PostMapping("/insertData")
	public String insertData(@RequestBody Employee empObj) {
		System.out.println("Given data from client is : " + empObj);
		return "Given data is inserted in the database successfully...";
	}
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody Employee empObj) {
		System.out.println("Given Object to update is : "+empObj);
		return "Given data is updated in the database successfully...";
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteByID(@PathVariable int id) {
		String strReturn = "Employee with id "+"is deleted successfully from the database";
		return strReturn;
	}
	
}
