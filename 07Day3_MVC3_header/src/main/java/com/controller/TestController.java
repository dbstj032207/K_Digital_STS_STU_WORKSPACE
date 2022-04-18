package com.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping("/header")
	public String xxx(HttpServletRequest request) {
		Enumeration<String> keys = request.getHeaderNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = request.getHeader(key);
			System.out.println(key + "\t" + value);
		}
		return "hello";
	}
	
}
