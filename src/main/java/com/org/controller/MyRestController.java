package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Home ...!!";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello... EveryOne...!!!";
	}
}
