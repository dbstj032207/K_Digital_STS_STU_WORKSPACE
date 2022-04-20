package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.DeptDTO;
import com.member.service.MemberService;

@Controller
public class MainController {

	@Autowired
	MemberService service;
	
	@RequestMapping("/list")
	public String list(Model m) {
		System.out.println("list() =========== ");
		List<DeptDTO> list = service.list();
		System.out.println(list);
		m.addAttribute("list", list);
		return "list";	
	}
	
	@RequestMapping("/add")
	public String add(DeptDTO dto) {
		System.out.println(dto);
		int n = service.add(dto);
		System.out.println(n + "개 삽입됨");
		return "redirect:list";	
	}
	
	@RequestMapping("/update")
	public String update(DeptDTO dto) {
		System.out.println(dto);
		int n = service.update(dto);
		System.out.println(n + "개 수정됨");
		return "redirect:list";	
	}
	
	@RequestMapping("/del")
	public String del(String deptno) {
		System.out.println(deptno);
		int n = service.del(Integer.parseInt(deptno));
		System.out.println(n + "개 삭제됨");
		return "redirect:list";	
	}
	
	
}
