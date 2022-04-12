package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	public DeptDAO dao;
	
	public DeptService() {
		super();
		System.out.println("Service 기본생성자 호출됨");
	}

	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}



	public List<String> getList() {
		return dao.getList();
	}


	public DeptDAO getDao() {
		return dao;
	}


	public void setDao(DeptDAO dao) {
		System.out.println("set함수 호출 ========================== ");
		this.dao = dao;
	}
	
	
}
