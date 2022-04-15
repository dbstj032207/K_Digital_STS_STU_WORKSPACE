package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/login")
	public String x() {
		System.out.println("HelloController.x() ======== ");
		return "login";
	}
	
}
