package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/memberAdd")
	private String memberAdd(MemberDTO m, Model model) {
		System.out.println(m);
		int n = service.memberAdd(m);
		System.out.println("insert 개수: " + n);
		model.addAttribute("success", "회원가입성공");
		return "main";
	}
	
	@RequestMapping(value = "/loginCheck/myPage")
	private String myPage(HttpSession session) {
		
		MemberDTO dto = (MemberDTO)session.getAttribute("login");

		MemberDTO dto_m = service.myPage(dto.getUserid());

		session.setAttribute("login", dto_m);
		
		return "redirect:../myPage";	// servlet-context.xml에 등록
	}
}
