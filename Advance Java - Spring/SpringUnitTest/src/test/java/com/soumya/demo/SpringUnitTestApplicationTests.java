package com.soumya.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soumya.demo.controller.MyController;

@SpringBootTest
class SpringUnitTestApplicationTests {
	
	@Autowired
	MyController myController;

	@Test
	void contextLoads() {
		
		String UID="Soumya", PWD="Admin";
		String strValidUser = "You are a Valid User";
		String strInvalidUser= "You are an Invalid User";
		
		String strResult = myController.login(UID, PWD);
		assertEquals(strValidUser,strResult);
	}

}
