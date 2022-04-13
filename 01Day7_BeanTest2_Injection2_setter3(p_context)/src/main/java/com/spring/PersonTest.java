package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:person.xml");
		
		Person p = ctx.getBean("one", Person.class);
		System.out.println(p);
		
		Cat c = p.getCat();
		System.out.println(c);

	}

}
