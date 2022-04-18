package com.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping("/")
	public String xx() {
		System.out.println("main()=================");
		return "main";
	}
	
	@RequestMapping("/aaa")
	public ModelAndView xxx2() {
		System.out.println("/aaa ====================== ");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");	// 넘어갈 데이터
		mav.addObject("age", "20");
		LoginDTO dto = new LoginDTO("test");
		mav.addObject("login", dto);
		mav.setViewName("main2");	// 넘어갈 페이지
		return mav;
	}
	
}
