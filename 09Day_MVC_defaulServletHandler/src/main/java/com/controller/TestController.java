package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	
	
	@RequestMapping("/home")
	public String aaa() {
		return "main";
	}
	
	// servlet-context.xml에서 /요청 처리함 => main.jsp
	
	
}
