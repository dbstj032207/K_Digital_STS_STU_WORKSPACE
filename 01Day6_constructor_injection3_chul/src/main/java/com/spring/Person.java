package com.spring;

public class Person {

	String username;
	int age;
	
	// 기본생성자
	public Person() {
		super();
		System.out.println("Person 기본생성자 호출");
	}

	// 멤버변수가 포함된 생성자
	public Person(String username, int age) {
		super();
		this.username = username;
		this.age = age;
		System.out.println("Person 생성자 호출" + username +"\t" + age);
	}
	
	public String getInfo() {
		return "홍길동";
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + "]";
	}
	

	
	

}
