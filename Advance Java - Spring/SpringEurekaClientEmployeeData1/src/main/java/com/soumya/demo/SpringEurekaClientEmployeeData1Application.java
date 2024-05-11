package com.soumya.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaClientEmployeeData1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientEmployeeData1Application.class, args);
	}

}
