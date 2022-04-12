package com.spring;

public class Person {

	
	// 기본생성자
	public Person() {
		super();
		System.out.println("Person 기본생성자 호출");
	}

	// String 멤버변수가 1개 포함된 생성자
	public Person(String x) {
		super();
		System.out.println("Person 생성자 호출" + x);
	}
	
	// String 멤버변수가 2개 포함된 생성자
	public Person(String x, String y) {
		super();
		System.out.println("Person 생성자 호출" + x +"\t" + y);
	}

	// String 멤버변수와 int 멤버변수가 포함된 생성자
	public Person(String xx, int yy) {
		super();
		System.out.println("Person 생성자 호출" + xx +"\t" + yy);
	}
	
	public String getInfo() {
		return "홍길동";
	}

	
	

}
