package com.munib.dash.controllers;

import org.springframework.web.bind.annotation.*;

@RestController(value="/home")
public class HomeController {
	
	@GetMapping(value="/hello")
	public String hello() throws Exception {
		String message = "Hello From Home Controller";
		System.out.println(message);
		return message;
	}

}
