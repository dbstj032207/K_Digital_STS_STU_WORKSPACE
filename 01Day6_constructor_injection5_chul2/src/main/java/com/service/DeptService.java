package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	public DeptDAO dao;
	
	// 기본 생성자로 변경
	public DeptService() {	
		System.out.println("public DeptService() 생성자 호출됨");
		this.dao = new DeptDAO();
	}
	
	public List<String> getList() {
		return dao.getList();
	}
}
