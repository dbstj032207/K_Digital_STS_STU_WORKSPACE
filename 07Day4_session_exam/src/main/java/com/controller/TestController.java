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
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("TestController.loginForm get 요청됨 ===================");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println("login Session설정 ===== " + dto);
		LoginDTO memdto = (LoginDTO)session.getAttribute("member");
		System.out.println("memdto: " + memdto);
		System.out.println("dto: " + dto);
		if(memdto != null) {
			if(memdto.getUserid().equals(dto.getUserid()) && memdto.getPasswd().equals(dto.getPasswd())) {
				System.out.println("회원정보 일치");
				session.setAttribute("login", dto);
				return "logined";
			}else {
				System.out.println("회원정보 불일치");
				return "redirect:login";
			}
		}else {
			System.out.println("회원가입 미 진행");
			return "redirect:login";
		}

	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String memberForm() {
		System.out.println("TestController.loginForm get 요청됨 ===================");
		return "memberForm";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String member(LoginDTO dto, HttpSession session) {
		System.out.println("login Session설정 ===== " + dto);
		session.setAttribute("member", dto);
		return "redirect:main";
	}
	
}
