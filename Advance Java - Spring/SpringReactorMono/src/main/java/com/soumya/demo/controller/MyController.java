package com.soumya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class MyController {

	@GetMapping("getName")
	public Mono<String> getName(){
		return Mono.just("My name is Soumyajit Mondal").log();
	
	}

}
