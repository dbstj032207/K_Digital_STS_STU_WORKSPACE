package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String main() {
		System.out.println("HomeController.main ===================== ");
		return "main";	
	}
}
