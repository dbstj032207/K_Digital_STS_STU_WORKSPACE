package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;
import com.service.DeptService2;

public class DeptTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		
		DeptService2 service2 = ctx.getBean("xxx", DeptService2.class);
		
		System.out.println(service);
		System.out.println(service.getService());
		
		System.out.println("=====================================");
		
		System.out.println(service2);
		System.out.println(service2.getService());

	}

}
