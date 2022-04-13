package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:person.xml");
		
		Person p1 = ctx.getBean("onePerson", Person.class);
		System.out.println(p1);
		
		Cat c1 = p1.getCat();
		System.out.println(c1);
		
		Dog d1 = p1.getDog();
		System.out.println(d1);
		
		System.out.println("===================================");
		

	}

}
