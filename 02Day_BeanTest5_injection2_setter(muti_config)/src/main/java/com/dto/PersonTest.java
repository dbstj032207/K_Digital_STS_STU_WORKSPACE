package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo1.xml", "classpath:echo2.xml");
		
		Person p1 = ctx.getBean("onePerson", Person.class);
		System.out.println(p1);
		
		Cat c1 = p1.getCat();
		System.out.println(c1);
		
		System.out.println("===================================");
		

	}

}
