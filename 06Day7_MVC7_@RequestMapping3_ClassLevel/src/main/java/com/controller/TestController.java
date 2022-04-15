package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/login")
	public String x() {
		System.out.println("TestController.x() ============ ");
		return "login";
	}
	
	@RequestMapping(value = "/main")
	public String x2() {
		System.out.println("TestController.x() ============ ");
		return "main";
	}
	
}
