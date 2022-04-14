package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	private String name;
	private int age;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy() =====");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet() ===== ");
	}
	
	public void getInfo() {
		System.out.println("getInfo() =============");
	}

	public void aaa() {
		System.out.println("init-method.aaa");
	}
	
	public void bbb() {
		System.out.println("destroy-method.bbb");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
