package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		
		List list = echo.getValueList();
		for (Object s : list) {
			System.out.println(s);
		}
		
		echo.getAnotherBean().getInfo();
		
		System.out.println("===============================");

	}

}
