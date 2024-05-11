package com.soumya.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.demo.data.Employee;
import com.soumya.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepository;
	
	@GetMapping("getAllEmployee")
	public List<Employee> getAllEmployees(){
		List<Employee> empLst = empRepository.findAll();
		return empLst;
	}
	
	//Insert the data
	@PostMapping("/insertData")
	public String insertData(@RequestBody Employee empObj) {
		System.out.println("Given Object is : "+empObj);
		empRepository.save(empObj);
		
		String strReturn = "Record Inserted in Database Successfully";
		return strReturn;
	}
	
	@PutMapping ("/updateData")
	public String updateData(@RequestBody Employee empObj) {
		System.out.println("Given Object to Update is : "+empObj);
		empRepository.save(empObj);
		
		String strReturn = "Record Updated in Database Successfully";
		return strReturn;
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable Employee empObj) {
		System.out.println("Given Object to Delete is : "+empObj);
		empRepository.save(empObj);
		
		String strReturn = "Record Deleted in Database Successfully";
		return strReturn;
	}

}
