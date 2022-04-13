package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	String username;
	int age;
	//***************************************************************//
	@Autowired	// 필수, 자동주입 (byType)
	Cat cat;
	
	@Autowired
	Dog dog;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String username, int age, Cat cat, Dog dog) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
		this.dog = dog;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat getCat() {
		return cat;
	}
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	//@Required	// injection필수 요청- 반드시 주입 받아야 함	
	//set함수 위에 선언
	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + ", dog=" + dog + "]";
	}

	

}
