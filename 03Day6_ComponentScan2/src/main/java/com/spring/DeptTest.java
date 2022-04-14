package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		
		System.out.println(service.getInfo());

	}

}
