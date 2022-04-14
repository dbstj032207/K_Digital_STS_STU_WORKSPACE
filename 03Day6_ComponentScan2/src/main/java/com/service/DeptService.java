package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entry.DeptDTO;

@Service
@Scope(value = "singleton")
public class DeptService {

	@Autowired
	DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	public DeptDTO getInfo() {
		return dao.getInfo();
	}
	
}
