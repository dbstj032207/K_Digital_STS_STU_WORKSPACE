package com.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/idDuplicateCheck", produces = "test/plain;charset=UTF-8")
	@ResponseBody // .jsp 이동하지 않고 그냥 string만 전달(페이지이동x)
	private String idDuplicateCheck(@RequestParam("id") String userid) {
		
		MemberDTO dto = service.myPage(userid);
		
		System.out.println("idDuplicateCheck ==== " + userid);
		
		String mesg = "아이디 사용가능";
		
		if(dto != null) {
			mesg = "아이디 중복";
		}
		return mesg;
	}
}
