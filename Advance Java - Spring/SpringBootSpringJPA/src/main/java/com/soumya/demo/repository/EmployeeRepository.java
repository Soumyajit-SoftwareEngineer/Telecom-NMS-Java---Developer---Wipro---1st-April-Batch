package com.soumya.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.demo.data.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,  Integer> {
	
	

}
