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

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main ===================== ");
		return "main";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(Model m, HttpServletRequest request) {
		System.out.println("redirect 호출 ===================== ");
		m.addAttribute("userid", "홍길동");
		request.setAttribute("passwd", "1234");
		return "redirect:main";
		/* return "redirect:main?userid=aaaaa"; */
	}
	
	@RequestMapping(value = "/forward", method = RequestMethod.GET)
	public String forward(Model m, HttpServletRequest request) {
		System.out.println("redirect 호출 ===================== ");
		m.addAttribute("userid", "홍길동");
		request.setAttribute("passwd", "1234");
		return "forward:main";
	}
	
}


// NullpointerExeption.class