package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	
	// home: interceptor를 통해 session로그인 정보 있으면 main.jsp
	// 로그인 정보가 없는 경우 loginForm.jsp
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String main() {
		System.out.println("HomeController.main ===================== ");
		return "main";	
	}
}
