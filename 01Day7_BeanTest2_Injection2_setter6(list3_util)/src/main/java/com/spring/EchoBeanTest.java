package com.spring;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		
		
		List<AnotherBean> anotherBean_list =  echo.getValueList();
		for (AnotherBean a : anotherBean_list) {
			System.out.println(a.getName());
		}
		
		System.out.println("===============================");
		
		AnotherBean anotherBean = echo.getAnotherBean();
		System.out.println(anotherBean);
		anotherBean.getInfo();
	}

}
