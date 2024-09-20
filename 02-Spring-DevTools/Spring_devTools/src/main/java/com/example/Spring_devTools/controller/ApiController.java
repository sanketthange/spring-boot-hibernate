package com.example.Spring_devTools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/message")
	public String  getMessage() {
		return "Hi, I a sanket";
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello Sanket";
	}
}
