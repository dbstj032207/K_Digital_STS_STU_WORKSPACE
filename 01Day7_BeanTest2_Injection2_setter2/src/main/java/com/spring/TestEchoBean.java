package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestEchoBean {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);

		AnotherBean anthoer = echo.getXxx();
		System.out.println(anthoer.getName() + "\t" + anthoer.getAge());

	}

}
