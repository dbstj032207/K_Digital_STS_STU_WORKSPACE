package com.spring;

public class Person {
	
	String name;
	
	// 기본생성자
	public Person() {}

	// 멤버변수가 포함된 생성자
	public Person(String x) {
		super();
		this.name = x;
		System.out.println("Person 생성자 호출" + x);
	}

	public String getInfo() {
		return "홍길동";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
