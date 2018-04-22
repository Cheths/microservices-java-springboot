package com.chethan.microservices.user_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@GetMapping("/")
	public String testMessage() {
		return "This is User Service.";
	}
	
	@GetMapping("/message")
	public String sendMessage() {
		return "Hi! This is a Rest Service.- User Service";
	}
}
