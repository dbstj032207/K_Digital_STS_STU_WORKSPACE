package com.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;

import javax.jws.WebParam.Mode;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {

	// main: interceptor를 통해 session로그인 정보 있으면 main.jsp
	// 로그인 정보가 없는 경우 loginForm.jsp
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("TestController.main ===================== ");
		return "main";	
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm ===================== ");
		return "loginForm"; 
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(String userid, String passwd, HttpSession session) {
		System.out.println("TestController.loginForm ===================== ");
		session.setAttribute("login", userid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", userid);
		mav.addObject("passwd", passwd);
		mav.setViewName("logined");
		return mav; 
	}
	
}
