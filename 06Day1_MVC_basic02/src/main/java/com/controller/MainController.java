package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa()함수 호출 ===================");
		return "home";
	}
	
	@RequestMapping("/aaa2")
	public String tttt() {
		System.out.println("aaa2()함수 호출 ===================");
		return "test";
	}
	
}
