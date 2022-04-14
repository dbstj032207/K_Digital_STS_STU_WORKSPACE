package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dao.DeptDAO;

public class DeptService {
	
	@Resource
	public DeptDAO dao;
	
	@Value("${jdbc.driver}")
	String driver;
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.userid}")
	String username;
	@Value("${jdbc.passwd}")
	String password;
	
	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
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
		this.dao = dao;
	}


	@Override
	public String toString() {
		return "DeptService [dao=" + dao + ", driver=" + driver + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
}
