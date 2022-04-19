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

	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()함수 실행됨 ===================");
		return "main";
	}
	
	@RequestMapping(value = "/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("/hhh ===================");
		request.setAttribute("test", "홍길동");
		return "redirect:aaa";	// redirect시 request.setATT 사용이 안됨(반드시 주의할 것
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("/bbb ===================");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2");
		return mav;
	}

	// 3. 리턴타입 DTO => 모델만 알려줌, view는 유추(ccc.jsp): url이 뷰페이지의 이름이 됨
	//   1) 뷰페이지는 url.jsp
	//   2) 리턴 dto는 키가 없으므로 loginDTO가 키 값이 됨
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public LoginDTO xxx() {
		System.out.println("/ccc ===================");
		LoginDTO dto= new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value = "/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx")	// 키 값은 xxx가 됨
	public LoginDTO xxx2() {
		System.out.println("/ddd ===================");
		LoginDTO dto= new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value = "/eee", method = RequestMethod.GET)
	@ModelAttribute("yyy")	// 키 값은 yyy가 됨
	public ArrayList<String> eee() {
		System.out.println("/eee ===================");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동01");
		list.add("홍길동02");
		list.add("홍길동03");
		return list;
	}
	
	@RequestMapping(value = "/fff", method = RequestMethod.GET)
	public void fff(HttpServletRequest request) {
		System.out.println("/fff ===================");
		request.setAttribute("test", "홍길동");
	}
	
	@RequestMapping(value = "/ggg", method = RequestMethod.GET)
	public void ggg(Model m) {
		System.out.println("/ggg ===================");
		m.addAttribute("test", "홍길동");
	}
		

}
