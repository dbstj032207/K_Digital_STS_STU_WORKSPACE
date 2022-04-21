package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/login")
	private String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {
		// model => 메세지 전달, session => 로그인 정보 저장

		MemberDTO dto = service.login(map);
		
		if(dto != null) {	// 회원인 경우
			session.setAttribute("login", dto);
			return "main";
		}else {	// 회원이 아닌 경우
			model.addAttribute("mesg", "아이디 또는 비번이 잘못되었습니다.");
			return "loginForm";
		}
	}
	
	@RequestMapping(value = "/loginCheck/logout")
	private String logout(HttpSession session) {
		session.invalidate();
		
		// return "main";	// 두단계 이상 주소 사용시 URL에 기존 주소가 남게 되어 그냥 "main"사용하면 안됨
		// return "../";	// .xml에 설정 main.jsp
			
		return "redirect:../"; // .xml에 설정 main.jsp ../을 이용하여 loginCheck의 상위 주소로 이동
		// 회원 전용 페이지는 servlet-context.xml에 주소등록 후 이용
	}
	
	
}
