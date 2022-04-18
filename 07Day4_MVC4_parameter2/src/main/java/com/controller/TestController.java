package com.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm get 요청됨 ===================");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println("Login1.post ========== " + dto);
		return "login1";
	}
	
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx") LoginDTO dto) {	// dto의 키값을 xxx로 설정
		System.out.println("login3.post ========== " + dto);
		return "login3";
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		System.out.println("Login2.mav ========== " + dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("login", dto);
		mav.setViewName("login2");
		return mav;
	}
	
	@RequestMapping(value = "/login4", method = RequestMethod.POST)
	public String login4(LoginDTO dto, Model m) {
		System.out.println("login4.post ========== " + dto);
		m.addAttribute("login", dto);
		return "login4";
	}
	
}
