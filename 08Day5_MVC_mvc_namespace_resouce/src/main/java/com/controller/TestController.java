package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	
	
	@RequestMapping("/")
	public String ttt() {
		return "home";
	}
	
	// servlet-context.xml에서 /main요청 처리함
	@RequestMapping("/aaa")
	public String main() {
		return "main";
	}
	
	
}
