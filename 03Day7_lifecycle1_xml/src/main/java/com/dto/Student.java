package com.dto;

public class Student {
	
	private String name;
	private int age;
	
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
