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
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println("login Session설정 ===== " + dto);
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String login2(LoginDTO dto, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println("login2 Session설정 ===== " + dto);
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
}
