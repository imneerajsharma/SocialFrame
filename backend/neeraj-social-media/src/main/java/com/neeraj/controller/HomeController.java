package com.neeraj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@GetMapping
	public String homeControllerHandler() {
		return "this is home controller";
	}
	@GetMapping("/home")
	public String homeControllerHandler2() {
		return "this is home controller2";
	}
	
	@GetMapping("/codewithneeraj")
	public String homeControllerHandler3() {
		return "Hello code with neeraj sharma....";
	}
	
//	@PutMapping	
//	@PostMapping
//	@DeleteMapping

}
