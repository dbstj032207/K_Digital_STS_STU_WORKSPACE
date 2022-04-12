package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new 
        		GenericXmlApplicationContext("classpath:stu.xml");
		
		Student s1 = ctx.getBean("xxx", Student.class);
		s1.setAge(10);
		s1.setName("홍길동");
		System.out.println(s1);
		
		Student s2 = (Student)ctx.getBean("xxx");
		s2.setAge(20);
		s2.setName("이순신");
		System.out.println(s2);

	}

}
