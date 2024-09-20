package com.example.Spring_Actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello, Sankey";
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "hello...... and hi ";
	}
}
