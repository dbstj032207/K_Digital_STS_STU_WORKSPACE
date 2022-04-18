package com.controller;

import java.util.ArrayList;
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
	
	@RequestMapping("xxx")
	public ArrayList<String> getList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return list;
	}
	

	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list){
		System.out.println("aaa 추가 요청 작업");
		list.add("aaaa");
		return "main2";
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("bbb 추가 요청 작업");
		list.add("bbb");
		return "main2";
	}

	
}
