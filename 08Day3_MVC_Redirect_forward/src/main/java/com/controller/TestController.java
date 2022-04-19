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

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		System.out.println("/ ===================== ");
		return "main";
	}
	
	
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("/aaa ===================== ");
		return "main";
	}
	
	@RequestMapping(value = {"/aaa2", "/aaa3"}, method = RequestMethod.GET)
	public String aaa2() {
		System.out.println("/aaa2 /aaa3 ===================== ");
		return "main";
	}
	
	@RequestMapping(value = "/bbb*", method = RequestMethod.GET)
	public String aaa3() {
		System.out.println("/aaa3 ===================== ");
		return "main";
	}
	
	@RequestMapping(value = "/ccc/*", method = RequestMethod.GET)
	public String aaa4() {
		System.out.println("/aaa4 ===================== ");
		return "main";
	}
	
	@RequestMapping(value = "/ddd/**", method = RequestMethod.GET)
	public String aaa5() {
		System.out.println("/aaa5 ===================== ");
		return "main";
	}
	
	@RequestMapping(value = "/eee/**/aaa", method = RequestMethod.GET)
	public String aaa6() {
		System.out.println("/aaa6 ===================== ");
		return "main";
	}
	
	@RequestMapping(value = "/hhh/{userid}/xxx/{passwd}", method = RequestMethod.GET)
	public String aaa7(@PathVariable("userid") String userid, @PathVariable("passwd") String passwd) {
		System.out.println("/aaa7 ===================== ");
		System.out.println(userid + "\t" + passwd);
		return "main";
	}
		
}


// NullpointerExeption.class